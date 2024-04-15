package com.mms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.model.PatientModel;
import com.mms.repo.PatientRepo;
import com.mms.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientRepo repo;

	@Override
	public void savePatient(PatientModel entity) {
		repo.save(entity);
	}

	@Override
	public PatientModel getPatientResponse(Long id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public PatientModel updatePatient(Long id, PatientModel entity) {
		PatientModel patient = repo.findById(id).orElse(null);
		patient.setId(id);
		patient.setName(entity.getName());
		patient.setStartTime(entity.getStartTime());
		patient.setEndTime(entity.getEndTime());
		PatientModel save = repo.save(patient);
		return save;
	}

	@Override
	public void deletePatient(Long id) {
		repo.deleteById(id);
	}

}
