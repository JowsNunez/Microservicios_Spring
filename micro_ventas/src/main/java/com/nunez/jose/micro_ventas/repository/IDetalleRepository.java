
/** template created by jowsnunez --> https://www.github.com/JowsNunez **/
package com.nunez.jose.micro_ventas.repository;

import com.nunez.jose.micro_ventas.entity.Detalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
@Repository
public interface IDetalleRepository extends JpaRepository<Detalle, Integer> {
    
}
