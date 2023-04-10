/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.jose.nunez.micro_cliente.service;

import org.springframework.stereotype.Service;

import com.jose.nunez.micro_cliente.entity.Cliente;

/**
 *
 * @author Jose
 * @param <T>
 */
@Service
public interface IClienteService<T> {
    
    Iterable<T> getAll();
    T getById(Integer id);
    T getByRfc(String rfc);
    T create(T entity);
    void delete(Integer id);
    T update(Cliente cliente, Integer id);
    
}
