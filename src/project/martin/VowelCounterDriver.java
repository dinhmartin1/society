package project.martin;

public class VowelCounterDriver {
	public static void main(String[] args) {
		VowelCounter occurences = new VowelCounter(5);
		
		
		occurences.countVowels("Abracadabra");
		System.out.print(occurences);
	}
}
