package project.martin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class School {
	//private String name;
	//private ArrayList<Student> freshmen;
	//private ArrayList<Student> sophomore;
	//private ArrayList<Student> senior;
	//private ArrayList<Student> reject;
	
	public School(String schoolName){
		HashMap<String, List<Student>> registrations = new HashMap<String,List<Student>>();
		
		registrations.put("freshmen",new ArrayList<Student>());
		registrations.put("sophomore",new ArrayList<Student>());
		registrations.put("senior",new ArrayList<Student>());
		registrations.put("reject",new ArrayList<Student>());

		//name = schoolName;
		//freshmen = new ArrayList<Student>();
		//sophomore = new ArrayList<Student>();
		//senior = new ArrayList<Student>();
		//reject = new ArrayList<Student>();
	}
	
	public String register(Student someone){
		someone.getAge();
		if(someone.getAge() <= 9){
			return freshmen;
		}
		else if(someone.getAge() > 9 && someone.getAge() <= 13){
			return sophomore;
		}
		else if(someone.getAge() > 13 && someone.getAge() <= 18){
			return senior;
		}
		else{
			return reject;
		}
	}
	
	//public void printFreshmen(){
	//	for(Student newStudent: freshmen){
	//		System.out.println(newStudent.getAge());
	//	}
	//}
	
	//public void printSophomore(){
	//	for(Student newStudent: sophomore){
	//		System.out.println(newStudent.getAge());
	//	}
	//}
	
	//public void printSenior(){
	//	for(Student newStudent: senior){
	//		System.out.println(newStudent.getAge());
		//}
	//}
	
	//public void printReject(){
	//	for(Student newStudent: reject){
	//		System.out.println(newStudent.getAge());
	//	}
	//}
}
