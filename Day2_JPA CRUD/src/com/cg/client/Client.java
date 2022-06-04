package com.cg.client;

import com.cg.entities.Student;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		Student student=new Student();
		//CRUD Operation
		//create
		student.setStudentId(11);
		student.setName("kusuma");
		service.addStudent(student);
		
		/*//Retreive data-find();
		student=service.findStudentById(21);
		System.out.println("ID: "+student.getID());
		System.out.println("ID: "+student.getName());*/
		
		
		//update
		student=service.findStudentById(21);
		student.setName("savitha");
		service.updateStudent(student);
		
		/*//delete
		student=service.findStudentById(11);
		service.removeStudent(student);*/
		
		

	}

}
