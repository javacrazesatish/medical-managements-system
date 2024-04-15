package com.mms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mms.model.PatientModel;
import com.mms.service.PatientService;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class PatientControoler {

	@Autowired
	private PatientService service;

	@PostMapping("/save")
	public String postMethodName(@RequestBody PatientModel entity) { //name 
		
		if(entity.getName()==null && entity.getAdharNo()==null) {
			
			
		}
		service.savePatient(entity);
		return "Object Successfully save..";
	}
	
	@GetMapping("/fetchPatientObj/{id}")
	public PatientModel get(@PathVariable Long id) {
		return service.getPatientResponse(id);
	}
	
	@PutMapping("/update/{id}")
	public PatientModel update(@PathVariable Long id, @RequestBody PatientModel entity) {
		return service.updatePatient(id,entity);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable Long id) {
		service.deletePatient(id);
		return "Patient deleted Successfully.."+id;
	}
	

}
