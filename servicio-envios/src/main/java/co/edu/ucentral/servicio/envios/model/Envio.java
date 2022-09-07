package co.edu.ucentral.servicio.envios.model;

import javax.persistence.*;



import java.io.Serializable;
import java.util.Date;
import co.edu.ucentral.common.clientes.model.Cliente;
import co.edu.ucentral.common.lugares.model.Lugar;

@Entity
@Table(name="t_envios")
public class Envio implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id_envio;
	@ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="id_lugar_recibido")
	private Lugar id_lugar_recibido;
	@ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="id_lugar_entrega")
	private Lugar id_lugar_entrega;
	@ManyToOne(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="id_cliente")
	private Cliente id_cliente;
	private String ticket;
	private String direccionEntrega;
	private Long id_administrador;
	private Date created_at;
	public Long getId_envio() {
		return id_envio;
	}
	
	public Lugar getId_lugar_recibido() {
		return id_lugar_recibido;
	}

	public void setId_lugar_recibido(Lugar id_lugar_recibido) {
		this.id_lugar_recibido = id_lugar_recibido;
	}

	public Lugar getId_lugar_entrega() {
		return id_lugar_entrega;
	}

	public void setId_lugar_entrega(Lugar id_lugar_entrega) {
		this.id_lugar_entrega = id_lugar_entrega;
	}

	public Cliente getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Cliente id_cliente) {
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

	

	private static final long serialVersionUID = 1L;
}
