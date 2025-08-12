package Ejercicio21;

import java.io.Serializable;

public class VueloV2 implements Serializable {
    private int codigo;
    private String origen;
    private String destino;
    private int pasajeros;
    private int plazas;
    private float precio;

    private static final long serialVersionUID = 2L;

    public VueloV2(int codigo, String origen, String destino, int pasajeros, int plazas, float precio) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.pasajeros = pasajeros;
        this.plazas = plazas;
        this.precio = precio;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "VueloV2{" +
                "codigo=" + codigo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", pasajeros=" + pasajeros +
                ", plazas=" + plazas +
                ", precio=" + precio +
                '}';
    }
}
