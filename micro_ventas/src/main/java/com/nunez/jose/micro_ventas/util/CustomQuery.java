package com.nunez.jose.micro_ventas.util;

public class CustomQuery {

     // query sql para filtrar las ventas por idVenta o idCliente y folio o idCliente y fecha
     public final static String buscarClienteFolioId="SELECT DISTINCT d FROM Detalle d INNER JOIN Venta " +
     "v ON  v.id = :idVenta OR (v.idCliente.id = :idCliente  AND v.folio = :folio) OR (v.idCliente.id = :idCliente  AND v.fecha = :fecha)" +
     "INNER JOIN Producto p ON p.id = d.idProducto.idProducto INNER JOIN Cliente c";


   
}
