package com.mms.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mms_patients")
public class PatientModel {
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

	public PatientModel() {
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

	@Override
	public String toString() {
		return "PatientModel [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", startTime="
				+ startTime + ", endTime=" + endTime + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", whatappNo=" + whatappNo + ", adharNo=" + adharNo + "]";
	}

	}
