import java.util.Scanner;

public class BMICalcBetter 
{
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int feet, inches, weight;
		
		System.out.println("How many feet tall are you? ");
		feet = keyboard.nextInt();
		
		System.out.println("How many inches tall are you? ");
		inches = keyboard.nextInt();
		
		System.out.println("How much do you weigh? ");
		weight = keyboard.nextInt();
		
		System.out.println("Your BMI is " + (0.0254 / (weight * 0.453)) / (((12 * feet + inches) * 0.0254) * (12 * feet + inches) * 0.0254))) + ".");
		
		
	}
}
