package com.Alex.MedicApp.service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.Alex.MedicApp.controller.dto.PacienteResponse;
import com.Alex.MedicApp.model.Paciente;


@Component
public class PacienteMapper {

	public Collection<PacienteResponse> toListPacienteToPacienteResponse(Collection<Paciente> listPaciente) {
		Collection<PacienteResponse> listpacienteResponses = new ArrayList<>();

		if (listPaciente != null && !listPaciente.isEmpty()) {
			for (Paciente paciente : listPaciente) {
				PacienteResponse pacienteResponse = new PacienteResponse();
				pacienteResponse.setId_paciente(paciente.getId_paciente());
				pacienteResponse.setDni(paciente.getDni());
				pacienteResponse.setNombre(paciente.getNombre());
				pacienteResponse.setApellido_paterno(paciente.getApellido_paterno());
				pacienteResponse.setApellido_materno(paciente.getApellido_materno());
				pacienteResponse.setFecha_nacimiento(paciente.getFecha_nacimiento());
				pacienteResponse.setGenero(paciente.getGenero());
				pacienteResponse.setTelefono(paciente.getTelefono());

				listpacienteResponses.add(pacienteResponse);
			}
		}

		return listpacienteResponses;
	}

	public PacienteResponse toPacienteTopacienteResponse(Paciente paciente) {
		PacienteResponse pacienteresponse = new PacienteResponse();
		if (paciente != null) {
			pacienteresponse.setDni(paciente.getDni());
			pacienteresponse.setNombre(paciente.getNombre());
			pacienteresponse.setApellido_paterno(paciente.getApellido_paterno());
			pacienteresponse.setApellido_materno(paciente.getApellido_materno());
			pacienteresponse.setFecha_nacimiento(paciente.getFecha_nacimiento());
			pacienteresponse.setGenero(paciente.getGenero());
			pacienteresponse.setTelefono(paciente.getTelefono());
		}
		return pacienteresponse;
	}
}
