package project.martin;

public class Reverse {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			String givenWord = args[i];
			char[] reverse = givenWord.toCharArray();
			
			for (int j = reverse.length-1; j >= 0; j--) {
				System.out.print(reverse[j]);
			}
			System.out.print(" ");
		}
	}
}