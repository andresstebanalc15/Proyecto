package co.edu.ucentral.servicio.envios.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import javax.validation.constraints.Size;


import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name="t_envios")
public class Envio implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_envio;
	private Long id_lugar_recibido;
	private Long id_lugar_entrega;
	private Long id_cliente;
	private String ticket;
	private String direccionEntrega;
	private Long id_administrador;
	private Date created_at;
	private Long precioEnvio;

	



	

	public Long getId_envio() {
		return id_envio;
	}







	public void setId_envio(Long id_envio) {
		this.id_envio = id_envio;
	}







	public Long getId_lugar_recibido() {
		return id_lugar_recibido;
	}







	public void setId_lugar_recibido(Long id_lugar_recibido) {
		this.id_lugar_recibido = id_lugar_recibido;
	}







	public Long getId_lugar_entrega() {
		return id_lugar_entrega;
	}







	public void setId_lugar_entrega(Long id_lugar_entrega) {
		this.id_lugar_entrega = id_lugar_entrega;
	}







	public Long getId_cliente() {
		return id_cliente;
	}







	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}







	public String getTicket() {
		return ticket;
	}







	public void setTicket(String ticket) {
		this.ticket = ticket;
	}







	public String getDireccionEntrega() {
		return direccionEntrega;
	}







	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}







	public Long getId_administrador() {
		return id_administrador;
	}







	public void setId_administrador(Long id_administrador) {
		this.id_administrador = id_administrador;
	}







	public Date getCreated_at() {
		return created_at;
	}







	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}







	public Long getPrecioEnvio() {
		return precioEnvio;
	}







	public void setPrecioEnvio(Long precioEnvio) {
		this.precioEnvio = precioEnvio;
	}







	private static final long serialVersionUID = 1L;
}
