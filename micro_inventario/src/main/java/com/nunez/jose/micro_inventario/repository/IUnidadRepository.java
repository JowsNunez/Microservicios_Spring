
/** template created by jowsnunez --> https://www.github.com/JowsNunez **/
package com.nunez.jose.micro_inventario.repository;

import com.nunez.jose.micro_inventario.entity.UnidadMedida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
@Repository
public interface IUnidadRepository extends JpaRepository<UnidadMedida, Integer> {
    
}
