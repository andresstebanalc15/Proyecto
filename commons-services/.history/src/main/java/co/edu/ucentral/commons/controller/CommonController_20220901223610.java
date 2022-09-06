package co.edu.ucentral.commons.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import co.edu.ucentral.commons.services.service.CommonService;



public class CommonController<E,S extends CommonService<E>> {
	@Autowired
	protected S service;
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Long id){
		Optional<E> optional =service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optional.get());
	}
	
	@PostMapping
	public ResponseEntity<?> crear(@Validated @RequestBody E entity, BindingResult result){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(entity));
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	 protected ResponseEntity<?> validar(BindingResult objResult){
		 Map<String,Object> errores = new HashMap<>();
		 objResult.getFieldErrors().forEach(err->{
			 errores.put(err.getField(), "El atributo "+err.getField()+" "+err.getDefaultMessage());
		 });
		 return ResponseEntity.badRequest().body(errores);
	 }
	
	
	
}
