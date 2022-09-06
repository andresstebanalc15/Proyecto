package co.edu.ucentral.servicio.productos.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


import java.io.Serializable;
@Entity
@Table(name="t_productos")
public class Producto implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message="El nombre no puede ser vacio")
	@Size(min=8, max=40,message="debe ser mayor a 8 y menor a 40 caracteres")
	private String nombre;
	@Positive(message="No puede ser negativo cantidad")
	@NotNull(message="No puede ser vacio cantidad")
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
