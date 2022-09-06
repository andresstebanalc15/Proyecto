
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
