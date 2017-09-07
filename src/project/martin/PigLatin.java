package project.martin;

public class PigLatin {

	public static void main(String[] args) {
		String givenWord = args[0];
		String givenWord2 = args[1];
		String givenWord3 = args[2];
		String givenWord4 = args[3];
		/*String givenWord5 = args[4];
		String givenWord6 = args[5];
		String givenWord7 = args[6];
		String givenWord8 = args[7];
		String givenWord9 = args[8];
		String givenWord10 = args[9]; */
		
		System.out.print(givenWord.substring(1,args[0].length()) + givenWord.toLowerCase().charAt(0) + "ay" + " ");
		System.out.print(givenWord2.substring(1,args[1].length()) + givenWord2.toLowerCase().charAt(0) + "ay" + " ");
		System.out.print(givenWord3.substring(1,args[2].length()) + givenWord3.toLowerCase().charAt(0) + "ay" + " ");
		System.out.print(givenWord4.substring(1,args[3].length()) + givenWord4.toLowerCase().charAt(0) + "ay" + " ");
		/*System.out.print(givenWord5.substring(1,args[4].length()) + givenWord5.toLowerCase().charAt(0) + "ay" + " ");
		System.out.print(givenWord6.substring(1,args[5].length()) + givenWord6.toLowerCase().charAt(0) + "ay" + " ");
		System.out.print(givenWord7.substring(1,args[6].length()) + givenWord7.toLowerCase().charAt(0) + "ay" + " ");
		System.out.print(givenWord8.substring(1,args[7].length()) + givenWord8.toLowerCase().charAt(0) + "ay" + " ");
		System.out.print(givenWord9.substring(1,args[8].length()) + givenWord9.toLowerCase().charAt(0) + "ay" + " ");*/
	}
}