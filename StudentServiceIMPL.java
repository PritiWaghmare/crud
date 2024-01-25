package com.hefshine.crud.serviceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hefshine.crud.model.Student;
import com.hefshine.crud.payload.StudentProjection;
import com.hefshine.crud.reposetory.StudentRepositry;
import com.hefshine.crud.service.StudentService;

import io.micrometer.observation.annotation.Observed;

@Service
public class StudentServiceIMPL implements StudentService {


	@Autowired
	StudentRepositry studentRepositry;	

	@Override
	public Student getStudent(int id) {       //GetMaping
		Student student=studentRepositry.findById(id).get();
		return studentRepositry.findById(id).get();
	}
		@Override
	public Student saveStudent(Student student) {  //PostMapping
		Student student1=studentRepositry.save(student);
		return student1;

	}

	@Override
	public void deletStudent(int id) {  //DeletMapping 

		studentRepositry.deleteById(id);
	}
	@Override
	public Student updataeStudent(Student student) {  //UpdateMapping
		Student student1 = studentRepositry.save(student);
		return student1;
	}
	@Override
	public String findNameandEmail(int id) {

		String name=studentRepositry.findByNameandemail(id);
		String UpperCase=name.toUpperCase();
		return UpperCase;
	}


	@Override
	public String findNamee(int id) {
		String name=studentRepositry.findByNameandemail(id);
		String lowerCase=name.toLowerCase();
		return lowerCase;
	}


	@Override
	public  String nameonly(String name) {
		String name1=studentRepositry.onlyName(name);
		return name1;
	}

}

