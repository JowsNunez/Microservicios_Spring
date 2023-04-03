/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_inventario.controller;


import com.nunez.jose.micro_inventario.service.IUnidadService;
import com.nunez.jose.micro_inventario.entity.UnidadMedida;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("unidad")
public class UnidadRestController {

    @Autowired
    private IUnidadService<UnidadMedida> _UnidadService;

    @GetMapping
    public Iterable<UnidadMedida> getAll() {
        return _UnidadService.getAll();
    }

    @PostMapping
    public UnidadMedida create(@RequestBody UnidadMedida newUnidad) {
        return _UnidadService.create(newUnidad);
    }

    @GetMapping("/{id}")
    public UnidadMedida getById(@PathVariable Integer id) {
        return _UnidadService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        _UnidadService.delete(id);
    }
}
