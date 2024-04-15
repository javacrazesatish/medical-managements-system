package com.mms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor_table")
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String speciliazation;

	
	public Doctor() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSpeciliazation() {
		return speciliazation;
	}


	public void setSpeciliazation(String speciliazation) {
		this.speciliazation = speciliazation;
	}


	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", speciliazation=" + speciliazation + "]";
	}


	
}
