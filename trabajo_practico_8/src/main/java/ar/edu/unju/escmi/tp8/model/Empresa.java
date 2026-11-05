package ar.edu.unju.escmi.tp8.model;

import org.springframework.stereotype.Component;

@Component
public class Empresa {

	private int id;
	private String nombre;
	private int cantidadEmpleados;
	private String telefono;
	private String direccion;

	public Empresa() {
	}

	public Empresa(int id, String nombre, int cantidadEmpleados, String telefono, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidadEmpleados = cantidadEmpleados;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadEmpleados() {
		return cantidadEmpleados;
	}

	public void setCantidadEmpleados(int cantidadEmpleados) {
		this.cantidadEmpleados = cantidadEmpleados;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", cantidadEmpleados=" + cantidadEmpleados
				+ ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}

}
