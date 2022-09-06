package co.edu.ucentral.servicio.productos.model;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
@Entity
@Table(name="productos")
public class Producto implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty(message="No puede ser vacio")
	@Size(min=8, max=40,message="debe ser mayor a 8 y menor a 40 caracteres")
	private String nombre;
	@Positive(message="No puede ser negativo")
	@NotNull(message="No puede ser vacio")
	private int cantidad;
	@Positive(message="No puede ser negativo")
	@NotNull(message="No puede ser vacio")
	private Float precio;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="especificacion_id")
	private EspecificacionTecnica especificacion;
	
	@Temporal(TemporalType.DATE)
	@Column(name= "created_at")
	private Date createdAt;
	@Lob
	@JsonIgnore
	private byte[] imagen;
	
	
	@PrePersist
	public void prePersist() {
		createdAt = new Date();
	}
	
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}
	
	public Integer getImagenHashCode() {
		return (this.imagen!=null)?imagen.hashCode():null;
	}


	public EspecificacionTecnica getEspecificacion() {
		return especificacion;
	}

	public void setEspecificacion(EspecificacionTecnica especificacion) {
		this.especificacion = especificacion;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
