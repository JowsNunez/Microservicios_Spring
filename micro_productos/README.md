# Productos

## GET /productos
### Parámetros
* __marca__ (opcional) Representa la marca de productos.
* __codigo__ (opcional) Representa el codigo de productos.
### Respuesta
La respuesta incluye una lista de todos los productos registrados en la base de datos.

## POST /productos
### Body
Un objeto JSON que representa la información del producto a crear.
### Respuesta
Regresa el objeto JSON que representa el producto creado.

## GET /productos/{id}
### Parámetros
* __id__ El id del producto a buscar.
### Respuesta
Regresa el objeto JSON que representa el producto encontrado.

## DELETE /productos/{id}
### Parámetros
* __id__ El id del producto a eliminar.
### Respuesta
Regresa una respuesta vacía si el producto fue eliminado exitosamente.

## PUT /productos/{id}
### Parámetros
* __id__ El id del producto a actualizar.
### Body
Un objeto JSON que representa la información actualizada del producto.
### Respuesta
Regresa el objeto JSON que representa el producto actualizado.


# UnidadMedida
## GET /unidad

### Respuesta
La respuesta incluye una lista de todas las Unidades de Medida registradas en la base de datos.

## POST /unidad
### Body
Un objeto JSON que representa la información de la unidad de medida a crear.
### Respuesta
Regresa el objeto JSON que representa la unidad de medida creada.

## GET /unidad/{id}
### Parámetros
* __id__ El id de la unidad a buscar.
### Respuesta
Regresa el objeto JSON que representa la unidad de medida encontrada.

## DELETE /unidad/{id}
### Parámetros
* __id__ El id de la unidad a eliminar.
### Respuesta
Regresa una respuesta vacía si la unidad fue eliminada exitosamente.

## PUT /unidad/{id}
### Parámetros
* __id__ El id de la unidad a actualizar.
### Body
Un objeto JSON que representa la información actualizada de la unidad.
### Respuesta
Regresa el objeto JSON que representa la unidad actualizada.

