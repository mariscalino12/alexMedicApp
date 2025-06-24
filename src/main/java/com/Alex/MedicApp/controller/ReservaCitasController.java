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

import com.Alex.MedicApp.controller.dto.ReservaCitasRequest;
import com.Alex.MedicApp.controller.dto.ReservaCitasResponse;
import com.Alex.MedicApp.service.ReservaCitasService;


@RestController
@RequestMapping("medicApp/reservaCita")
public class ReservaCitasController {

	 @Autowired
	    ReservaCitasService reservaCitaService;

	    @GetMapping("/citas")
	    public ResponseEntity<Collection<ReservaCitasResponse>> getCitas() {
	        return ResponseEntity.ok(reservaCitaService.findAllCitas());
	    }

	    @GetMapping("/citas/{id}")
	    public ResponseEntity<ReservaCitasResponse> getCitaById(@PathVariable Long id) {
	        return ResponseEntity.ok(reservaCitaService.findByIdCita(id));
	    }

	    @PostMapping("/save/citas")
	    public void saveCitasById(@RequestBody ReservaCitasRequest request) {
	    	reservaCitaService.saveCita(request);
	    }

	    @PutMapping("/update/citas/{id}")
	    public void updateCitaById(@PathVariable Long id, @RequestBody ReservaCitasRequest request) {
	    	reservaCitaService.updateCita(id, request);
	    }

	    @DeleteMapping("/delete/citas/{id}")
	    public void deleteCitaById(@PathVariable Long id) {
	    	reservaCitaService.deleteCita(id);
	    }
}
