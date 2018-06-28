package project.martin;

public class Password {
	private int goodPassword;
	private int badPassword;
	
	public int getGoodPassword() { 
        return goodPassword; 
    } 
	
	public int getBadPassword() {
		return badPassword;
	}
	
	public void checkPassword(String password) {
		for(int i = 0; i < password.length(); i++) {
			if(password.length() < 10) {
				badPassword++;
			}
			else if(password.length() < 10 || password.length() == 10) {
				
			}
		}
	}
	
	public String showAllPasswords() {
		return "Good password:" + getGoodPassword() + "\n" + "Bad password:" + getBadPassword();
	}
}
