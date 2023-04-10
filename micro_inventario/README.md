# Inventario

## GET /inventario
### Parámetros

### Respuesta
La respuesta incluye una lista de todo el inventario registrado en la base de datos.

## POST /inventario
### Body
Un objeto JSON que representa la información del inventario a crear.
### Respuesta
Regresa el objeto JSON que representa el inventario creado.

## GET /inventario/{id}
### Parámetros
* __id__ El id del producto en inventario a buscar.
### Respuesta
Regresa el objeto JSON que representa el inventario encontrado.

## DELETE /inventario/{id}
### Parámetros
* __id__ El id del inventario a eliminar.
### Respuesta
Regresa una respuesta vacía si el inventario fue eliminado exitosamente.

## PUT /inventario/{id}
### Parámetros
* __id__ El id del inventario a actualizar.
### Body
Un objeto JSON que representa la información actualizada del inventario.
### Respuesta
Regresa el objeto JSON que representa el inventario actualizado.
