package com.centaurosbank.sastc.infrastructure;

import com.centaurosbank.sastc.domain.SolicitudTarjeta;

import java.util.List;

public interface RepositorioSolicitudTarjeta {
    SolicitudTarjeta crearSolicitud(SolicitudTarjeta solicitud) throws Exception;
    SolicitudTarjeta consultarSolicitudPorId(int idSolicitud) throws Exception;
    List<SolicitudTarjeta> solicitudes();
    SolicitudTarjeta actualizarSolicitud(int idSolicitud, SolicitudTarjeta solicitudTarjeta) throws Exception;
    void eliminarSolicitud(int idSolicitud) throws Exception;

}
