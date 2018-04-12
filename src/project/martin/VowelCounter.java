package project.martin;

public class VowelCounter {
	private int numberOfA;

	public VowelCounter(int vowels) {
        this.numberOfA = vowels;
    }
	
	public int getnumberOfA() { 
        return numberOfA; 
    } 

	public void countVowels(String word) {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'A' || word.charAt(i) == 'a') {
				numberOfA++;
			}
		}
	}
}