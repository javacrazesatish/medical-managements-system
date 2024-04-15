package com.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mms.modal.Appointment;

public interface AppointmentRepo extends JpaRepository<Appointment, Long> {}
