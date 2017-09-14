package project.martin;

public class PigLatin {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {  
			String givenWord = args[i];
			System.out.print(givenWord.substring(1,args[i].length()) + givenWord.toLowerCase().charAt(0) + "ay" + " ");
		}
	}
}