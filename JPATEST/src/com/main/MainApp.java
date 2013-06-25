package com.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.test.model.BankAddress;
import com.test.model.BankDetail;
import com.test.model.Employee;

public class MainApp {
	 private static final String PERSISTENCE_UNIT_NAME = "JPATEST";
	  private static EntityManagerFactory factory;
	
	public static void main(String[] args) {
		   Employee employee=new Employee();
		   BankDetail employeeBankDetail=new BankDetail();
		   BankAddress bankAddress=new BankAddress();
		   employee.setName("Tariq");
		   employee.setAddress("Chennai");   
		   
		   //This added to test the comit
		   employeeBankDetail.setAccountNum("GB48762");
		   employeeBankDetail.setBankName("CanraBank");
		   employeeBankDetail.setiFscCode("A26373");
		   
		      
		   bankAddress.setBranchName("KodamBakkam");
		   bankAddress.setBankCity("Chennai");
		   bankAddress.setBankStae("TamilNadu");
		   
		   bankAddress.setBankDetail(employeeBankDetail);
		   employeeBankDetail.setBankAddress(bankAddress);
		   employeeBankDetail.setEmployee(employee);
		   
		   employee.setBankDetail(employeeBankDetail);
		   
		  //Insertion
		     factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		     EntityManager em = factory.createEntityManager();
		     em.getTransaction().begin();
		     em.persist(employee);
		     
		     em.getTransaction().commit();

		     em.close();
		
		
	}

}
