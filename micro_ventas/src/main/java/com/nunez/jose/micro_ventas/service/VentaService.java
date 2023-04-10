/** template created by jowsnunez --> https://www.github.com/JowsNunez **/

package com.nunez.jose.micro_ventas.service;

import com.nunez.jose.micro_ventas.dto.VentaDTO;
import com.nunez.jose.micro_ventas.entity.Detalle;
import com.nunez.jose.micro_ventas.entity.Venta;
import com.nunez.jose.micro_ventas.repository.IDetalleRepository;
import com.nunez.jose.micro_ventas.repository.IVentaRepository;
import com.nunez.jose.micro_ventas.util.Fecha;

import java.util.Date;
import java.util.Optional;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jose
 */

@Component
public class VentaService implements IVentaService<Venta> {

  @Autowired
  private IVentaRepository _ventaRepository;
  @Autowired
  private IDetalleRepository _detalleRepository;

  @Override
  public Iterable<Venta> getAll() {
    return _ventaRepository.findAll();
  }

  @Override
  public Venta getById(Integer id) {
    Optional<Venta> opt = _ventaRepository.findById(id);
    return opt.get();
  }

  @Override
  public Venta create(Venta entity) {
    entity.setFecha(new Date());
    return _ventaRepository.save(entity);
  }

  @Override
  public void delete(Integer id) {
    _ventaRepository.deleteById(id);
  }

  @Override
  public VentaDTO findByClienteFolioIdVenta(Integer idCliente, String folio, Integer idVenta, String strFecha) {
    Date fecha = Fecha.parser(strFecha);

    

    Iterable<Detalle> ventas = _detalleRepository.findByIdCliente(idCliente, folio, idVenta, fecha);
    VentaDTO ventaDTO = new VentaDTO();

    ventas.forEach(e -> {

      ventaDTO.setFolioVenta(e.getIdVenta().getFolio());
      ventaDTO.setNombreCliente(e.getIdVenta().getIdCliente().getNombre());
      ventaDTO.setTotal(e.getIdVenta().getTotal());
      ventaDTO.getProductos().add(e.getIdProducto());
      ventaDTO.setFecha(Fecha.parser(e.getIdVenta().getFecha()));

    });
    ventaDTO.setCantidadProductos();
    return ventaDTO;
  }

  

}
