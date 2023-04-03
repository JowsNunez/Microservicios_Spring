/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_inventario.service;


import com.nunez.jose.micro_inventario.entity.UnidadMedida;
import com.nunez.jose.micro_inventario.repository.IUnidadRepository;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 */

@Component
public class UnidadService implements IUnidadService<UnidadMedida> {

    @Autowired
    private IUnidadRepository _unidadRepository;


    @Override
    public Iterable<UnidadMedida> getAll(){
        return _unidadRepository.findAll();
    }

    @Override
    public UnidadMedida getById(Integer id){
        Optional<UnidadMedida> opt = _unidadRepository.findById(id);
        return opt.get();
    }

    @Override
    public UnidadMedida create(UnidadMedida entity){
        return _unidadRepository.save(entity);
    }

    @Override
    public void delete(Integer id){
         _unidadRepository.deleteById(id);
    }


} 
