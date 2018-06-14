package project.martin;

public class VowelCounterDriver {
	public static void main(String[] args) {
		VowelCounter occurences = new VowelCounter();
		occurences.countVowels("The quick brown fox jumps over the lazy brown cow.");
		System.out.print(occurences.getNumberOfA());
		System.out.print(occurences.getNumberOfE());
		System.out.print(occurences.getNumberOfI());
		System.out.print(occurences.getNumberOfO());
		System.out.print(occurences.getNumberOfU());
		
	}
}
