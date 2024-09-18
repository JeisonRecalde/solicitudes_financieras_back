package com.centaurosbank.sastc.infrastructure;

import com.centaurosbank.sastc.domain.SolicitudTarjeta;
import org.springframework.stereotype.Repository;

import java.util.*;
import static com.centaurosbank.sastc.infrastructure.GeneradorIdUnico.generarIdUnico;

@Repository
public class RepositorioSolicitudTarjetaImpl implements RepositorioSolicitudTarjeta {

    private Map<Integer, SolicitudTarjeta> solicitudes = new HashMap<>();

    @Override
    public SolicitudTarjeta crearSolicitud(SolicitudTarjeta solicitud) throws Exception {
        if (solicitud == null  || solicitud.getNombre() == null || solicitud.getNombre().isEmpty()) {
            throw new IllegalArgumentException("La solicitud es inválida");
        }
        solicitudes.put(solicitud.getId(), solicitud);
        return solicitudes.get(solicitud.getId());
    }

    @Override
    public SolicitudTarjeta consultarSolicitudPorId(int id) throws Exception {
        return solicitudes.getOrDefault(id, null);
    }

    @Override
    public List<SolicitudTarjeta> solicitudes() {
        List<SolicitudTarjeta> solicitudesActivas = new ArrayList<>();

        for (SolicitudTarjeta solicitud : solicitudes.values()) {
            if (solicitud.isActiva()) {
                solicitudesActivas.add(solicitud);
            }
        }
        return solicitudesActivas;
    }


    @Override
    public SolicitudTarjeta actualizarSolicitud(int id, SolicitudTarjeta solicitudTarjeta) throws Exception {
        if (!solicitudes.containsKey(id)) {
            throw new IllegalArgumentException("La solicitud no existe");
        }
        solicitudes.put(id, solicitudTarjeta);
        return solicitudes.get(id);
    }

    @Override
    public void eliminarSolicitud(int idSolicitud) throws Exception {
        if (!solicitudes.containsKey(idSolicitud)) {
            throw new IllegalArgumentException("La solicitud no existe");
        }

        SolicitudTarjeta solicitud = solicitudes.get(idSolicitud);
        solicitud.setActiva(false);

        solicitudes.put(idSolicitud, solicitud);

    }

}

