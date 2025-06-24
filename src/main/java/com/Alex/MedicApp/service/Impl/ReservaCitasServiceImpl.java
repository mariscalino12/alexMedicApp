package com.Alex.MedicApp.service.Impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Alex.MedicApp.controller.dto.ReservaCitasRequest;
import com.Alex.MedicApp.controller.dto.ReservaCitasResponse;
import com.Alex.MedicApp.model.ReservaCitas;
import com.Alex.MedicApp.repository.ReservaCitasRepository;
import com.Alex.MedicApp.service.ReservaCitasService;
import com.Alex.MedicApp.service.mapper.ReservaCitasMapper;

@Service
public class ReservaCitasServiceImpl implements ReservaCitasService{

	@Autowired
	private ReservaCitasRepository reservaCitaRepository;
	@Autowired
	private ReservaCitasMapper reservaCitaMapper;
	@Override
	public Collection<ReservaCitasResponse> findAllCitas() {
		Collection<ReservaCitas> listReservaCitasResponses = reservaCitaRepository.findAll();
		return reservaCitaMapper.toListReservcaCitasToReservcaCitasResponse(listReservaCitasResponses);
	}

	@Override
	public ReservaCitasResponse findByIdCita(Long idCita) {
		ReservaCitas reservaCita = reservaCitaRepository.findById(idCita).orElse(null);
		return reservaCitaMapper.toReservcaCitasToReservcaCitasResponse(reservaCita);
	}

	@Override
	public void saveCita(ReservaCitasRequest request) {
		ReservaCitas citaNew = new ReservaCitas();
		citaNew.setFecha_cita(request.getFecha_cita());
		citaNew.setHorario_cita(request.getHorario_cita());
		citaNew.setEstado_cita(request.getEstado_cita());
		citaNew.setMedico(request.getMedico());
		citaNew.setPaciente(request.getPaciente());
		reservaCitaRepository.save(citaNew);
		
	}

	@Override
	public void updateCita(Long Id, ReservaCitasRequest request) {
		ReservaCitas cita = new ReservaCitas();
		if (cita != null) {
			cita.setFecha_cita(request.getFecha_cita());
			cita.setHorario_cita(request.getHorario_cita());
			cita.setEstado_cita(request.getEstado_cita());
			cita.setMedico(request.getMedico());
			cita.setPaciente(request.getPaciente());
			reservaCitaRepository.save(cita);
		}
		
	}

	@Override
	public void deleteCita(Long idCita) {
		ReservaCitas cita = reservaCitaRepository.findById(idCita).orElse(null);
		if (cita != null) {
			reservaCitaRepository.delete(cita);
		}
		
	}

}
