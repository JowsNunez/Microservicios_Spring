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
@Table(name="Detalle")
public class Detalle {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetalle;

    @ManyToOne
    @JoinColumn(nullable =false,name="idVenta",referencedColumnName = "Id",foreignKey = @ForeignKey(name="Fk_idVenta"))
    private Venta idVenta;
    @ManyToOne
    @JoinColumn(nullable=false,name="idProducto",referencedColumnName = "Id",foreignKey = @ForeignKey(name="Fk_idProducto_detalle"))
    private Producto idProducto;

    private Integer cantidad;

    private Double total;

    public Detalle(){



    }

    public Venta getIdVenta() {
        return idVenta;
    }
    public void setIdVenta(Venta idVenta) {
        this.idVenta = idVenta;
    }

    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public Integer getIdDetalle() {
        return idDetalle;
    }

    public Producto getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }

    
}
