package com.mms.serviceimlp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.exception.RecordNotFoundException;
import com.mms.model.Doctor;
import com.mms.repository.DoctorRepository;
import com.mms.service.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	
	private static final Logger logger=LoggerFactory.getLogger(DoctorServiceImpl.class);

	@Autowired
	private DoctorRepository repo;
	

	@Override
	public Doctor saveDoctorObj(Doctor doctor) {
		
		doctor.setName("DR. "+doctor.getName());
		
		Doctor doctorRes=  repo.save(doctor);
		
		return doctorRes;
	}


	@Override
	public Doctor fetchDoctor(Long id) {
		Doctor doctorResp = repo.findById(id).orElse(null);
		logger.info("Fetch Object Doctor Obj.."+doctorResp);
		if(doctorResp != null) {
			logger.info("Response Object Doctor"+doctorResp);
			return doctorResp;
		}else {
			logger.error("Record not found Id "+id);
			throw new RecordNotFoundException("Record Not Found Id : "+id);
		}
		
	}


	@Override
	public Doctor updateDoctorObject(Long id, Doctor entity) {
		Doctor doctor =repo.findById(id).orElse(null);
		logger.info("Request Body id  :"+id);
		logger.info("Request Body for update Doctor :"+entity);
		if(doctor == null) {
			logger.error("Record not found Id "+id);
			throw new RecordNotFoundException("Record Not Found Id : "+id);
		}
			
		
		doctor.setId(id);
		doctor.setName(entity.getName());
		doctor.setSpeciliazation(entity.getSpeciliazation());
		Doctor saveDoctorResponse = repo.save(doctor);
		return saveDoctorResponse;
	}


	@Override
	public void deleteObject(Long id) {
		
		repo.deleteById(id);
	}

}
