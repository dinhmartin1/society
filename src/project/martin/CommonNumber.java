package project.martin;

public class CommonNumber {

	public static void main(String[] args) {
		String word1 = "Huy";  
		String word2 = "My";  
		String sameCharacter = " ";  

		for(int i = 0; i < word1.length(); i++) {  
		    for(int j = 0; j < word2.length(); j++) {  
		        if(word1.charAt(i) == word2.charAt(j)) {  
		            sameCharacter += word1.charAt(i)+ " ";  
		        }  
		    }  
		}  
		System.out.println(sameCharacter);  

	}

}
