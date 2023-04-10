/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_ventas.controller;

import com.nunez.jose.micro_ventas.service.IVentaService;
import com.nunez.jose.micro_ventas.dto.VentaDTO;
import com.nunez.jose.micro_ventas.entity.Venta;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("venta")
public class VentaRestController {

    @Autowired
    private IVentaService<Venta> _VentaService;

    @GetMapping
    public Iterable<Venta> getAll() {
        return _VentaService.getAll();
    }

    @PostMapping
    public Venta create(@RequestBody Venta newVenta) {
        return _VentaService.create(newVenta);
    }

    @GetMapping("/{id}")
    public Venta getById(@PathVariable Integer id) {
        return _VentaService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        _VentaService.delete(id);
    }

    @GetMapping("/filter")
    public VentaDTO getByCliente(@RequestParam(required = false) Integer idCliente,
            @RequestParam(required = false) String folio, 
            @RequestParam(required = false) Integer idVenta,
            @RequestParam(required = false) String fecha) {
                
        return _VentaService.findByClienteFolioIdVenta(idCliente, folio, idVenta,fecha);

    }

}
