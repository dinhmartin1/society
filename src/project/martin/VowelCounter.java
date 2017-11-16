package project.martin;

import java.util.ArrayList;
import java.util.HashMap;

public class VowelCounter {
	private HashMap<String, Integer> eachVowel = new HashMap<String, Integer>();
	
	public VowelCounter(){
		
		eachVowel.put("a",0);
		eachVowel.put("e",0);
		eachVowel.put("i",0);
		eachVowel.put("o",0);
		eachVowel.put("u",0);
	}
	
	public String getVowel(Vowel sentence){
		if(sentence.getLetter() == 'a'){
			eachVowel.get("a").add(sentence);
			return "a";
		}
		else if(sentence.getLetter() == 'e'){
			eachVowel.get("e").add(sentence);
			return "e";
		}
		else if(sentence.getLetter() == 'i'){
			eachVowel.get("i").add(sentence);
			return "i";
		}
		else if(sentence.getLetter() == 'o'){
			eachVowel.get("o").add(sentence);
			return "o";
		}
		else if(sentence.getLetter() == 'u'){
			eachVowel.get("u").add(sentence);
			return "u";
	}
}
