package com.mms.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mms.exception.RecordNotFoundException;
import com.mms.modal.Bill;
import com.mms.modal.MedicalRecord;
import com.mms.modal.Prescription;
import com.mms.repository.BillRepository;
import com.mms.repository.MedicalRecordRepo;
import com.mms.repository.PrescriptionRepo;
import com.mms.service.MedicalRecordService;
import com.mms.utils.ConstandsUtils;

import jakarta.transaction.Transactional;

@Service
public class MedicalRecordServiceImpl implements MedicalRecordService{
	
	@Autowired
	private MedicalRecordRepo repo;
	
	@Autowired
	private PrescriptionRepo presRepo;
	
	@Autowired
	private BillRepository billRepo;

	@Override
	public MedicalRecord insertMedicalRecord(MedicalRecord medicalRecord) {
		MedicalRecord saverecord = repo.save(medicalRecord);
		return saverecord;
	}

	@Override
	public MedicalRecord updateMedicalRecord(int id, MedicalRecord medicalRecord) {
		MedicalRecord updateObj=new MedicalRecord();
		Optional<MedicalRecord> byId = repo.findById(id);
		MedicalRecord orElse = byId.orElse(null);
		if(orElse==null) {
			throw new RecordNotFoundException(ConstandsUtils.RECORD_NOT_FOUND+id);
		}
		
		return null;
	}

	@Override
	public MedicalRecord fetchMedicalRecord(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void removeRecord(int id) {
		
		repo.deleteById(id);
	}

	@Override
	public Prescription getPrescription(Long id) {
		// TODO Auto-generated method stub
		return presRepo.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void payBill(Long billId, double amountPaid) {
		Optional<Bill> billResp = billRepo.findById(billId);
		if(billResp.isPresent()) {
		Bill bill=	billResp.get();
		double remaningAmount=bill.getAmount() - amountPaid;
		
		if(remaningAmount >=0) {
			bill.setAmount(remaningAmount);
			billRepo.save(bill);
		}else {
			throw new IllegalArgumentException("Amount paid exceeds total bill amount..");
		}
		}else {
			throw new RecordNotFoundException("Bill Not Found with Id : "+billId);
		}
	}

}
