package com.wipro.bankaccount.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.bankaccount.entity.BankAccount;

@Repository
public interface BankAccountRepo extends JpaRepository<BankAccount, Integer> {

	BankAccount findByUpiId(String upiId);
}
