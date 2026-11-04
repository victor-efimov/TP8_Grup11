package ar.edu.unju.escmi.tp8.model;

import org.springframework.stereotype.Component;

@Component
public class Ticket {
	
	private int id;
	private String estado;//Activo, En progreso, Terminado
	private String asignado;// nombre del responsable, ej: Juan Perez
	private String prioridad;// Alta, Baja, Media
	private String categoria;// Desarrollo, Diseño, Testing
	private int porcentaje;// 10, 20,100
	
	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	public Ticket(int id, String estado, String asignado, String prioridad, String categoria, int porcentaje) {
		super();
		this.id = id;
		this.estado = estado;
		this.asignado = asignado;
		this.prioridad = prioridad;
		this.categoria = categoria;
		this.porcentaje = porcentaje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getAsignado() {
		return asignado;
	}

	public void setAsignado(String asignado) {
		this.asignado = asignado;
	}

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", estado=" + estado + ", asignado=" + asignado + ", prioridad=" + prioridad
				+ ", categoria=" + categoria + ", porcentaje=" + porcentaje + "]";
	}
	
	

}
