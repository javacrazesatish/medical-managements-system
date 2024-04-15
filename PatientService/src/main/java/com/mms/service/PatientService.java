package com.mms.service;

import com.mms.model.PatientModel;

public interface PatientService {

	public void savePatient(PatientModel entity);

	public PatientModel getPatientResponse(Long id);

	public PatientModel updatePatient(Long id, PatientModel entity);

	public void deletePatient(Long id);

}
