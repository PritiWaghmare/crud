package com.hefshine.crud.service;

import com.hefshine.crud.model.Student;
import com.hefshine.crud.payload.StudentProjection;

public interface StudentService {

	
	public Student getStudent(int id);
		
	public Student saveStudent(Student student);
	
	public void deletStudent(int id);
	
	
	public Student updataeStudent(Student student);
	
	
	public String findNameandEmail(int id);
	
	public String findNamee(int id);
	
	public  String nameonly(String name);
	
}
