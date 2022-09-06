package co.edu.ucentral.commons.services.service;

import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import co.edu.ucentral.servicio.productos.model.Producto;
import co.edu.ucentral.servicio.productos.repository.ProductoRepository;

public class CommonServiceImpl<E,R extends JpaRepository<E,Long>> implements CommonService<E>{
	@Autowired
	protected R repository;
	
	@Override
	@Transactional
	public Iterable<E> findAll(){
		return repository.findAll();
	}
	
	
	@Override
	@Transactional
	public Optional<E> findById(Long id){
		return repository.findById(id);
	}
	
	@Override
	@Transactional
	public E save(E objProducto){
		return repository.save(objProducto);
	}
	
	@Override
	@Transactional
	public void deleteById(Long id){
		repository.deleteById(id);
	}
	
		
	
	
	
	
 	
}
