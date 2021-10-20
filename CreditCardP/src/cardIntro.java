import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class cardIntro
	{
		public static void main(String[] args) throws IOException
			{
				importCredit();
				
				
			}

		public static void importCredit() throws IOException
		{
			
			Scanner myCredit = new Scanner(new File("CreditCardBoi.txt"));
			
			while(myCredit.hasNext())
				{
					String letter = myCredit.nextLine();
					System.out.println(letter);
			
			
			
	        	}
		
		
		
		
		
	    }
	}
