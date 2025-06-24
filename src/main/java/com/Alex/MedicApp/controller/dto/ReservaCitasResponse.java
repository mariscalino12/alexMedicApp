package com.Alex.MedicApp.controller.dto;

import java.time.LocalDate;

import com.Alex.MedicApp.model.Medico;
import com.Alex.MedicApp.model.Paciente;


public class ReservaCitasResponse {

	private Long id_cita;
	private LocalDate fecha_cita;
	private String horario_cita;
	private String estado_cita;
	private Paciente paciente;
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
