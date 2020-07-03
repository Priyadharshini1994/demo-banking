package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
//@Data
public class Bank {
  @Id
  private Integer accountNo;

  private String ifscCode;

  private Integer amount;

  public Integer getaccountNo() {
    return accountNo;
  }

  public void setAccountNo(Integer accountNo) {
    this.accountNo = accountNo;
  }

  public String getIfscCode() {
    return ifscCode;
  }

  public void setIfscCode(String ifscCode) {
    this.ifscCode = ifscCode;
  }

  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }
}