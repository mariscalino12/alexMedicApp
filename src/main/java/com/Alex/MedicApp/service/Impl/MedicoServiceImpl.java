package com.Alex.MedicApp.service.Impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Alex.MedicApp.controller.dto.MedicoRequest;
import com.Alex.MedicApp.controller.dto.MedicoResponse;
import com.Alex.MedicApp.controller.dto.PacienteResponse;
import com.Alex.MedicApp.model.Medico;
import com.Alex.MedicApp.model.Paciente;
import com.Alex.MedicApp.repository.MedicoRepository;
import com.Alex.MedicApp.repository.PacienteRepository;
import com.Alex.MedicApp.service.MedicoService;
import com.Alex.MedicApp.service.mapper.MedicoMapper;
import com.Alex.MedicApp.service.mapper.PacienteMapper;

@Service
public class MedicoServiceImpl implements MedicoService{

	@Autowired
	MedicoRepository medicoRepository;
	
	@Autowired
	MedicoMapper medicoMapper;
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@Autowired
	PacienteMapper pacienteMapper;
	
	
	@Override
	public Collection<MedicoResponse> findAllMedico() {
		Collection<Medico> listMedicoResponses= medicoRepository.findAll();
		return medicoMapper.toListMedicoToMedicoResponse(listMedicoResponses);
	}

	@Override
	public MedicoResponse findByIdMedico(Long idMedico) {
		Medico medico = medicoRepository.findById(idMedico).orElse(null);
		return medicoMapper.toMedicoToMedicoResponse(medico);
	}

	@Override
	public void saveMedico(MedicoRequest request) {
		Medico medicoNew = new Medico();
		medicoNew.setNombre(request.getNombre());
		medicoNew.setApellido_paterno(request.getApellido_paterno());
		medicoNew.setApellido_materno(request.getApellido_materno());
		medicoNew.setHorario_atencion(request.getHorario_atencion());
		medicoRepository.save(medicoNew);
		
	}

	@Override
	public void updateMedico(Long Id, MedicoRequest request) {
		Medico medico =medicoRepository.findById(Id).orElse(null);
		if (medico != null) {
			medico.setNombre(request.getNombre());
			medico.setApellido_paterno(request.getApellido_paterno());
			medico.setApellido_materno(request.getApellido_materno());
			medico.setHorario_atencion(request.getHorario_atencion());
			medicoRepository.save(medico);
		}
		
	}

	@Override
	public void deleteMedico(Long idMedico) {
		Medico medico =medicoRepository.findById(idMedico).orElse(null);
		if (medico != null) {
			medicoRepository.delete(medico);
		}
		
	}

	@Override
	public PacienteResponse findByDniPaciente(String dni) {
		Paciente paciente = pacienteRepository.findByDni(dni).orElse(null);
		return pacienteMapper.toPacienteTopacienteResponse(paciente);
	}

}
