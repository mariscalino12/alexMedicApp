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

import com.Alex.MedicApp.controller.dto.PacienteRequest;
import com.Alex.MedicApp.controller.dto.PacienteResponse;
import com.Alex.MedicApp.service.PacienteService;


@RestController
@RequestMapping("medicApp/paciente")
public class PacienteController {


    @Autowired
    PacienteService pacienteService;

    @GetMapping("/pacientes")
    public ResponseEntity<Collection<PacienteResponse>> getPaciente(){
        return  ResponseEntity.ok(pacienteService.findAllPaciente());
    }

    @GetMapping("/paciente/{id}")
    public ResponseEntity<PacienteResponse> getPacienteById(@PathVariable Long id){
        return  ResponseEntity.ok(pacienteService.findByIdPaciente(id));
    }

    @PostMapping("/save/paciente")
    public void savePacienteById(@RequestBody PacienteRequest request){
    	pacienteService.savePaciente(request);
    }

    @PutMapping("/update/paciente/{id}")
    public void updatePacientesById(@PathVariable Long id, @RequestBody PacienteRequest request){
    	pacienteService.updatePaciente(id, request);
    }

    @DeleteMapping("/delete/paciente/{id}")
    public void deletePacientesById(@PathVariable Long id){
    	pacienteService.deletePaciente(id);
    }
}
