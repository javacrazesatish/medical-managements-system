package com.mms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mms.model.MedicalRecord;
import com.mms.service.MedicalRecordService;



@RestController
@RequestMapping("/medicalrecord")
public class MedicalRecordController {
	
	@Autowired
	private MedicalRecordService service;
	
	@PostMapping("/save")
	public MedicalRecord saveMedicalRecord(@RequestBody MedicalRecord entity) {
		MedicalRecord insertMedicalRecord = service.insertMedicalRecord(entity);
		return insertMedicalRecord;
	}
	@PutMapping("update/{id}")
	public MedicalRecord updateMedicalRecord(@PathVariable int id, @RequestBody MedicalRecord entity) {
		service.updateMedicalRecord(id, entity);
		return entity;
	}
	@GetMapping("/getrecord/{id}")
	public MedicalRecord getMethodName(@PathVariable String id) {
		return null;
	}
	@DeleteMapping("/removeRecord/{id}")
	public void deleterecord(@PathVariable int id) {
		
	}
	

}
