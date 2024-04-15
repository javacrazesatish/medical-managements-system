package com.mms.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.exception.RecordNotFoundException;
import com.mms.model.MedicalRecord;
import com.mms.repo.MedicalRecordRepo;
import com.mms.service.MedicalRecordService;
import com.mms.util.ConstantsUtil;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService{
	
	@Autowired
	private MedicalRecordRepo repo;

	@Override
	public MedicalRecord insertMedicalRecord(MedicalRecord medicalRecord) {
		MedicalRecord saverecord = repo.save(medicalRecord);
		return saverecord;
	}

	@Override
	public MedicalRecord updateMedicalRecord(int id, MedicalRecord medicalRecord) {
		MedicalRecord updateObj=new MedicalRecord();
		Optional<MedicalRecord> byId = repo.findById(id);
		MedicalRecord orElse = byId.orElse(null);
		if(orElse==null) {
			throw new RecordNotFoundException(ConstantsUtil.RECORD_NOT_FOUND+id);
		}
		
		return null;
	}

	@Override
	public MedicalRecord fetchMedicalRecord(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeRecord() {
		// TODO Auto-generated method stub
		
	}

}
