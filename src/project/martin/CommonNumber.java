package project.martin;

public class CommonNumber {
	 
    public static void main(String args[]) {
    	int number1 = 53;  
    	int number2 = 25; 

    	if(number1 < 25 || number2 < 25 || number1 > 75 || number2 > 75) {
    		System.out.println("Numbers must be between 25 and 75.");
    	}
    	else {
    		String numberString = "53";
    		String numberString2 = "25";
    		int result = Integer.parseInt(numberString);
    		int result2 = Integer.parseInt(numberString2);
    		System.out.println(result);
    		System.out.println(result2);	
    		
    		String commonNumber = "";  

    		for(int i = 0; i < numberString.length(); i++) {  
    		    for(int j = 0; j < numberString2.length(); j++) {  
    		        if(numberString.charAt(i) == numberString2.charAt(j)){  
    		            commonNumber += numberString.charAt(i) + " ";  
    		        }  
    		    }  
    		}  
    		System.out.println("The common number is: "+ commonNumber);  
    	}
    }
}