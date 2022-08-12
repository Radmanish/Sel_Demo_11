package interviewPrep;

import java.util.ArrayList;

public class FeboncciNumbers {
	
	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13 21
		
			// TODO Auto-generated method stub

			ArrayList <Integer> nums = new ArrayList <>();
			
			//nums = {0 , 1 , 1 , 2}
			
			nums.add(0);
			nums.add(1);
			
			
			for( int i = 0  ; i>=-30 ; i--) {
				
				nums.add(nums.get(nums.size()-1)+nums.get(nums.size()-2));
			}
			
			System.out.println(nums);
		
	}

	
		
	}

	
	
	
	

