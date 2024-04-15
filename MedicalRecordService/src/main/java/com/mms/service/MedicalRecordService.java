package com.mms.service;

import com.mms.model.MedicalRecord;

public interface MedicalRecordService {
	
	public MedicalRecord insertMedicalRecord(MedicalRecord medicalRecord);
	
	public MedicalRecord updateMedicalRecord(int id ,MedicalRecord medicalRecord);
	
	public MedicalRecord fetchMedicalRecord(int id);
	
	public void removeRecord();

}
