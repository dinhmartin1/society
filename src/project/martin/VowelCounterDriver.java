package project.martin;

public class VowelCounterDriver {
	public static void main(String[] args) {
		VowelCounter occurences = new VowelCounter();
		occurences.countVowels("The quick brown fox jumps over the lazy brown cow.");
		System.out.print(occurences.countAllVowels());
	}
}
