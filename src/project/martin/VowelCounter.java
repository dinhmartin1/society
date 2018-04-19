package project.martin;

public class VowelCounter {
	private int numberOfA;

	public int getNumberOfA() { 
        return numberOfA; 
    } 

	public void setNumberOfA(int letterA) {
        this.numberOfA = letterA;
    }
	
	public void countVowels(String word) {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'A' || word.charAt(i) == 'a') {
				numberOfA++;
			}
		}
	}
}