/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.jose.nunez.micro_cliente.service;

import com.jose.nunez.micro_cliente.entity.Cliente;
import com.jose.nunez.micro_cliente.repository.IClienteRepository;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 */

@Component
public class ClienteService implements IClienteService<Cliente> {

    @Autowired
    private IClienteRepository _clienteRepository;

    @Override
    public Iterable<Cliente> getAll() {
        return _clienteRepository.findAll();
    }

    @Override
    public Cliente getById(Integer id) {
        Optional<Cliente> opt = _clienteRepository.findById(id);
        return opt.get();
    }

    @Override
    public Cliente create(Cliente entity) {
        return _clienteRepository.save(entity);
    }

    @Override
    public void delete(Integer id) {
        _clienteRepository.deleteById(id);
    }

    @Override
    public Cliente update(Cliente cliente, Integer id) {
        Cliente aux = _clienteRepository.findById(id).get();
        aux.setContrasena(cliente.getContrasena());
        aux.setNombre(cliente.getNombre());
        aux.setRfc(cliente.getRfc());
        aux.setTelefono(cliente.getTelefono());
        aux.setCorreo(cliente.getCorreo());

     

        return _clienteRepository.save(aux);
    }
}
