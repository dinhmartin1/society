package project.martin;

public class CommonNumber {
	 
    public static void main(String args[]) {
    	int number1 = 52;  
    	int number2 = 24;  
    	String commonNumber = "";  

    	if((number1 < 25 || number2 < 25) || (number1 > 75 || number2 > 75)) {
    		System.out.println("Numbers must be between 25 and 75.");
    	}
    	else {
    		System.out.println("The common number is: "+ commonNumber);  
    	}
    }
}