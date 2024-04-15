package com.mms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mms.modal.Bill;

public interface BillRepository extends JpaRepository<Bill, Long> {

}
