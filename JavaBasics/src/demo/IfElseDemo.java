package demo;

import java.util.Scanner;

public class IfElseDemo {
	
     public static void main(String[] args) {
		
    	 
    	 Scanner scan = new Scanner (System.in);
    	 
    	 System.out.println("Enter your age");
    	 
    	 int age = scan.nextInt();
    	 
    	 
    	 if (age>=16 && age <=18) {
    		 System.out.println();
    	 }
    	 if (age >18) {
    		 
    		 System.out.println("you are elegble for a driving Lisence");
    	 }
    	 
    	 else {
    		 System.out.println("you are not elegebale for Driving License");
    	 }
	}
	

}
