/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_productos.service;

import org.springframework.stereotype.Service;



/**
 *
 * @author Jose
 * @param <T>
 */
@Service
public interface IUnidadService<T> {
    
    Iterable<T> getAll();
    T getById(Integer id);
    T create(T entity);
    void delete(Integer id);
    T update(T entity,Integer id);
   

    
}
