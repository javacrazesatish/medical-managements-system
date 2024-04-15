package com.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mms.modal.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Long> {

}
