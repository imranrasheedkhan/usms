package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name="BANK_ADDRESS")
public class BankAddress {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name="BANK_ADDRESS_ID")
     private int id;
	 @Column(name="BRANCH_NAME")	 
     private String branchName;
	 @Column(name="BANK_CITY")
     private String bankCity;
	 @Column(name="BANK_STATE")
     private String bankStae;
	 @OneToOne
	 @JoinColumn(name="BANK_DETAIL_ADDRESS")
	 private BankDetail bankDetail;
 public int getId() {
	return id;
 }
 public void setId(int id) {
	this.id = id;
}
public String getBranchName() {
	return branchName;
}
public void setBranchName(String branchName) {
	this.branchName = branchName;
}
public String getBankCity() {
	return bankCity;
}
public void setBankCity(String bankCity) {
	this.bankCity = bankCity;
}
public String getBankStae() {
	return bankStae;
}
public void setBankStae(String bankStae) {
	this.bankStae = bankStae;
}
public BankDetail getBankDetail() {
	return bankDetail;
}
public void setBankDetail(BankDetail bankDetail) {
	this.bankDetail = bankDetail;
}
   

}
