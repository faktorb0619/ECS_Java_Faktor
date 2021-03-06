import java.util.Scanner;

public class ALittleQuiz 
{
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int A1, A2, A3;
		
		System.out.println("Q1) What is the integral of 1/x from 5 to 10? ");
		System.out.println("1) 1/10");
		System.out.println("2) ln(2)");
		System.out.println("3) ln(5)");
		A1 = keyboard.nextInt();
		
		if(A1 == 1)
		{
			System.out.println("No. The correct answer is ln(2).");
		}
		
		else if(A1 == 2)
		{
			System.out.println("Correct!");
		}
		
		else
		{
			System.out.println("No. The correct answer is ln(2).");
		}
		
		
		
		System.out.println("Q1) What is the anti-derivative of sin(x) + 1/(1 + x^2)? ");
		System.out.println("1) cos(x) - 2x / (1 + x^2)^2");
		System.out.println("2) -cos(x) + tan^-1 (x)");
		System.out.println("3) -cos(x) + tan^-1 (x) + C");
		A2 = keyboard.nextInt();
		
		if(A2 == 1)
		{
			System.out.println("No, you took the derivative.");
		}
		
		else if(A2 == 2)
		{
			System.out.println("No, you forgot the +C");
		}
		
		else
		{
			System.out.println("Correct!");
		}
		
		
		
		System.out.println("Q1) What is the integral over all real numbers of e^(-x^2)? ");
		System.out.println("1) 1/e");
		System.out.println("2) ln(2)");
		System.out.println("3) sqrt(pi)");
		A3 = keyboard.nextInt();
		
		if(A3 == 1)
		{
			System.out.println("No, not even close.");
		}
		
		else if(A3 == 2)
		{
			System.out.println("No, not even close.");
		}
		
		else
		{
			System.out.println("Correct!");
		}
		
		System.out.println("Great job! You got 2 / 3 right!");
		
		System.out.println("Thanks for playing.");
		
		
	}
}
