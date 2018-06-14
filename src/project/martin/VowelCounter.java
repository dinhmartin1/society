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
				System.out.println("numberOfA");
			}
			if(word.charAt(i) == 'E' || word.charAt(i) == 'e') {
				numberOfE++;
				System.out.println("numberOfE");
			}
			if(word.charAt(i) == 'I' || word.charAt(i) == 'i') {
				numberOfI++;
				System.out.println("numberOfI");
			}
			if(word.charAt(i) == 'O' || word.charAt(i) == 'o') {
				numberOfO++;
				System.out.println("numberOfO");
			}
			if(word.charAt(i) == 'U' || word.charAt(i) == 'u') {
				numberOfU++;
				System.out.println("numberOfU");
			}
		}
	}
}