package com.centaurosbank.sastc.domain;

import java.math.BigDecimal;


public class SolicitudTarjeta {

    private Integer id;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String documento;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String nivelEducativo;
    private String ocupacion;
    private double ingresosMensuales;
    private Double scoreCrediticio;
    private boolean aprobado;
    private BigDecimal montoAprobado;
    private boolean activa;


    public SolicitudTarjeta() {
    }

    public SolicitudTarjeta(String nombre, String apellido, String tipoDocumento, String documento, String ciudad, String direccion, String telefono, String nivelEducativo, String ocupacion, double ingresosMensuales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nivelEducativo = nivelEducativo;
        this.ocupacion = ocupacion;
        this.ingresosMensuales = ingresosMensuales;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean estadoSolicitud) {
        this.activa = estadoSolicitud;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        this.ingresosMensuales = ingresosMensuales;
    }

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
    }

    public Double getScoreCrediticio() {
        return scoreCrediticio;
    }

    public void setScoreCrediticio(Double scoreCrediticio) {
        this.scoreCrediticio = scoreCrediticio;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public BigDecimal getMontoAprobado() {
        return montoAprobado;
    }

    public void setMontoAprobado(BigDecimal montoAprobado) {
        this.montoAprobado = montoAprobado;
    }
}
