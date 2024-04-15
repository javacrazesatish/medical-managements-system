package com.mms.service;

import com.mms.model.Doctor;

public interface DoctorService {
	
//abstract method
	
	public Doctor saveDoctorObj(Doctor doctor);
	public  Doctor fetchDoctor(Long id);
	public Doctor updateDoctorObject(Long id, Doctor entity);
	public void deleteObject(Long id);

}
