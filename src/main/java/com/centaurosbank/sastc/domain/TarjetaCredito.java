package com.centaurosbank.sastc.domain;

public class TarjetaCredito {

    private String numeroTarjeta;
    private Cliente cliente;
    private double monto;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String numeroTarjeta, Cliente cliente, double monto) {
        this.numeroTarjeta = numeroTarjeta;
        this.cliente = cliente;
        this.monto = monto;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
}
