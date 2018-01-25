package project.martin;

/*import java.util.ArrayList;
import java.util.HashMap;*/

public class VowelCounter {
	/*private HashMap<String, Integer> eachVowel = new HashMap<String, Integer>();
	
	public VowelCounter(String sentence){
		
		eachVowel.put("vowelA",0);
		eachVowel.put("vowelE",0);
		eachVowel.put("vowelI",0);
		eachVowel.put("vowelO",0);
		eachVowel.put("vowelU",0);
	}
	*/
	
	public String countVowels(String sentence){
        int vowelA = 0;
        int vowelE = 0;
        int vowelI = 0;
        int vowelO = 0;
        int vowelU = 0;
        
        String vowel = "";
        vowel = vowel + vowelA + vowelE + vowelI + vowelO + vowelU;
        
        for (int i = 0; i < sentence.length(); i++){
        	if (sentence.charAt(i) == 'a'){
        		vowelA++;
        	}
        	else if (sentence.charAt(i) == 'e'){
        		vowelE++;
        	}
        	else if (sentence.charAt(i) == 'i'){
        		vowelI++;
        	}
        	else if (sentence.charAt(i) == 'O'){
        		vowelO++;
        	}
        	else{
        		vowelU++;
        	}
        }
        return vowel;
    }
}
