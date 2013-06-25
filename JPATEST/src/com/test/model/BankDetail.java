package com.test.model;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_BANK")
public class BankDetail {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="BANK_ID")
	   private int bankId;
	   @Column(name="BANK_NAME")
	   private String bankName;
	   @Column(name="ACCOUNT_NUM")
	   private String accountNum;
	   @Column(name="IFSC_CODE")
	   private String iFscCode;
	   @OneToOne
	   @JoinColumn(name="EMPLOYEE_BANK_ID")
	   private Employee employee;
	   @OneToOne(mappedBy="bankDetail",cascade=CascadeType.PERSIST)
	   private BankAddress bankAddress;
	   
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccountNum() {
		return accountNum;
	 }
	 public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	 }
	 public String getiFscCode() {
		return iFscCode;
	 }
    	public void setiFscCode(String iFscCode) {
		this.iFscCode = iFscCode;
	  }
		public Employee getEmployee() {
			return employee;
		}
		public void setEmployee(Employee employee) {
			this.employee = employee;
		}
		public BankAddress getBankAddress() {
			return bankAddress;
		}
		public void setBankAddress(BankAddress bankAddress) {
			this.bankAddress = bankAddress;
		}
	   

 }
