package demo;

import java.util.Scanner;

public class IfElseString {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("what time is it? ");
		
		String time = scanner.nextLine();
		
		if (time.equals("morning")) {
			
			System.out.println("make Breakfast");
		}
		
		else if(time.equals("afternoon")) {
			
			System.out.println("make lunch");
		}
		
		else if (time.equals("two and thirty")) {
			
			System.out.println("make a juice");
		}
		
		else {System.out.println("Make dinner");
		
		
	}

}
}
