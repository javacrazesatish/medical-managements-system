package com.mms.service;

import com.mms.modal.MedicalRecord;
import com.mms.modal.Prescription;

public interface MedicalRecordService {
	
	public MedicalRecord insertMedicalRecord(MedicalRecord medicalRecord);
	
	public MedicalRecord updateMedicalRecord(int id ,MedicalRecord medicalRecord);
	
	public MedicalRecord fetchMedicalRecord(int id);
	
	public void removeRecord(int id);

	public Prescription getPrescription(Long id);

	public void payBill(Long billId, double amountPaid);

}
