package com.hefshine.crud.reposetory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hefshine.crud.model.Student;
import com.hefshine.crud.payload.StudentProjection;

public interface StudentRepositry extends JpaRepository<Student, Integer> {

	@Query(value = "select name from student where id=:id", nativeQuery = true)
	String findByNameandemail(@Param("id") int id);
	
	
  @Query(value="select name from student where name=:name",nativeQuery=true)
  
   String onlyName(@Param("name")String name);
  
	
}
