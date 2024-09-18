package com.centaurosbank.sastc.application;

import com.centaurosbank.sastc.application.dtos.ActualizarSolicitudTarjetaDto;
import com.centaurosbank.sastc.application.dtos.CreacionSolicitudDto;
import com.centaurosbank.sastc.application.dtos.SolicitudTarjetaDto;
import com.centaurosbank.sastc.domain.SolicitudTarjeta;
import com.centaurosbank.sastc.infrastructure.RepositorioSolicitudTarjeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

import static com.centaurosbank.sastc.infrastructure.GeneradorIdUnico.generarIdUnico;

@Service
public class ServicioSolicitud {

    private final RepositorioSolicitudTarjeta repositorioSolicitudTarjeta;
    private final VerificadorCredito verificadorCredito;

    @Autowired
    public ServicioSolicitud(RepositorioSolicitudTarjeta repositorioSolicitudTarjeta, VerificadorCredito verificadorCredito) {
        this.repositorioSolicitudTarjeta = repositorioSolicitudTarjeta;
        this.verificadorCredito = verificadorCredito;
    }

    public CreacionSolicitudDto crearSolicitud(SolicitudTarjetaDto solicitudTarjetaDto) throws Exception {
        SolicitudTarjeta solicitud = convertirDtoASolicitud(solicitudTarjetaDto);
        solicitud.setId(generarIdUnico());
        solicitud.setActiva(true);

        boolean antecedenteJudiciales = verificadorCredito.vereficacionJudicial(solicitud);

        if (antecedenteJudiciales){
            solicitud.setScoreCrediticio(0.0);
            solicitud.setAprobado(false);
            solicitud.setMontoAprobado(BigDecimal.ZERO);
        } else {
            verificadorCredito.vereficacionDataCredito(solicitud);
            verificadorCredito.vereficacionInterna(solicitud);
        }

        SolicitudTarjeta solicitudCreada = repositorioSolicitudTarjeta.crearSolicitud(solicitud);
        return new CreacionSolicitudDto(
                solicitudCreada.getId(),
                "En tramite"
        );
    }

    public SolicitudTarjeta consultarSolicitudPorId(int id) {
        try {
            SolicitudTarjeta solicitudTarjeta = repositorioSolicitudTarjeta.consultarSolicitudPorId(id);
            if (solicitudTarjeta.isActiva()){
                return solicitudTarjeta;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<SolicitudTarjeta> obtenerSolicitudes() {
        return repositorioSolicitudTarjeta.solicitudes();
    }

    public SolicitudTarjeta actualizarSolicitud(int idSolicitud, ActualizarSolicitudTarjetaDto solicitud) throws Exception {
        SolicitudTarjeta solicitudTarjeta = repositorioSolicitudTarjeta.consultarSolicitudPorId(idSolicitud);

        solicitudTarjeta.setNombre(solicitud.getNombre());
        solicitudTarjeta.setApellido(solicitud.getApellido());
        solicitudTarjeta.setCiudad(solicitud.getCiudad());
        solicitudTarjeta.setDireccion(solicitud.getDireccion());
        solicitudTarjeta.setTelefono(solicitud.getTelefono());
        solicitudTarjeta.setNivelEducativo(solicitud.getNivelEducativo());
        solicitudTarjeta.setIngresosMensuales(solicitud.getIngresosMensuales());

        return repositorioSolicitudTarjeta.actualizarSolicitud(idSolicitud, solicitudTarjeta);
    }

    public void eliminarSolicitud(int idSolicitud) throws Exception {
        repositorioSolicitudTarjeta.eliminarSolicitud(idSolicitud);
    }

    private SolicitudTarjeta convertirDtoASolicitud(SolicitudTarjetaDto solicitudTarjetaDto) {
        return new SolicitudTarjeta(
                solicitudTarjetaDto.getNombre(),
                solicitudTarjetaDto.getApellido(),
                solicitudTarjetaDto.getTipoDocumento(),
                solicitudTarjetaDto.getDocumento(),
                solicitudTarjetaDto.getCiudad(),
                solicitudTarjetaDto.getDireccion(),
                solicitudTarjetaDto.getTelefono(),
                solicitudTarjetaDto.getNivelEducativo(),
                solicitudTarjetaDto.getOcupacion(),
                solicitudTarjetaDto.getIngresosMensuales()
        );
    }
}
