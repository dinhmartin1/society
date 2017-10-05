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
	
	String givenWord = "Hello";
	public static String reverseFunction(String givenWord) {
		String reverse = givenWord.substring(1,givenWord.length()) + givenWord.charAt(0);
		return reverse;
	}*/
	private String word;
	
	public Reverse(String givenWord) {
		this.word = givenWord;
	}
	
	public String reverseWord() {
		String function = word.substring(word.length(),word.length()) + word.charAt(5) + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
		return function;
	}
	
	public String toString() {
		return word + " ";
	}
	
	public static void main(String args[]) {  
		Reverse s1 = new Reverse("martin");   
		System.out.print(s1.reverseWord());
	}
}