package com.tns.Inhertance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create an employee1
		Employee emp=new Employee();
		emp.setName("Bhoomika");
		emp.setSalary(35000);
		em.persist(emp);
		
		//create an employee1
		Employee emp1=new Employee();
		emp1.setName("Srujana");
		emp1.setSalary(45000);
		em.persist(emp1);
		
		//create an manager
		Manager mng=new Manager();
		mng.setName("Vinutha");
		mng.setSalary(65000);
		mng.setDeptName("Electronics and communication");
		em.persist(mng);
		
		em.getTransaction().commit();
		System.out.println("Added Employees and Manager Successfully");
		em.close();
		factory.close();
		
	}

}