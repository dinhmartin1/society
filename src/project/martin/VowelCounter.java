package project.martin;

public class VowelCounter {

	private int numberOfA;

	public int getnumberOfA() { 
        return numberOfA; 
    } 

    public void setVowel(int vowel) { 
        this.numberOfA = vowel; 
    } 
    
	public void countVowels(String word) {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'A' || word.charAt(i) == 'a') {
				numberOfA++;
			}
		}
	}
}