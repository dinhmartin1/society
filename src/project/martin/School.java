package project.martin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class School {
	private HashMap<String, List<Student>> registrations = new HashMap<String,List<Student>>();
	//private String name;
	//private ArrayList<Student> freshmen;
	//private ArrayList<Student> sophomore;
	//private ArrayList<Student> senior;
	//private ArrayList<Student> reject;
	
	public School(String schoolName){
			
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
		if(someone.getAge() <= 9){
			registrations.get("freshmen").add(someone);
			return "freshmen";
		}
		else if(someone.getAge() > 9 && someone.getAge() <= 13){
			registrations.get("sophomore").add(someone);
			return "sophomore";
		}
		else if(someone.getAge() > 13 && someone.getAge() <= 18){
			registrations.get("senior").add(someone);
			return "senior";
		}
		else{
			registrations.get("reject").add(someone);
			return "reject";
		}
	}
	
	public void printRoster() {
		List<Student> newcomer = registrations.get("freshmen");
		for(int i = 0; i < newcomer.size(); i++) {
            System.out.println(newcomer.get(i).getName());
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
