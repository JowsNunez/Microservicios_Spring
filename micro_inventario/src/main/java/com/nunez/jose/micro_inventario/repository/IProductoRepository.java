
/** template created by jowsnunez --> https://www.github.com/JowsNunez **/
package com.nunez.jose.micro_inventario.repository;

import com.nunez.jose.micro_inventario.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {
    
}
