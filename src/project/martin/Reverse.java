package project.martin;

public class Reverse {

	/*public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			for (int j = args[i].length()-1; j >= 0; j--) {
				System.out.print(args[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}*/

	private String[] word;
	
	public Reverse(String[] givenWord) {
		this.word = givenWord;
	}
	
	public String reverseWord(String[] args) {
		String blank = "";
		
		for(int i = 0; i < word.length; i++) {
			for (int j = word[i].length()-1; j >= 0; j--) {
				blank = blank + (word[i].charAt(j));
			}
			blank = blank + " ";
		}
		return blank;
	}
	
	public String toString() {
		return word + " ";
	}
	
	public static void main(String args[]) {  
		Reverse words = new Reverse(args);   
		System.out.print(words.reverseWord(args));
	}
 }