package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Scanner scanner = new Scanner(System.in);
		
		
			try {System.out.println("Please enter a number:");
			int num1 = scanner.nextInt();
			
			System.out.println("Please enter another number:");
			
			int num2 = scanner.nextInt();
			System.out.println("Result :  " + (num1/num2));}
			
			catch (ArithmeticException e) {
				
				System.out.println("Please put another number not zero");
			}
			
			catch(InputMismatchException e) {
				
				System.out.println("Please put correct type ");
				
			}
			
			
		
	
}
}
