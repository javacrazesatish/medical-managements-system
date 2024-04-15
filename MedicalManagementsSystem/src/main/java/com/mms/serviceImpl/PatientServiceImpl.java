package com.mms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.modal.Patient;
import com.mms.repository.PatientRepo;
import com.mms.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	private PatientRepo repo;

	@Override
	public void savePatient(Patient entity) {
		repo.save(entity);
	}

	@Override
	public Patient getPatientResponse(Long id) {

		return repo.findById(id).orElse(null);
	}

	@Override
	public Patient updatePatient(Long id, Patient entity) {
		Patient patient = repo.findById(id).orElse(null);
		patient.setId(id);
		patient.setName(entity.getName());
		patient.setStartTime(entity.getStartTime());
		patient.setEndTime(entity.getEndTime());
		Patient save = repo.save(patient);
		return save;
	}

	@Override
	public void deletePatient(Long id) {
		repo.deleteById(id);
	}

	@Override
	public Patient searchPatient(String name) {
		return repo.findByName(name);
	}

}
