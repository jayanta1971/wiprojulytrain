package com.wipro.gpay.service;

import com.wipro.gpay.entity.UPI;

public interface GPayService {
   
  void pay(UPI upi);
  
  void sendBankTransaction(UPI upi);
  
  
  
  
}
