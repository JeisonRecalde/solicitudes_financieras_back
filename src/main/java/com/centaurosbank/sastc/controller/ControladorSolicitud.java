package com.centaurosbank.sastc.controller;

import com.centaurosbank.sastc.application.ServicioSolicitud;
import com.centaurosbank.sastc.application.dtos.ActualizarSolicitudTarjetaDto;
import com.centaurosbank.sastc.application.dtos.CreacionSolicitudDto;
import com.centaurosbank.sastc.application.dtos.SolicitudTarjetaDto;
import com.centaurosbank.sastc.domain.SolicitudTarjeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/centauros-bank-api/v1/solicitudes")
@CrossOrigin(origins = "*")
public class ControladorSolicitud {


    private final ServicioSolicitud servicioSolicitud;

    @Autowired
    public ControladorSolicitud(ServicioSolicitud servicioSolicitud) {
        this.servicioSolicitud = servicioSolicitud;
    }

    @PostMapping("/solicitud-tarjeta")
    public CreacionSolicitudDto crearSolicitud(@RequestBody SolicitudTarjetaDto solicitudDto) throws Exception {
        return servicioSolicitud.crearSolicitud(solicitudDto);
    }

    @GetMapping("/{id}")
    public SolicitudTarjeta consultarSolicitudPorId(@PathVariable int id) throws Exception {
        return servicioSolicitud.consultarSolicitudPorId(id);
    }

    @GetMapping()
    public List<SolicitudTarjeta> obtenerSolicitudes() {
        return servicioSolicitud.obtenerSolicitudes();
    }

    @PutMapping("/{id}")
    public SolicitudTarjeta actualizarSolicitud(@PathVariable int id, @RequestBody ActualizarSolicitudTarjetaDto solicitud) throws Exception {
        return servicioSolicitud.actualizarSolicitud(id, solicitud);
    }

    @DeleteMapping("/{id}")
    public void eliminarSolicitud(@PathVariable int id) throws Exception {
        servicioSolicitud.eliminarSolicitud(id);
    }
}
