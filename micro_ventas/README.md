# Ventas

## GET /venta
### Respuesta
Regresa todas las ventas registradas en la base de datos.

## POST /venta
### Body
Un objeto JSON que representa la información de la venta a crear.
### Respuesta
Regresa el objeto JSON que representa la venta creada.

## PUT /venta/{id}
### Parámetros
* __id__ El id de la venta a actualizar.
### Body
Un objeto JSON que representa la información actualizada de la venta.
### Respuesta
Regresa el objeto JSON que representa la venta actualizada.

## DELETE /venta/{id}
### Parámetros
* __id__ El id de la venta a eliminar.
### Respuesta
Regresa una respuesta vacía si la venta fue eliminada exitosamente.

## GET /venta/filter?idVenta={idVenta}
### Parámetros
* __idVenta__ El id de la venta a buscar.
### Respuesta
Regresa el objeto JSON que representa la venta encontrada, incluyendo la información de los productos.
```
/venta/filter?idVenta=1
```
## GET /venta/filter?idCliente={idCliente}&folio={folio}
### Parámetros
* __idCliente__ El id del cliente dueño de la venta.
* __folio__ El número de folio de la venta.
### Respuesta
Regresa el objeto JSON que representa la venta encontrada, incluyendo la información de los productos.

```
/venta/filter?idCliente=1&folio=vi298484
```

## GET /venta/filter?idCliente={idCliente}&fecha={fecha}
### Parámetros
* __idCliente__ El id del cliente dueño de la venta.
* __fecha__ La fecha de la venta en formato "yyyy-MM-dd HH:mm:ss".

```
/venta/filter?idCliente=1&fecha=2023-04-10 12:34:56
```

### Respuesta
Regresa el objeto JSON que representa la venta encontrada, incluyendo la información de los productos.



# Detalles de venta

## __GET /detalle__
### Respuesta
La respuesta incluye una lista de todos los detalles de venta registrados en la base de datos.

## __GET /detalle/{id}__
### Parámetros
* __id__ (obligatorio) Representa el identificador del detalle de venta.
### Respuesta
La respuesta incluye la información del detalle de venta solicitado.

## __POST /detalle__
### Body
La solicitud JSON debe contener un arreglo con los detalles de venta a guardar. 
```{JSON }

[
	{
	"idVenta":{"idVenta":2},
	"idProducto":{"idProducto":1},
	"cantidad": 2 ,
	 "total":25.0},
		
	{
		"idVenta":{"idVenta":2},
	"idProducto":{"idProducto":3},
	"cantidad": 2 ,
	 "total":25.0},
	{
		"idVenta":{"idVenta":2},
	"idProducto":{"idProducto":2},
	"cantidad": 2 ,
	 "total":25.0
	}
]
```

### Respuesta
La respuesta incluye la informacón del detalle actualizado.

## __PUT /detalle{id}__
### Body
La solicitud JSON debe contener la información de un detalle de venta.

### La respuesta
Regresa una respuesta vacía si el cliente fue eliminado exitosamente.