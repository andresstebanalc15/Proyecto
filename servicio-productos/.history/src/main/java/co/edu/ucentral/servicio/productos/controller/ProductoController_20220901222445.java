package co.edu.ucentral.servicio.productos.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


import co.edu.ucentral.servicio.productos.model.Producto;
import co.edu.ucentral.servicio.productos.service.ProductoService;
import co.edu.ucentral.commons.controller.CommonController;


@RestController
public class ProductoController extends CommonController<Producto, ProductoService>{
	@Autowired
	private ProductoService service;
	
	@GetMapping
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> buscarPorId(@PathVariable Long id){
		Optional<Producto> optional =service.findById(id);
		if(optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optional.get());
	}
	
	@GetMapping("/count")
	public ResponseEntity<?> contar(){
		long a =service.count();
		
		return ResponseEntity.ok(a);
	}
	
	@GetMapping("/existe/{id}") 
	public ResponseEntity<?> buscarUno(@PathVariable Long id){
		boolean respuesta = service.existById(id);
		if(respuesta) {
			return ResponseEntity.ok("El producto existe");
		}else {
			return ResponseEntity.ok("El producto no existe");
		}
	}
	@GetMapping("/download/img/{id}") 
	public ResponseEntity<?> verImagen(@PathVariable Long id){
		Optional<Producto> optional = service.findById(id);
		if(!optional.isPresent() || optional.get().getImagen() == null) {
			return ResponseEntity.notFound().build();
		}
		ByteArrayResource img = new ByteArrayResource(optional.get().getImagen());
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(img);
	}
	
	@PostMapping("/crear-con-imagen")
	public ResponseEntity<?> crearConImagen(@Valid Producto producto,@RequestParam MultipartFile archivo, BindingResult result) throws IOException{
		if(!archivo.isEmpty()) {
			producto.setImagen(archivo.getBytes());
		}
		return crear(producto,result);
	}
	
	@PostMapping
	public ResponseEntity<?> crear(@Valid @RequestBody Producto producto, BindingResult result){
		if(result.hasErrors()) {
			return this.validar(result);
		}
		Producto productoBd = service.save(producto);
		return ResponseEntity.status(HttpStatus.CREATED).body(productoBd);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Producto producto, @PathVariable Long id){
		Optional<Producto> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		Producto productoBd = optional.get();
		productoBd.setNombre(producto.getNombre());
		productoBd.setPrecio(producto.getPrecio());
		productoBd.setCantidad(producto.getCantidad());
		productoBd.setEspecificacion(producto.getEspecificacion());

		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(productoBd));
	}
	
	@PutMapping("/editar-con-imagen/{id}")
	public ResponseEntity<?> editarConImagen(Producto producto, @PathVariable Long id,@RequestParam MultipartFile archivo) throws IOException{
		Optional<Producto> optional = service.findById(id);
		if(!optional.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		Producto productoBd = optional.get();
		productoBd.setNombre(producto.getNombre());
		productoBd.setPrecio(producto.getPrecio());
		productoBd.setCantidad(producto.getCantidad());
		if(!archivo.isEmpty()) {
			productoBd.setImagen(archivo.getBytes());
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(productoBd));
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
