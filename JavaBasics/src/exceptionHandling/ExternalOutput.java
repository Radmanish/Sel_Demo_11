package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExternalOutput {
	
	public static void main(String[] args) throws FileNotFoundException   {
		
		File file = new File("C:\\Users\\fawad\\OneDrive\\Desktop\\EZCODE\\Output.txt"); 
		
		PrintWriter p = new PrintWriter(file);
		p.print("nhgdgfhfghdgfhgfhhhhhhhhhhhh");
		p.close();
		
	}

}
