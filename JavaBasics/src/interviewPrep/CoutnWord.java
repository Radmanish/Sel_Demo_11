package interviewPrep;

import java.util.HashMap;

public class CoutnWord {

	
	
	public static void main(String[] args) {
		
		String text = "United States is one the United is pwerful one  country  is in the world ";
		
		HashMap<String,Integer> words = new HashMap<String, Integer>();
		
		for(String c:text.split(" ") ) {
			
			if(words.containsKey(c)) {
				
				words.put(c, words.get(c)+1);
			}
			
			else {
				
				words.put(c, 1);
			}
		}
		System.out.println(words);
	}
	
	
	
	
}
