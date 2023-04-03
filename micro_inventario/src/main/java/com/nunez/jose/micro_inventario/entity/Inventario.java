package com.nunez.jose.micro_inventario.entity;

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
@Table(name="Inventario")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")  
    private Integer idInventario;

    @ManyToOne 
     
    @JoinColumn(nullable = false,name = "idProducto", referencedColumnName = "Id", foreignKey = @ForeignKey(name="fk_idProducto"))
    
    private Producto idProducto;

    private Integer cantidad; 
   
    public Inventario(){

    }


    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Producto getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
    public Integer getIdInventario() {
        return idInventario;
    }

    
}
