import java.util.Scanner;

public class Calculator
{
	public static void main(String[] args)
	{
		
	Scanner k = new Scanner(System.in);
	int ans;
	
	System.out.println( "Choose an operation: " );
	System.out.println( "1. Addition   2. Subtraction" );
	System.out.println( "3. Multiplication   4. Division" );
	System.out.println( "5. Power" );
	ans = k.nextInt();
	
	if ( ans == 1 )
	{
		add();
	}
	
	if ( ans == 2 )
	{
		sub();
	}

	if ( ans == 3 )
	{
		mult();
	}
	
	if ( ans == 4 )
	{
		div();
	}
	
	if ( ans == 5 )
	{
		pow();
	}
}
	
public static void add()
{
	Scanner k = new Scanner(System.in);
	
	double a, b;
		
	System.out.println( "Please input first number: " );
	a = k.nextDouble();
	
	System.out.println( "Please input second number " );
	b = k.nextDouble();
	
	System.out.println( "The sum of the numbers is " + (a + b) );
}

public static void sub()
{
	Scanner k = new Scanner(System.in);
	
	double a, b;
		
	System.out.println( "Please input first number: " );
	a = k.nextDouble();
	
	System.out.println( "Please input second number " );
	b = k.nextDouble();
	
	System.out.println( "The difference is " + (a - b) );
	
}

public static void mult()
{
	Scanner k = new Scanner(System.in);
	
	double a, b;
		
	System.out.println( "Please input first number: " );
	a = k.nextDouble();
	
	System.out.println( "Please input second number " );
	b = k.nextDouble();
	
	System.out.println( "The product is " + (a * b) );
}

public static void div()
{
	Scanner k = new Scanner(System.in);
	
	double a, b;
		
	System.out.println( "Please input first number: " );
	a = k.nextDouble();
	
	System.out.println( "Please input second number " );
	b = k.nextDouble();
	
	System.out.println( "The quotient is " + (a / b) );
	}


public static void pow()
{
	Scanner k = new Scanner(System.in);
	
	double a, b;
		
	System.out.println( "Please input first number: " );
	a = k.nextDouble();
	
	System.out.println( "Please input second number " );
	b = k.nextDouble();
	
	System.out.println( "The answer is " + Math.pow(a,b) );
	}
}