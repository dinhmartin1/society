package project.martin;

public class PasswordDriver {
	public static void main(String[] args) {
		Password word = new Password();
		word.checkPassword("hellomynameis123");
		System.out.print(word.showAllPasswords());
	}
}
