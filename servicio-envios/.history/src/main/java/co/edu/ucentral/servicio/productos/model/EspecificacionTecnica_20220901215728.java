
package co.edu.ucentral.servicio.productos.model;

import javax.persistence.*;

import java.io.Serializable;
@Entity
@Table(name="especificaciones_tecnicas")

public class EspecificacionTecnica implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descripcion;
	private String componentes;

	public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getComponentes() {
        return componentes;
    }
    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
