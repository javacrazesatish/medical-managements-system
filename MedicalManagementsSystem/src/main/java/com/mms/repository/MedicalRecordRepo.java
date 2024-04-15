package com.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mms.modal.MedicalRecord;

@Repository
public interface MedicalRecordRepo extends JpaRepository<MedicalRecord, Integer> {

}
