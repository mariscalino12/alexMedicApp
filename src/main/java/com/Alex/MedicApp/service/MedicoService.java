package com.Alex.MedicApp.service;

import java.util.Collection;

import com.Alex.MedicApp.controller.dto.MedicoRequest;
import com.Alex.MedicApp.controller.dto.MedicoResponse;
import com.Alex.MedicApp.controller.dto.PacienteResponse;


public interface MedicoService {

	 Collection<MedicoResponse> findAllMedico();

	    MedicoResponse findByIdMedico(Long idMedico);

	    void  saveMedico(MedicoRequest request);

	    void updateMedico(Long Id, MedicoRequest request);

	    void deleteMedico(Long idMedico);
	    
	    PacienteResponse findByDniPaciente(String dni);
	    
}
