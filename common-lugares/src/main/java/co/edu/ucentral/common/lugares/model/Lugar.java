package co.edu.ucentral.common.lugares.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="t_lugares")
public class Lugar implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_envio;
	private String nombre_lugar;
	private Long precio_envio;

	public Long getId_envio() {
		return id_envio;
	}

	public void setId_envio(Long id_envio) {
		this.id_envio = id_envio;
	}

	public String getNombre_lugar() {
		return nombre_lugar;
	}

	public void setNombre_lugar(String nombre_lugar) {
		this.nombre_lugar = nombre_lugar;
	}

	public Long getPrecioEnvio() {
		return precio_envio;
	}

	public void setPrecioEnvio(Long precioEnvio) {
		this.precio_envio = precioEnvio;
	}

	private static final long serialVersionUID = 1L;
}
