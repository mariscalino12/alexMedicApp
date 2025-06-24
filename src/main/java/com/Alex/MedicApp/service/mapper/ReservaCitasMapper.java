package com.Alex.MedicApp.service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.Alex.MedicApp.controller.dto.ReservaCitasResponse;
import com.Alex.MedicApp.model.ReservaCitas;

@Component
public class ReservaCitasMapper {

	public Collection<ReservaCitasResponse> toListReservcaCitasToReservcaCitasResponse(Collection<ReservaCitas> listReservaCitas) {
		Collection<ReservaCitasResponse> listReservaCitasResponses = new ArrayList<>();

		if (listReservaCitas != null && !listReservaCitas.isEmpty()) {
			for (ReservaCitas cita : listReservaCitas) {
				ReservaCitasResponse reservaCitaResponse = new ReservaCitasResponse();
				reservaCitaResponse.setId_cita(cita.getId_cita());
				reservaCitaResponse.setFecha_cita(cita.getFecha_cita());
				reservaCitaResponse.setHorario_cita(cita.getHorario_cita());
				reservaCitaResponse.setEstado_cita(cita.getEstado_cita());
				reservaCitaResponse.setMedico(cita.getMedico());
				reservaCitaResponse.setPaciente(cita.getPaciente());

				listReservaCitasResponses.add(reservaCitaResponse);
			}
		}

		return listReservaCitasResponses;
	}

	public ReservaCitasResponse toReservcaCitasToReservcaCitasResponse(ReservaCitas reservaCitas) {
		ReservaCitasResponse reservaCitaResponse = new ReservaCitasResponse();
		if (reservaCitas != null) {
			reservaCitaResponse.setFecha_cita(reservaCitas.getFecha_cita());
			reservaCitaResponse.setHorario_cita(reservaCitas.getHorario_cita());
			reservaCitaResponse.setEstado_cita(reservaCitas.getEstado_cita());
			reservaCitaResponse.setMedico(reservaCitas.getMedico());
			reservaCitaResponse.setPaciente(reservaCitas.getPaciente());
		}
		return reservaCitaResponse;
	}
}
