import java.util.Scanner;

public class TwoQuestions
{
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int A1, A2;
		
		System.out.println( "Think of an object, and I'll try to guess what is it! ");
		
		System.out.println( "Is it an 1) animal, 2) vegetable, or 3) mineral? ");
		A1 = keyboard.nextInt();
		
		System.out.println( "Is it bigger than a breadbox? (yes (1) or no(2)");
		A2 = keyboard.nextInt();
		
		if(A1 == 1)
		{
			if(A2 == 1)
			{
				System.out.println( "Is it a MOOSE?! ");
			}
			
			else
			{
				System.out.println( "Is it a SQUIRREL?! ");
			}
			
		}
		
		else if(A1 == 2)
		{
			if(A2 == 1)
			{
				System.out.println( "Is it a WATERMELON?! ");
			}
			
			else
			{
				System.out.println( "Is it a CARROT?! ");
			}
			
		}
		
			if(A1 == 3)
			{
				if(A2 == 1)
				{
					System.out.println( "Is it a CAMERO?! ");
				}
				else
				{
					System.out.println( "Is it a PAPER CLIP?! ");
				}
			}
			
			
		}
			
	}
