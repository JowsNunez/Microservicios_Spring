/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_ventas.controller;


import com.nunez.jose.micro_ventas.service.IDetalleService;
import com.nunez.jose.micro_ventas.entity.Detalle;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 * 
 */
@RestController
@RequestMapping("detalle")
public class DetalleRestController {

    @Autowired
    private IDetalleService<Detalle> _DetalleService;

    @GetMapping
    public Iterable<Detalle> getAll() {
        return _DetalleService.getAll();
    }

    @PostMapping
    public List<Detalle> create(@RequestBody List<Detalle> newDetalle) {
        
        return _DetalleService.insertMany(newDetalle);
    }

    @GetMapping("/{id}")
    public Detalle getById(@PathVariable Integer id) {
        return _DetalleService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        _DetalleService.delete(id);
    }

    
}
