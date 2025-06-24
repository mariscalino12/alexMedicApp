package com.Alex.MedicApp.service.mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.Alex.MedicApp.controller.dto.MedicoResponse;
import com.Alex.MedicApp.model.Medico;

@Component
public class MedicoMapper {
	public Collection<MedicoResponse> toListMedicoToMedicoResponse(Collection<Medico> listMedico) {
		Collection<MedicoResponse> listmedicoResponses = new ArrayList<>();

		if (listMedico != null && !listMedico.isEmpty()) {
			for (Medico medico : listMedico) {
				MedicoResponse medicoResponse = new MedicoResponse();
				medicoResponse.setId_medico(medico.getId_medico());
				medicoResponse.setNombre(medico.getNombre());
				medicoResponse.setApellido_paterno(medico.getApellido_paterno());
				medicoResponse.setApellido_materno(medico.getApellido_materno());
				medicoResponse.setHorario_atencion(medico.getHorario_atencion());
				listmedicoResponses.add(medicoResponse);
			}
		}

		return listmedicoResponses;
	}

	public MedicoResponse toMedicoToMedicoResponse(Medico medico) {
		MedicoResponse medicoResponse = new MedicoResponse();
		if (medico != null) {
			medicoResponse.setNombre(medico.getNombre());
			medicoResponse.setApellido_paterno(medico.getApellido_paterno());
			medicoResponse.setApellido_materno(medico.getApellido_materno());
			medicoResponse.setHorario_atencion(medico.getHorario_atencion());
		}
		return medicoResponse;
	}

}
