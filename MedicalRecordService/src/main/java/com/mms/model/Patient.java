package com.mms.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "patient")
	private List<MedicalRecord> medicalrecord=new ArrayList<>();
	
	
	
	public Patient() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MedicalRecord> getMedicalrecord() {
		return medicalrecord;
	}

	public void setMedicalrecord(List<MedicalRecord> medicalrecord) {
		this.medicalrecord = medicalrecord;
	}

	

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", medicalrecord=" + medicalrecord + "]";
	}
	

}
