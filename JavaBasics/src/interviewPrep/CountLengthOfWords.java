package interviewPrep;

public class CountLengthOfWords {
	

	public static void main(String[] args) {
		
		String text = "United States is one the United is pwerful one country is in the world ";
		
		if (text == null || text.isEmpty()) {
			System.out.println(); } 
		
		String[] words = text.split("\\s+"); 
		
		System.out.println(words.length);
	}

}
