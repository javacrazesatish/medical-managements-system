package com.mms.service;

import java.util.List;

import com.mms.modal.Appointment;

public interface AppointmentService {

	void saveAppointment(Appointment entity);

	public Appointment getAppointment(Long id);

	public List<Appointment> getAppointmentList();

	public void updateAppointment(Long id, Appointment entity);

	public void deleteAppoinemt(Long id);

}
