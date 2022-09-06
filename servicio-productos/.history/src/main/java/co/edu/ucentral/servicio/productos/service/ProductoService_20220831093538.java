package co.edu.ucentral.servicio.productos.service;

import java.util.Optional;

import co.edu.ucentral.commons.services.service.CommonService;
import co.edu.ucentral.servicio.productos.model.Producto;

public interface ProductoService extends CommonService<Producto>{
	public Iterable<Producto> findAll();
	public Optional<Producto> findById(Long id);
	public Producto save(Producto producto);
	public void deleteById(Long id);
	public long count();
	public boolean existById(Long id);
}
