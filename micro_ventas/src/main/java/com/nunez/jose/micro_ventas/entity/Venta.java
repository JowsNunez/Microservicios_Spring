package com.nunez.jose.micro_ventas.entity;

import java.util.Date;

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
@Table(name="Venta")
public class Venta {

    @Id
    @Column(name="Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVenta;

    @ManyToOne
    @JoinColumn(nullable=false,name="idCliente",referencedColumnName = "Id",foreignKey = @ForeignKey(name="FK_idCliente"))
    private Cliente idCliente;
    
    private Double total;
    
    private String folio;

    private Date fecha;


    public Venta (){}

    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getFolio() {
        return folio;
    }
    public void setFolio(String folio) {
        this.folio = folio;
    }
    public Date getFecha() {
        return fecha;
    }public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Integer getIdVenta() {
        return idVenta;
    }
    public Cliente getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    
}
