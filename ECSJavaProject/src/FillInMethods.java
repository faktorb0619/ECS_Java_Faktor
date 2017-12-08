// Fill-In Methods - Fix the broken methods and method calls.

public class FillInMethods
{
	public static void main( String[] args )
	{
		// Fill in the method calls where appropriate.

		System.out.println("Watch as we demonstrate methods.");

		System.out.println();
		System.out.println("I'm going to get a random character from A-Z");
		char c = 'F';
		// randchar();
		System.out.println("The character is: " + c );

		
		System.out.println("Now let's count from -10 to 10");
		int begin, end;
		begin = 1;
		end = 10;
		while(begin<=10)
		{
			System.out.println(begin);
			begin++;
		}
		// counter();
		System.out.println("How was that?");

		System.out.println();
		System.out.println("Now we take the absolute value of a number.");
		int x = -10;
		int y = -x;
		// abso();
		System.out.println("|" + x + "| = " + y );

		System.out.println();
		System.out.println("That's all.  This program has been brought to you by:");
		System.out.println("Programmed by Ben Faktor");
		System.out.println("Modified by Ben Faktor");
		System.out.println("This code is distributed under the terms of the BS liscence. Do whatever the h*ll you want.");
	}
}
	