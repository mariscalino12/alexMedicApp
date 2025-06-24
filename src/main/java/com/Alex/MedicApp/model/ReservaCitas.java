package com.Alex.MedicApp.model;


import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reserva_citas")
public class ReservaCitas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cita;

	@Column(name = "fecha_cita", length = 100)
	private LocalDate fecha_cita;

	@Column(name = "horario_cita", length = 100, unique = true)
	private String horario_cita;

	@Column(name = "Estado_cita", length = 50)
	private String estado_cita;

	@ManyToOne
	@JoinColumn(name = "id_paciente")
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name = "id_medico")
	private Medico medico;

	public Long getId_cita() {
		return id_cita;
	}

	public void setId_cita(Long id_cita) {
		this.id_cita = id_cita;
	}

	public LocalDate getFecha_cita() {
		return fecha_cita;
	}

	public void setFecha_cita(LocalDate fecha_cita) {
		this.fecha_cita = fecha_cita;
	}

	public String getHorario_cita() {
		return horario_cita;
	}

	public void setHorario_cita(String horario_cita) {
		this.horario_cita = horario_cita;
	}

	public String getEstado_cita() {
		return estado_cita;
	}

	public void setEstado_cita(String estado_cita) {
		this.estado_cita = estado_cita;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

}
