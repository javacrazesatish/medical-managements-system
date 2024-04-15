package com.mms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mms.model.MedicalRecord;

@Repository
public interface MedicalRecordRepo extends JpaRepository<MedicalRecord, Integer> {

}
