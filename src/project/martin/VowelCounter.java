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
				System.out.println("Number of A: ");
				numberOfA++;
			}
			/*else if(word.charAt(i) == 'E' || word.charAt(i) == 'e') {
				System.out.println("Number of E: ");
				numberOfE++;
			}*/
			/*else if(word.charAt(i) == 'I' || word.charAt(i) == 'i') {
				System.out.println("Number of I: ");
				numberOfI++;
			}
			else if(word.charAt(i) == 'O' || word.charAt(i) == 'o') {
				System.out.println("Number of O: ");
				numberOfO++;
			}
			else if(word.charAt(i) == 'U' || word.charAt(i) == 'u') {
				System.out.println("Number of U: ");
				numberOfU++;
			}*/
		}
		//System.out.print("Number of A: ");
	}
}