
/** template created by jowsnunez --> https://www.github.com/JowsNunez **/
package com.nunez.jose.micro_ventas.repository;

import com.nunez.jose.micro_ventas.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
@Repository
public interface IVentaRepository extends JpaRepository<Venta, Integer> {
    
}
