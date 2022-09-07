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
	private Long nombre;
	private Long email;

	public Long getIdCliente() {
		return idCliente;
	}

	public Long getDocumento() {
		return documento;
	}

	public Long getNombre() {
		return nombre;
	}

	public Long getEmail() {
		return email;
	}

	private static final long serialVersionUID = 1L;
}
