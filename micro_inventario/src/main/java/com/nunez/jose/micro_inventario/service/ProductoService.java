/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_inventario.service;


import com.nunez.jose.micro_inventario.entity.Producto;
import com.nunez.jose.micro_inventario.repository.IProductoRepository;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 */

@Component
public class ProductoService implements IProductoService<Producto> {

    @Autowired
    private IProductoRepository _productoRepository;


    @Override
    public Iterable<Producto> getAll(){
        return _productoRepository.findAll();
    }

    @Override
    public Producto getById(Integer id){
        Optional<Producto> opt = _productoRepository.findById(id);
        return opt.get();
    }

    @Override
    public Producto create(Producto entity){
        return _productoRepository.save(entity);
    }

    @Override
    public void delete(Integer id){
         _productoRepository.deleteById(id);
    }

} 
