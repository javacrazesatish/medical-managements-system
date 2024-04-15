package com.mms.modal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "mms_patients")
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;//required 
	
	private String age;
	private String gender;
	
	private LocalDateTime startTime;
	
	private LocalDateTime endTime;
	private String address;//required 
	
	private String mobileNo;
	
	private String whatappNo;
	private String adharNo; //required 
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private List<MedicalRecord> medicalrecord=new ArrayList<>();
	
	@OneToMany(mappedBy = "appointment", cascade = CascadeType.ALL)
	private List<Appointment> appointment=new ArrayList<>();
	

	public Patient() {
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


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public LocalDateTime getStartTime() {
		return startTime;
	}


	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}


	public LocalDateTime getEndTime() {
		return endTime;
	}


	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getWhatappNo() {
		return whatappNo;
	}


	public void setWhatappNo(String whatappNo) {
		this.whatappNo = whatappNo;
	}


	public String getAdharNo() {
		return adharNo;
	}


	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}


	public List<MedicalRecord> getMedicalrecord() {
		return medicalrecord;
	}


	public void setMedicalrecord(List<MedicalRecord> medicalrecord) {
		this.medicalrecord = medicalrecord;
	}


	public List<Appointment> getAppointment() {
		return appointment;
	}


	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}


	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", startTime="
				+ startTime + ", endTime=" + endTime + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", whatappNo=" + whatappNo + ", adharNo=" + adharNo + ", medicalrecord=" + medicalrecord
				+ ", appointment=" + appointment + "]";
	}

	
	}
