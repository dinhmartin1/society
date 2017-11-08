package project.martin;

public class SchoolDriver {

	public static void main(String[] args) {
		Student alex = new Student(19,"Alex");
		Student david = new Student(8,"David");
		School EVHS = new School("EVHS");
		String register = EVHS.register(alex);
		String register2 = EVHS.register(david);
		System.out.println(register);
		System.out.println(register2);
		EVHS.printRoster();
	}

}
