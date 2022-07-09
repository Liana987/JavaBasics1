package com.syntax.class16;

public class Student {
	//Create three  variables  Name , ID  and  numberOfStudents
	//Create three objects of the Students Class
	//Set the value for  studentName , studentID and increment  the numberOfStudents for each object
	//Print out  total number of students

	String studentName;
	int  studentID;
	static int numberOfStudents;
	
	public static void main(String[] args) {
		Student stud1= new Student();
		stud1.studentName="Vanja";
		stud1.studentID=55;
		numberOfStudents++;
		
		Student stud2= new Student();
		stud2.studentName="Nikola";
		stud2.studentID=50;
		numberOfStudents++;
		
		Student stud3= new Student();
		stud3.studentName="Marko";
		stud3.studentID=4;
		numberOfStudents++;
		
		System.out.println(numberOfStudents + " is the total number of students");
		
	}
	
}
