/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_productos.service;


import com.nunez.jose.micro_productos.entity.Producto;
import com.nunez.jose.micro_productos.entity.UnidadMedida;
import com.nunez.jose.micro_productos.repository.IProductoRepository;
import com.nunez.jose.micro_productos.repository.IUnidadRepository;

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
    @Autowired IUnidadRepository _IUnidadRepository;


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
     UnidadMedida unidad=   _IUnidadRepository.findById(entity.getUnidadMedida().getIdMedida()).get();
        entity.setUnidadMedida((unidad));
        return _productoRepository.save(entity);
    }

    @Override
    public void delete(Integer id){
         _productoRepository.deleteById(id);
    }

    @Override
    public Producto update(Producto entity, Integer id) {
        
        Producto aux = _productoRepository.findById(id).get();
        UnidadMedida unidad = _IUnidadRepository.findById(entity.getUnidadMedida().getIdMedida()).get();
        aux.setCodigo(entity.getCodigo());
        aux.setPrecio(entity.getPrecio());
        aux.setMarca(entity.getMarca());
        aux.setNombre(entity.getNombre());
        aux.setUnidadMedida(unidad);
       
        
        return _productoRepository.save(aux);

    }

    @Override
    public Iterable<Producto> findByMarca(String marca) {
      return _productoRepository.findByMarca(marca);
    }

    @Override
    public Iterable<Producto> findByCodigo(String codigo) {
        return _productoRepository.findByCodigo(codigo);
    }

} 
