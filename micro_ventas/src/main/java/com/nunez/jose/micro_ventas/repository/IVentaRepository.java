
/** template created by jowsnunez --> https://www.github.com/JowsNunez **/
package com.nunez.jose.micro_ventas.repository;

import com.nunez.jose.micro_ventas.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
@Repository
public interface IVentaRepository extends JpaRepository<Venta, Integer> {
    
    @Query("SELECT  v FROM Venta v WHERE v.idCliente.id = :idCliente")
    Iterable<Venta> findByIdCliente(@Param("idCliente") Integer id);
 }
