package com.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mms.modal.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {
	

	public Patient findByName(String name);

}
