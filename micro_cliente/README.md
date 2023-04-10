# Cliente
## GET /cliente
### Parámetros
### Respuesta
La respuesta incluye una lista de todos los cliente registrados en la base de datos.

## POST /cliente
### Body
Un objeto JSON que representa la información del cliente a crear.

### Respuesta
Regresa el objeto JSON que representa el cliente creado.

### GET /cliente/{id}
### Parámetros
* __id__ El id del cliente a buscar.

### Respuesta
Regresa el objeto JSON que representa el cliente encontrado. En caso contrario devuelve un objeto vacio

## GET /cliente/filter
### Parámetros
* __id__(opcional) El id del cliente a buscar.
* __rfc__(opcional) El rfc del cliente a buscar.
```
{url:port}/cliente/filter?rfc=HHDFGF 
{url:port}/cliente/filter?id=1 
```
### Respuesta
Regresa el objeto JSON que representa el cliente encontrado. En caso contrario devuelve un objeto vacio

## DELETE /cliente/{id}
### Parámetros
* __id__ El id del cliente a eliminar.
### Respuesta
Regresa una respuesta vacía si el cliente fue eliminado exitosamente.

## PUT /cliente/{id}
### Parámetros
* __id__ El id del cliente a actualizar.
### Body
Un objeto JSON que representa la información actualizada del cliente.

### Respuesta
Regresa el objeto JSON que representa el cliente actualizado.