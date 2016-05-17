package com.superxu;

public class StudentService {

	private String studentname;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	
	public void showInfo(){
		
		System.out.println("the student name is "+getStudentname() );
		
	}
	
}
