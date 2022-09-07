package co.edu.ucentral.servicio.envios.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

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
