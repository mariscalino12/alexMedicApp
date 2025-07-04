package com.Alex.MedicApp.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Alex.MedicApp.controller.dto.MedicoRequest;
import com.Alex.MedicApp.controller.dto.MedicoResponse;
import com.Alex.MedicApp.controller.dto.PacienteResponse;
import com.Alex.MedicApp.service.MedicoService;
import com.Alex.MedicApp.service.PacienteService;

@RestController
@RequestMapping("medicApp/medico")
public class MedicoController {

	@Autowired
	MedicoService medicoService;
	
	@Autowired
	PacienteService pacienteService;
	
	@GetMapping ("/saludo")
	public String saludo () {
		return "Hola soy un Médico";
	}

	@GetMapping("/medicos")
	public ResponseEntity<Collection<MedicoResponse>> getMedico() {
		return ResponseEntity.ok(medicoService.findAllMedico());
	}

	@GetMapping("/medico/{id}")
	public ResponseEntity<MedicoResponse> getMedicoById(@PathVariable Long id) {
		return ResponseEntity.ok(medicoService.findByIdMedico(id));
	}
	@GetMapping("/paciente/{dni}")
	public ResponseEntity<PacienteResponse> getPacienteByDni(@PathVariable String dni) {
		return ResponseEntity.ok(medicoService.findByDniPaciente(dni));
	}

	@PostMapping("/save/medico")
	public void saveMedicoById(@RequestBody MedicoRequest request) {
		medicoService.saveMedico(request);
	}

	@PutMapping("/update/medico/{id}")
	public void updateMedicosById(@PathVariable Long id, @RequestBody MedicoRequest request) {
		medicoService.updateMedico(id, request);
	}

	@DeleteMapping("/delete/medico/{id}")
	public void deleteMedicoById(@PathVariable Long id) {
		medicoService.deleteMedico(id);

	}
}
