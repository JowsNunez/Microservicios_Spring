
/** template created by jowsnunez --> https://www.github.com/JowsNunez **/
package com.jose.nunez.micro_cliente.repository;

import com.jose.nunez.micro_cliente.entity.Cliente;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
        @Query("SELECT c FROM Cliente c WHERE c.rfc=:rfc")
        Optional<Cliente> findByRfc(@Param("rfc") String rfc);
}
