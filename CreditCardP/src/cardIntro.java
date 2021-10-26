import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class cardIntro
	{
		public static void main(String[] args) throws IOException
			{
				//importCredit();
				//Practice1();
				
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
		
		public static void Practice1() throws IOException
		{
			//practice code before use text file
			
			//mock arrays
			long [] practice1 = {5,4,2,4,1,8,0,1,2,3,4,5,6,7,8,9};
			long [] practice2 = {4,4,8,1,3,5,7,9};
			long [] nArray = new long[16];
		
			int countA = 1;
			int countB = 0;
				for (int i = 0; i < practice1.length; i += 2)
					{
						//change every other number in array
						long dig = practice1[i];
						dig = dig * 2;
					
						//change numbers if more than 10
						if (dig >= 10)
							{
								long kill = dig % 10;
								long slice = kill + 1;
								practice1[i] = slice;
							}
						else
							{
								practice1[i] = dig;
							}
					
						//replacing old array with new values
						
						nArray[countB] = practice1[i];
						System.out.print(nArray[countB]);
						countB++;
						nArray[countB] = practice1[countA];
						System.out.print(nArray[countB]);
						countB++;
						countA += 2;
					}
				
				
				//sum divisible by ten?
				int sum = 0;
				int dTen = 0;
				for (int p = 0; p < nArray.length; p ++)
					{
						sum += nArray[p];
					}
			
				dTen = sum % 10; 
				
				for (int t = 0; t < nArray.length; t ++)
					{
						if (dTen == 0)
							{
								System.out.println("The credit card number: " + nArray[t] + " is valid");
							}
						else
							{
								System.out.println("The credit card number: " + nArray[t] + " is invalid");
							}
					}
				
				
		}
		
		
	}
