package project.martin;

public class VowelCounter {
	private int numberOfA;
	private int numberOfE;
	private int numberOfI;
	private int numberOfO;
	private int numberOfU;

	public int getNumberOfA() { 
        return numberOfA; 
    } 
	
	public int getNumberOfE() { 
        return numberOfE; 
    }
	
	public int getNumberOfI() { 
        return numberOfI; 
    } 
	
	public int getNumberOfO() { 
        return numberOfO; 
    } 
	
	public int getNumberOfU() { 
        return numberOfU; 
    } 

	public void countVowels(String word) {
		for(int i = 0; i < word.length(); i++) {
			if(word.charAt(i) == 'A' || word.charAt(i) == 'a') {
				numberOfA++;
			}
			if(word.charAt(i) == 'E' || word.charAt(i) == 'e') {
				numberOfE++;
			}
			if(word.charAt(i) == 'I' || word.charAt(i) == 'i') {
				numberOfI++;

			}
			if(word.charAt(i) == 'O' || word.charAt(i) == 'o') {
				numberOfO++;
			}
			if(word.charAt(i) == 'U' || word.charAt(i) == 'u') {
				numberOfU++;
			}
		}
	}
	
	public String countAllVowels() {
        return "Number of A:" + getNumberOfA() + "\n" + "Number of E:" + getNumberOfE() + "\n" + "Number of I:" + getNumberOfI() + "\n" + "Number of O:" + getNumberOfO() + "\n" + "Number of U:" + getNumberOfU();
    }
}