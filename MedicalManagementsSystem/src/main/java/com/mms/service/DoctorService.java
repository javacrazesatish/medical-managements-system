package com.mms.service;

import java.util.List;

import com.mms.modal.Doctor;

public interface DoctorService {
	
//abstract method
	
	public Doctor saveDoctorObj(Doctor doctor);
	public  Doctor fetchDoctor(Long id);
	public Doctor updateDoctorObject(Long id, Doctor entity);
	public void deleteObject(Long id);
	public List<Doctor> getDoctorList();

}
