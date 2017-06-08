package project.martin;

import java.util.ArrayList;

public class School {
	private String name;
	private ArrayList<Student> freshmen;
	private ArrayList<Student> sophomore;
	private ArrayList<Student> senior;
	private ArrayList<Student> reject;
	
	public School(String schoolName){
		name = schoolName;
		freshmen = new ArrayList<Student>();
		sophomore = new ArrayList<Student>();
		senior = new ArrayList<Student>();
		reject = new ArrayList<Student>();
	}
	
	public String register(Student someone){
		someone.getAge();
		if(someone.getAge() <= 9){
			freshmen.add(someone);
			return("freshmen");
		}
		else if(someone.getAge() > 9 && someone.getAge() <= 13){
			sophomore.add(someone);
			return("sophomore");
		}
		else if(someone.getAge() > 13 && someone.getAge() <= 18){
			senior.add(someone);
			return("senior");
		}
		else{
			reject.add(someone);
			return("reject");
		}
	}
	
	public void printFreshmen(){
		for(Student newStudent: freshmen){
			System.out.println(newStudent.getAge());
		}
	}
	
	public void printSophomore(){
		for(Student newStudent: sophomore){
			System.out.println(newStudent.getAge());
		}
	}
	
	public void printSenior(){
		for(Student newStudent: senior){
			System.out.println(newStudent.getAge());
		}
	}
	
	public void printReject(){
		for(Student newStudent: reject){
			System.out.println(newStudent.getAge());
		}
	}
}
