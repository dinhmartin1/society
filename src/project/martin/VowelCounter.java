package project.martin;

public class VowelCounter {

	private int numberOfA;
	//private int numberOfA = 0;
	
	public void countVowels(String word) {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'A' || word.charAt(i) == 'a') {
				numberOfA++;
			}
		}
	}
}