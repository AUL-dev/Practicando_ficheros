package Ejercicio21;

import java.io.Serializable;

public class Vuelo implements Serializable {
    private int codigo;
    private String origen;
    private String destino;
    private int pasajeros;
    private int plazas;
    private static final long serialVersionUID = 1L;

    public Vuelo(int codigo, String origen, String destino, int pasajeros, int plazas) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.pasajeros = pasajeros;
        this.plazas = plazas;
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

    @Override
    public String toString() {
        return "Vuelo{" +
                "codigo=" + codigo +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", pasajeros=" + pasajeros +
                ", plazas=" + plazas +
                '}';
    }
}


