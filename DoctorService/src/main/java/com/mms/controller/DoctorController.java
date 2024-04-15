package com.mms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.model.Doctor;
import com.mms.service.DoctorService;



@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	private static final Logger logger=LoggerFactory.getLogger(DoctorController.class);
	/*
	 * // field level
	 * 
	 * @Autowired private DoctorService service;
	 */
	
	
	  //Contructor Injection
		private DoctorService serviceInterface;

		@Autowired
		public DoctorController(DoctorService service) {
			this.serviceInterface = service;
		}
	 
	
	/*
	 * //setter Injection private DoctorService serviceSetter;
	 * 
	 * @Autowired public void setDoctorService(DoctorService service) {
	 * this.serviceSetter=service; }
	 */
	

	@PostMapping("/savedoctor")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		Doctor doctorResponse = serviceInterface.saveDoctorObj(doctor);
		return doctorResponse;

	}
	
	@GetMapping("/getDoctor/{id}")
	public Doctor getMethodName(@PathVariable Long id) {
		Doctor fetchDoctor = serviceInterface.fetchDoctor(id);
		return fetchDoctor;
	}
	
	@PutMapping("/update/{id}")
	public Doctor putMethodName(@PathVariable Long id, @RequestBody Doctor entity) {
		logger.info("Request Body id  :"+id);
		logger.info("Request Body for update Doctor :"+entity);
		Doctor updateDoctorObject = serviceInterface.updateDoctorObject(id,entity);
		return updateDoctorObject;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDoctor(@PathVariable Long id) {
		serviceInterface.deleteObject(id);
		return "Object delete Succeessfully.."+id;
		  
	}

}

//locolhost:8887/doctor/saveDoctor   body Object
//localhost:8887/doctor/getDaoctor/{id}    

