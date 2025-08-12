package Ejercicio25;

public class Viaje {
    private int codigo;
    private String destino;
    private String hotel;
    private String regimenAlojamiento;
    private int precio;

    public Viaje(int codigo, String destino, String hotel, String regimenAlojamiento, int precio) {
        this.codigo = codigo;
        this.destino = destino;
        this.hotel = hotel;
        this.regimenAlojamiento = regimenAlojamiento;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getRegimenAlojamiento() {
        return regimenAlojamiento;
    }

    public void setRegimenAlojamiento(String regimenAlojamiento) {
        this.regimenAlojamiento = regimenAlojamiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "codigo=" + codigo +
                ", destino='" + destino + '\'' +
                ", hotel='" + hotel + '\'' +
                ", regimenAlojamiento='" + regimenAlojamiento + '\'' +
                ", precio=" + precio +
                '}';
    }
}

