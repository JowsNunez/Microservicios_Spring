package com.nunez.jose.micro_ventas.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import com.nunez.jose.micro_ventas.entity.Producto;


public class VentaDTO implements  Serializable{
   
    private String nombreCliente;
    private String folioVenta;
    private Double total;
    private int cantidadProductos;
    private String fecha;
    private List<Producto> productos;
    

    public VentaDTO(){
            this.productos=new ArrayList<>();   
    }

   
    public List<Producto> getProductos() {
        return productos;
    }

  
   
    public void setProducto(List<Producto> productos) {
        this.productos = productos;
    }

    public String getFolioVenta() {
        return folioVenta;
    }
    public void setFolioVenta(String folioVenta) {
        this.folioVenta = folioVenta;
    }
    public Double getTotal() {
        return total;
    }
    public void setTotal(Double total) {
        this.total = total;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }
    public void setCantidadProductos() {
        this.cantidadProductos = this.productos.size();
    }


    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

