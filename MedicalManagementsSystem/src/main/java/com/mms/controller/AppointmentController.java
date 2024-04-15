package com.mms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.modal.Appointment;
import com.mms.service.AppointmentService;




@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	private AppointmentService service;
	
	@Autowired
	public AppointmentController(AppointmentService service) {
		this.service=service;
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Appointment entity) {
		service.saveAppointment(entity);
		return "Object Saved Succeessfully...!";
	}
	
	@GetMapping("/getappointment/{id}")
	public Appointment getAppointment(@PathVariable Long id) {
		return service.getAppointment(id);
	}
	
	@GetMapping("/getappointments")
	public List<Appointment> getAppointmentList() {
		return service.getAppointmentList()
;
	}
	
	@PutMapping("/update/{id}")
	public String putMethodName(@PathVariable Long id, @RequestBody Appointment entity) {
		service.updateAppointment(id,entity);
		
		return "Object successfully Updated...!";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteAppointment(@PathVariable Long id ) {
		service.deleteAppoinemt(id);
		return "Object successfully Deleted...!";
	}
	
	
	
}
