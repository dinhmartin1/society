package project.martin;

public class CommonNumber {
	 
    public static void main(String args[]) {
    	int result = Integer.parseInt(args[0]);
		int result2 = Integer.parseInt(args[1]);
    	String huy = result + "";
		System.out.println(result);
		System.out.println(result2);
 
    	if(result < 25 ||result2 < 25 || result > 75 || result2 > 75) {
    		System.out.println("Numbers must be between 25 and 75.");
    	}
    	else {
    		
    		String commonNumber = ""; 
    		
    		for(int i = 0; i < args[0].length(); i++) {  
    		    for(int j = 0; j < args[1].length(); j++) {  
    		        if(args[0].charAt(i) == args[1].charAt(j)){  
    		            commonNumber += args[1].charAt(i) + " ";
    		        }  
    		    }  
    		}  
    		System.out.println("The common number is: "+ commonNumber);  
    	}
    }
}