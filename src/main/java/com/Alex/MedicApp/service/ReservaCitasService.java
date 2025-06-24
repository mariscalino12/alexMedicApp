package com.Alex.MedicApp.service;

import java.util.Collection;

import com.Alex.MedicApp.controller.dto.ReservaCitasRequest;
import com.Alex.MedicApp.controller.dto.ReservaCitasResponse;



public interface ReservaCitasService {

	   Collection<ReservaCitasResponse> findAllCitas();

	    ReservaCitasResponse findByIdCita(Long idCita);

	    void  saveCita(ReservaCitasRequest request);

	    void updateCita(Long Id, ReservaCitasRequest request);

	    void deleteCita(Long idCita);
	    
}
