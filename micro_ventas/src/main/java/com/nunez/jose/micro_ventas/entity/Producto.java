package com.nunez.jose.micro_ventas.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Jose
 */
@Entity
@Table(name="Producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Integer idProducto;

    private String nombre;

    private String marca;

    private Double precio;

    private String codigo;
 
    @ManyToOne
    
    @JoinColumn(nullable = false, name="unidadMedida" ,referencedColumnName = "Id",foreignKey = @ForeignKey(name="fk_unidadMedida"))
    private UnidadMedida unidadMedida;

    public Integer getIdProducto() {
        return idProducto;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public UnidadMedida getUnidadMedida() {
        return unidadMedida;
    }
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



}
