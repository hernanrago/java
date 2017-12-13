package entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "autos")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private int anoModelo;
    private Date fechaVenta;
    private String marca;
    private String modelo;
    private float precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anoModelo, String fechaVenta, float precio) {
        this.anoModelo = anoModelo;
        this.fechaVenta = Date.valueOf(fechaVenta);
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = Date.valueOf(fechaVenta);
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", año del modelo=" + anoModelo +
                ", fecha de venta=" + fechaVenta +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=U$S" + precio +
                '}';
    }
}
