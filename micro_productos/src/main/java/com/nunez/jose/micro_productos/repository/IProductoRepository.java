
/** template created by jowsnunez --> https://www.github.com/JowsNunez **/
package com.nunez.jose.micro_productos.repository;

import com.nunez.jose.micro_productos.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {
    @Query(nativeQuery = true, value = "Select * from Producto p where p.marca=:marca")
    public Iterable<Producto> findByMarca(@Param(value = "marca") String marca);
    @Query(nativeQuery = true, value = "Select * from Producto p where p.codigo=:codigo")
    public Iterable<Producto> findByCodigo(@Param(value = "codigo") String codigo);
    
}
