package co.edu.ucentral.servicio.envios.model;

import javax.persistence.*;



import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="t_lugares")
public class Lugar implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_envio;
	private String nombre_lugar;
	private Long precioEnvio;

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
		return precioEnvio;
	}

	public void setPrecioEnvio(Long precioEnvio) {
		this.precioEnvio = precioEnvio;
	}

	private static final long serialVersionUID = 1L;
}
