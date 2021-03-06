import java.util.Random;

import java.util.Scanner;

public class HiLowLimited
{
	Scanner keyboard = new Scanner(System.in);
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int tries = 7;
		int random = 1 + r.nextInt(100);
		int guess;
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it. ");
		guess = keyboard.nextInt();
		
		while (guess != random && tries > 0)
		{
			if(random > guess)
			{
				System.out.println("Sorry, that's too low. ");
				System.out.println("Try again: ");
				guess = keyboard.nextInt();
				tries--;
			}
			
			else if(random < guess)
			{
				System.out.println("Sorry, that's too high. ");
				System.out.println("Try again: ");
				guess = keyboard.nextInt();
				tries--;
			}
			
			else
			{
				System.out.println("Wow! That's right! What are the chances? ");
			}
		}
		
		if (tries>0)
		{
			System.out.println("Wow! That's right! What are the chances? ");
		}
		
		if(tries == 0)
		{
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
		}
	}
}
