/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_inventario.service;


import com.nunez.jose.micro_inventario.entity.Inventario;
import com.nunez.jose.micro_inventario.repository.IInventarioRepository;

import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 */

@Component
public class InventarioService implements IInventarioService<Inventario> {

    @Autowired
    private IInventarioRepository _inventarioRepository;

    



    @Override
    public Iterable<Inventario> getAll(){
        return _inventarioRepository.findAll();
    }

    @Override
    public Inventario getById(Integer id){
        Optional<Inventario> opt = _inventarioRepository.findById(id);
        return opt.get();
    }

    @Override
    public Inventario create(Inventario entity){
        
      
        return _inventarioRepository.save(entity);
    }

    @Override
    public void delete(Integer id){
         _inventarioRepository.deleteById(id);
    }

    @Override
    public Inventario getByIdProducto(Integer id) {
       
       return _inventarioRepository.findByIdProducto(id);
    }

    @Override
    public Inventario update(Integer id, Integer cantidad) {
        Inventario inventario = this.getByIdProducto(id);
       
        inventario.setCantidad(cantidad);

        return _inventarioRepository.save(inventario);
    }

} 
