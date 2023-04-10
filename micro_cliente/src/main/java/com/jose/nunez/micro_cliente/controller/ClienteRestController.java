/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.jose.nunez.micro_cliente.controller;



import com.jose.nunez.micro_cliente.service.IClienteService;
import com.jose.nunez.micro_cliente.entity.Cliente;

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
@RequestMapping("cliente")
public class ClienteRestController {

    @Autowired
    private IClienteService<Cliente> _ClienteService;

    @GetMapping
    public Iterable<Cliente> getAll() {
        return _ClienteService.getAll();
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente newCliente) {
        return _ClienteService.create(newCliente);
    }

    @GetMapping("/{id}")
    public Cliente getById(@PathVariable Integer id) {
        return _ClienteService.getById(id);
    }
    @GetMapping("/filter")
    public Cliente getByIdRfc(@RequestParam(required = false) Integer id,
    @RequestParam(required = false) String rfc) {

        if(id!=null)  return _ClienteService.getById(id);
        
        if(rfc!=null)  return _ClienteService.getByRfc(rfc);

        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        _ClienteService.delete(id);
    }

    @PutMapping("/{id}")
    public Cliente getById(@RequestBody Cliente cliente,@PathVariable Integer id) {
      
        return _ClienteService.update(cliente,id);
    }

}
