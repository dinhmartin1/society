package project.martin;

public class Reverse {

	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			for (int j = args[i].length()-1; j >= 0; j--) {
				System.out.print(args[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}