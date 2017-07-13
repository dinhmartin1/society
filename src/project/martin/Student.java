package project.martin;

public class Student{
	private int age;
	private String name;
	
	public Student(int myAge, String myName){
		age = myAge;
		name = myName;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
}
