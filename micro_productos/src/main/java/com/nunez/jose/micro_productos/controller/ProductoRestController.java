/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_productos.controller;

import com.nunez.jose.micro_productos.service.IProductoService;
import com.nunez.jose.micro_productos.entity.Producto;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 * 
 */
@RestController
@RequestMapping("producto")
public class ProductoRestController {

    @Autowired
    private IProductoService<Producto> _ProductoService;

    @GetMapping
    public Iterable<Producto> getAll(@RequestParam(required = false) String marca,
            @RequestParam(required = false) String codigo) {
        if (marca !=null && !marca.isEmpty()) {  
            return _ProductoService.findByMarca(marca);
        } else if (codigo !=null &&!codigo.isEmpty()) {
            return _ProductoService.findByCodigo(codigo);
        } 

        return _ProductoService.getAll();

    }



    @PostMapping
    public Producto create(@RequestBody Producto newProducto) {
        return _ProductoService.create(newProducto);
    }

    @GetMapping("/{id}")
    public Producto getById(@PathVariable Integer id) {
        return _ProductoService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        _ProductoService.delete(id);
    }

    @PutMapping("/{id}")
    public Producto update(@RequestBody Producto producto, @PathVariable Integer id) {

        return _ProductoService.update(producto, id);

    }

}
