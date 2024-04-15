package com.mms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mms_appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	@ManyToOne
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	private LocalDateTime appointmentDateTime;

	public Appointment() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public void setAppointmentDateTime(LocalDateTime appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}

	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patient=" + patient + ", doctor=" + doctor + ", appointmentDateTime="
				+ appointmentDateTime + "]";
	}

}
