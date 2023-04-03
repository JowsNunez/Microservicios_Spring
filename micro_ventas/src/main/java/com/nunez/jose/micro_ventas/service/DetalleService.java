/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_ventas.service;


import com.nunez.jose.micro_ventas.entity.Detalle;
import com.nunez.jose.micro_ventas.repository.IDetalleRepository;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 */

@Component
public class DetalleService implements IDetalleService<Detalle> {

    @Autowired
    private IDetalleRepository _detalleRepository;


    @Override
    public Iterable<Detalle> getAll(){
        return _detalleRepository.findAll();
    }

    @Override
    public Detalle getById(Integer id){
        Optional<Detalle> opt = _detalleRepository.findById(id);
        return opt.get();
    }

    @Override
    public Detalle create(Detalle entity){
        return _detalleRepository.save(entity);
    }

    @Override
    public void delete(Integer id){
         _detalleRepository.deleteById(id);
    }

} 
