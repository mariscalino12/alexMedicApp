package com.Alex.MedicApp.controller.dto;

public class MedicoRequest {

	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String horario_atencion;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public String getHorario_atencion() {
		return horario_atencion;
	}
	public void setHorario_atencion(String horario_atencion) {
		this.horario_atencion = horario_atencion;
	}
	
	
}
