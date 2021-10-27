import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class ccNew
	{
		static long cardNumber; 
		static long [] moneyMaker = new long[16];
		static int validCCCounter = 0;
				
				
		 public static void main(String[] args) throws IOException
			{
				Scanner myCredit = new Scanner(new File("CreditCard2.txt"));
				while(myCredit.hasNext())
					{
						cardNumber = myCredit.nextLong();
						fillArray();
						Real1();
					}
				
				System.out.println("\nThis list contains " + validCCCounter + " potentially valid credit card numbers");
				
			}
		 
		 
		 
		 public static void fillArray() throws IOException
			 {
			 
				 for (int y = 15; y >= 0; y--)
					 {
					 
						 moneyMaker[y] = cardNumber % 10;
						 cardNumber = cardNumber / 10;
						
						 
					 }
				
				 
			 }	
		 
		 
		 public static void Real1() throws IOException
				{
					
					long [] nArray = new long[16];
					//counters
					int countA = 1;
					int countB = 0;
						for (int i = 0; i < moneyMaker.length; i += 2)
							{
								//doubling every other number in array
								long dig = moneyMaker[i];
								dig = dig * 2;
							
								//change numbers if more than 10
								if (dig >= 10)
									{
										long kill = dig % 10;
										long slice = kill + 1;
										moneyMaker[i] = slice;
									}
								else
									{
										moneyMaker[i] = dig;
									}
							
								//replacing old array with new values
								
								nArray[countB] = moneyMaker[i];
								System.out.print(nArray[countB]);
								countB++;
								nArray[countB] = moneyMaker[countA];
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
						
//						for (int t = 0; t < nArray.length; t ++)
//							{
								if (dTen == 0)
									{
										System.out.println("The credit card number: " + cardNumber + " is potentially valid");
										validCCCounter ++;
									}
								else
									{
										System.out.println("The credit card number: " + cardNumber + " is invalid");
									}
							//}
						
						
				}
		 
			

	}
