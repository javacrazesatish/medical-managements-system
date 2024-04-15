package com.mms.service;

import com.mms.modal.Patient;

public interface PatientService {

	public void savePatient(Patient entity);

	public Patient getPatientResponse(Long id);

	public Patient updatePatient(Long id, Patient entity);

	public void deletePatient(Long id);

	public Patient searchPatient(String name);

}
