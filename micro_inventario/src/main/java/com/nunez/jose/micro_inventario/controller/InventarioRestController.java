/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_inventario.controller;


import com.nunez.jose.micro_inventario.service.IInventarioService;
import com.nunez.jose.micro_inventario.entity.Inventario;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 * 
 */
@RestController
@RequestMapping("inventario")
public class InventarioRestController {

    @Autowired
    private IInventarioService<Inventario> _InventarioService;

    @GetMapping
    public Iterable<Inventario> getAll() {
        return _InventarioService.getAll();
    }

    @PostMapping
    public Inventario create(@RequestBody Inventario newInventario) {
        
        return _InventarioService.create(newInventario);
    }

    @GetMapping("/{id}")
    public Inventario getById(@PathVariable Integer id) {
        return _InventarioService.getByIdProducto(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        _InventarioService.delete(id);
    }

    @PutMapping("/{id}")
    public Inventario update(@PathVariable Integer id, @RequestBody Inventario inventario) {
        return _InventarioService.update(id,inventario.getCantidad());
    }

}
