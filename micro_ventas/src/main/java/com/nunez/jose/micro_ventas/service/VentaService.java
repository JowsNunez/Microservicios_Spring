/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_ventas.service;


import com.nunez.jose.micro_ventas.entity.Venta;
import com.nunez.jose.micro_ventas.repository.IVentaRepository;

import java.util.Date;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 */

@Component
public class VentaService implements IVentaService<Venta> {

    @Autowired
    private IVentaRepository _ventaRepository;


    @Override
    public Iterable<Venta> getAll(){
        return _ventaRepository.findAll();
    }

    @Override
    public Venta getById(Integer id){
        Optional<Venta> opt = _ventaRepository.findById(id);
        return opt.get();
    }

    @Override
    public Venta create(Venta entity){
        System.out.println(entity.getIdCliente().getNombre());
        entity.setFecha(new Date());
        return _ventaRepository.save(entity);
    }

    @Override
    public void delete(Integer id){
         _ventaRepository.deleteById(id);
    }

} 
