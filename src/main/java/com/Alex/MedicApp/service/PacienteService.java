package com.Alex.MedicApp.service;

import java.util.Collection;

import com.Alex.MedicApp.controller.dto.PacienteRequest;
import com.Alex.MedicApp.controller.dto.PacienteResponse;


public interface PacienteService {
	
	 Collection<PacienteResponse> findAllPaciente();

	    PacienteResponse findByIdPaciente(Long idPaciente);

	    void  savePaciente(PacienteRequest request);

	    void updatePaciente(Long Id, PacienteRequest request);

	    void deletePaciente(Long idPaciente);

}
