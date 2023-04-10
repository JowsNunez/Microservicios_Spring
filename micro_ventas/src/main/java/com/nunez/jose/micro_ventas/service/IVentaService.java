/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_ventas.service;


import org.springframework.stereotype.Service;

import com.nunez.jose.micro_ventas.dto.VentaDTO;

/**
 *
 * @author Jose
 * @param <T>
 */
@Service
public interface IVentaService<T> {
    
    Iterable<T> getAll();
    T getById(Integer id);
    T create(T entity);
    void delete(Integer id);
    VentaDTO findByClienteFolioIdVenta(Integer idCliente,String folio,Integer idVenta, String fecha);
    
    
}
