package com.mms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mms.model.PatientModel;

@Repository
public interface PatientRepo extends JpaRepository<PatientModel, Long> {

}
