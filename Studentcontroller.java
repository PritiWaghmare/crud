package com.hefshine.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.hefshine.crud.model.Student;
import com.hefshine.crud.payload.StudentProjection;
import com.hefshine.crud.service.StudentService;

import jakarta.persistence.criteria.Path;



@RestController
public class Studentcontroller {

	@Autowired
	StudentService studentService;
	
	@GetMapping("GetStudent/{id}")
	public Student getstudent(@PathVariable("id") int id) {
		return studentService.getStudent(id);
	}

	@PostMapping("SaveStudent")
	public Student savestudent(@RequestBody Student student) {
		Student st = studentService.saveStudent(student);
		return st;
	}
	
	@DeleteMapping("DeletStudent/{id}")
	public String deletstudent(@PathVariable("id") int id) {
		
	studentService.deletStudent(id);
	return("delet data");
	}

	@PutMapping("UpdateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updataeStudent(student);

	}

	@GetMapping("stud/{id}")
	public String findNameandEmail(@PathVariable("id") int id) {
		return studentService.findNameandEmail(id);
	}

	@GetMapping("studen/{id}")
	public String findName(@PathVariable("id") int id) {
		return studentService.findNamee(id);
	}
	@GetMapping("name/{name}")
	public String getname(@PathVariable("name")String name) {
	return studentService.nameonly(name);
		
	}
	
}
