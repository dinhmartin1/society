package project.martin;

public class SchoolDriver {

	public static void main(String[] args) {
		Student alex = new Student(19);
		School EVHS = new School("EVHS");
		String register = EVHS.register(alex);
		System.out.println(register);
	}

}
