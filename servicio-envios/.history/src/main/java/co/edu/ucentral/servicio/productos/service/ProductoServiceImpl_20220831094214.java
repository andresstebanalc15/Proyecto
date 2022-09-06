package co.edu.ucentral.servicio.productos.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ucentral.commons.services.service.CommonServiceImpl;
import co.edu.ucentral.servicio.productos.model.Producto;
import co.edu.ucentral.servicio.productos.repository.ProductoRepository;
@Service
public class ProductoServiceImpl extends CommonServiceImpl<Producto,ProductoRepository> implements ProductoService{
	@Autowired
	private ProductoRepository repository;
	
	@Override
	@Transactional
	public Iterable<Producto> findAll(){
		return repository.findAll();
	}
	
	
	@Override
	@Transactional
	public Optional<Producto> findById(Long id){
		return repository.findById(id);
	}
	
	@Override
	@Transactional
	public Producto save(Producto objProducto){
		return repository.save(objProducto);
	}
	
	@Override
	@Transactional
	public void deleteById(Long id){
		repository.deleteById(id);
	}
	
	@Override
	@Transactional
	public long count(){
		return repository.count();
	}
	
	@Override
	public boolean existById(Long id){
		return repository.existsById(id);
	}
	
	
	
	
	
 	
}
