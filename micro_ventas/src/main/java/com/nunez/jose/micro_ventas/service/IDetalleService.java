/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_ventas.service;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 *
 * @author Jose
 * @param <T>
 */
@Service
public interface IDetalleService<T> {
    
    Iterable<T> getAll();
    T getById(Integer id);
    T create(T entity);
    void delete(Integer id);
    List<T> insertMany(List<T> detalleList); 
    
}
