package com.Alex.MedicApp.model;

import java.time.LocalDate;
import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "pacientes")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_paciente;

	@Column(name = "DNI", length = 9, unique = true)
	private String dni;

	@Column(name = "nombre", length = 100)
	private String nombre;

	@Column(name = "apellido_paterno", length = 100)
	private String apellido_paterno;

	@Column(name = "apellido_materno", length = 100)
	private String apellido_materno;

	@Column(name = "fecha_nacimiento", length = 100)
	private LocalDate fecha_nacimiento;

	@Column(name = "genero", length = 20)
	private String genero;

	@Column(name = "telefono", length = 20, unique = true)
	private String telefono;
	
	@OneToMany(mappedBy = "paciente")
	private List<ReservaCitas> cita;

	public Long getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(Long id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

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

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public List<ReservaCitas> getCita() {
		return cita;
	}

	public void setCita(List<ReservaCitas> cita) {
		this.cita = cita;
	}
	
	
}
