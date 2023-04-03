/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_productos.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Jose
 * @param <T>
 */
@Service
public interface IProductoService<T> {
    
    Iterable<T> getAll();
    T getById(Integer id);
    T create(T entity);
    void delete(Integer id);
    T update(T entity,Integer id);
    Iterable<T> findByMarca(String marca);
    Iterable<T> findByCodigo(String codigo);
    
}
