import java.util.Scanner;

public class UserInputOfData
{
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String first_name, last_name, login;
		int age, student_id, grade;
		double gpa;
		
		System.out.println( "First name: ");
		first_name = keyboard.next();
		
		System.out.println( "Last name: ");
		last_name = keyboard.next();
		
		System.out.println( "Grade (9-12): ");
		grade = keyboard.nextInt();
		
		System.out.println( "Student ID: ");
		student_id = keyboard.nextInt();
		
		System.out.println( "Login: ");
		login = keyboard.next();
		
		System.out.println( "GPA (0.0 - 5.0): ");
		gpa = keyboard.nextDouble();
		
		System.out.println( "Your information: ");
		
		System.out.println( "Login: " + login);
		
		System.out.println( "ID: " + student_id);
		
		System.out.println( "Name: " + last_name + ", " + first_name);
		
		System.out.println( "GPA: " + gpa);
		
		System.out.println( "Grade: " + grade);
		
		
		
	}
}