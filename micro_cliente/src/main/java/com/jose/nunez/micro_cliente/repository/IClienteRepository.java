
/** template created by jowsnunez --> https://www.github.com/JowsNunez **/
package com.jose.nunez.micro_cliente.repository;

import com.jose.nunez.micro_cliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer> {
    
    
}
