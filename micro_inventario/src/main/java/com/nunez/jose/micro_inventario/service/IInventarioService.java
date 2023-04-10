/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_inventario.service;

import org.springframework.stereotype.Service;


/**
 *
 * @author Jose
 * @param <T>
 */
@Service
public interface IInventarioService<T> {
    
    Iterable<T> getAll();
    T getById(Integer id);
    T create(T entity);
    void delete(Integer id);
    T getByIdProducto(Integer id);
    T update(Integer id, Integer cantidad);
    
}
