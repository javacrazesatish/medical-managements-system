package com.mms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mms.modal.Bill;
import com.mms.modal.MedicalRecord;
import com.mms.modal.Prescription;
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
	public MedicalRecord getrecord(@PathVariable int id) {
		return service.fetchMedicalRecord(id);
	}
	@DeleteMapping("/removeRecord/{id}")
	public void deleterecord(@PathVariable int id) {
		service.removeRecord(id);
	}
	
	@GetMapping("/viewPrescription")
	public Prescription getMethodName(@PathVariable Long id) {
		return service.getPrescription(id);
	}
	
	@GetMapping("/pay")
	public ResponseEntity<String> payBill(@RequestParam Long billId, @RequestParam double amountPaid) {
		service.payBill(billId,amountPaid);
		return ResponseEntity.ok("Payment Processed Successfully...");
	}
	

}
