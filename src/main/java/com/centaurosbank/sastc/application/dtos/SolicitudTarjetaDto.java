package com.centaurosbank.sastc.application.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


public class SolicitudTarjetaDto {

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

    public SolicitudTarjetaDto() {
    }

    public SolicitudTarjetaDto(String nombre, String apellido, String tipoDocumento, String documento, String ciudad, String direccion, String telefono, String nivelEducativo, String ocupacion, double ingresosMensuales) {
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

    public String getNivelEducativo() {
        return nivelEducativo;
    }

    public void setNivelEducativo(String nivelEducativo) {
        this.nivelEducativo = nivelEducativo;
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
}
