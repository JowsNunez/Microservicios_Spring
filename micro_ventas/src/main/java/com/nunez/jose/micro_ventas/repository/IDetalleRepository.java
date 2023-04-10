
/** template created by jowsnunez --> https://www.github.com/JowsNunez **/
package com.nunez.jose.micro_ventas.repository;

import com.nunez.jose.micro_ventas.entity.Detalle;
import com.nunez.jose.micro_ventas.util.CustomQuery;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
@Repository
public interface IDetalleRepository extends JpaRepository<Detalle, Integer> {

    @Query(CustomQuery.buscarClienteFolioId)
    Iterable<Detalle> findByIdCliente(
            @Param("idCliente") Integer id,
            @Param("folio") String folio,
            @Param("idVenta") Integer idVenta,
            @Param("fecha") Date fecha);

    

}
