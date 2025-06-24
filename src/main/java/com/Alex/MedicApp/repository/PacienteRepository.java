package com.Alex.MedicApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Alex.MedicApp.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

	  Optional<Paciente> findByDni(String dni);
}
