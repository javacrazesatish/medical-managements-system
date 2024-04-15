package com.mms.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mms.exception.RecordNotFoundException;
import com.mms.modal.Appointment;
import com.mms.repository.AppointmentRepo;
import com.mms.service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService{
	
	private static final Logger logger=LoggerFactory.getLogger(AppointmentServiceImpl.class);
	
	
	private AppointmentRepo repo;
	
	public AppointmentServiceImpl(AppointmentRepo repo) {
		logger.warn("Inject AppointmentRepo Object.. ");
		this.repo=repo;
	}

	@Override
	public void saveAppointment(Appointment entity) {
		logger.info("Appointment Request for save in service.. "+entity);
		repo.save(entity);
	}

	@Override
	public Appointment getAppointment(Long id) {
		logger.info("Appointment Request for get in service.. "+id);
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Appointment> getAppointmentList() {
		return repo.findAll();
	}

	@Override
	public void updateAppointment(Long id, Appointment entity) {
		// TODO Auto-generated method stub
		Appointment appointmentUpdateObj=new Appointment();
		Appointment appointment = repo.findById(id).orElse(null);
		if(appointment==null) {
			logger.error("Record not found with Id :"+id);
			throw new RecordNotFoundException("Record not Available Id : "+id);
		}
		appointmentUpdateObj.setId(appointment.getId());
		appointmentUpdateObj.setAppointmentDateTime(appointment.getAppointmentDateTime());
		
		repo.save(appointmentUpdateObj);
	}

	@Override
	public void deleteAppoinemt(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
