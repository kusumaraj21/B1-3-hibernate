package com.tns.service;


import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImp;
import com.cg.entities.Student;

public class StudentServiceImpl implements StudentService
{
	private StudentDao dao;
	

	public StudentServiceImpl()
	{
		dao=new StudentDaoImp();
	}

	@Override
	public void addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public Student findStudentById(int ID) {
		Student student =dao.getStudentById(ID);
		return student;
		
	}

	@Override
	public void updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(Student student) {
		dao.beginTransaction();
		dao.removeStudent(student);
		dao.commitTransaction();
		
	}

}