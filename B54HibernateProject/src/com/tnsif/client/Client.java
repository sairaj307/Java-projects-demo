package com.tnsif.client;

import com.tnsif.entities.Student;
import com.tnsif.service.StudentService;
import com.tnsif.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		 StudentService studentService=new StudentServiceImpl();
		 
		 Student student=new Student();
	
			  //Insert operation 
		      student.setSid(0);
		      student.setSname("M S dhoni");
			  studentService.addStudent(student);
			              
	     // Retrieval operation
	        Student student2=studentService.findStudentById(0);
	        System.out.println(student2);
       		
	        //Update Operation 
	          student2.setSname("Mahendra Singh Dhoni");
			  studentService.updateStudent(student2);
			// Retrieval operation
		         student2=studentService.findStudentById(0);
		        System.out.println(student2);
			  
			  Student student3=new Student();
			  student3.setSid(101);
			  studentService.removeStudent(student3);
	}
	}

