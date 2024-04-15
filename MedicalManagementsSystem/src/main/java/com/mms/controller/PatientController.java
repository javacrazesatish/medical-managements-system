package com.mms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mms.modal.Patient;
import com.mms.service.PatientService;



@RestController
@RequestMapping("/patient")
public class PatientController {

	@Autowired
	private PatientService service;

	@PostMapping("/save")
	public String postMethodName(@RequestBody Patient entity) { 
		service.savePatient(entity);
		return "Object Successfully save..";
	}
	
	@GetMapping("/fetchPatientObj/{id}")
	public Patient get(@PathVariable Long id) {
		return service.getPatientResponse(id);
	}
	
	@PutMapping("/update/{id}")
	public Patient update(@PathVariable Long id, @RequestBody Patient entity) {
		return service.updatePatient(id,entity);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		service.deletePatient(id);
		return "Patient deleted Successfully.."+id;
	}
	
	@GetMapping("/search")
	public Patient searchPatient(@RequestParam String name) {
		return service.searchPatient(name);
	}
	
	

}
