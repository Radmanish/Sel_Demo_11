package interviewPrep;

import java.util.HashMap;

public class CountAlphabet {
	
	
	
	public static void main(String[] args) {
		
		String text = "United States is one the United is pwerful one country is in the world ";
		
		HashMap<Character,Integer> Alphabet = new HashMap<Character, Integer>();
		
		for(char c:text.toCharArray() ) {
			
			if(Alphabet.containsKey(c)) {
			
				Alphabet.put(c, Alphabet.get(c)+1);
			}
			
			else {
				
				Alphabet.put(c, 1);
			}
			
		}
		
		System.out.println(Alphabet);
	}
	

}
