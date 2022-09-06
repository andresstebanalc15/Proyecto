package co.edu.ucentral.commons.services.service;

import java.util.Optional;

public interface CommonService<E> {
	public Iterable<E> findAll();
	public Iterable<E> findById(Long id);
	public E save(E entity);
	public void deleteById(Long id);

}
