package co.edu.ucentral.servicio.clientes.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Size;


import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="t_clientes")
public class Cliente implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	private Long documento;
	private String nombre;
	private String email;
	

	public Long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}


	public Long getDocumento() {
		return documento;
	}


	public void setDocumento(Long documento) {
		this.documento = documento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	private static final long serialVersionUID = 1L;
}
