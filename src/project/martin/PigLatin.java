package project.martin;

public class PigLatin {

	public static void main(String[] args) {
		String givenWord = args[0];
		
		char vowel = Character.toLowerCase(givenWord.charAt(0));
		
		if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
			String convertToPigLatin = givenWord + "ay";
			System.out.println(convertToPigLatin);
			System.out.println(givenWord);
		}
	}
}
