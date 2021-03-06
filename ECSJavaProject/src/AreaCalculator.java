import java.util.Scanner;

public class AreaCalculator
{
	public static void main(String[] args)
	{
		
	Scanner k = new Scanner(System.in);
	int ans;
	
	System.out.println( "Choose a shape: " );
	System.out.println( "1. Tri   2. Cir" );
	System.out.println( "3. Rec   4. Sqr" );
	System.out.println( "5. Quit" );
	ans = k.nextInt();
	
	if ( ans == 1 )
	{
		tri();
	}
	
	if ( ans == 2 )
	{
		cir();
	}

	if ( ans == 3 )
	{
		rec();
	}
	
	if ( ans == 4 )
	{
		sqr();
	}
	
	if ( ans == 5 )
	{
		System.out.println( "You quit!" );
	}
}
	
public static void tri()
{
	Scanner k = new Scanner(System.in);
	
	double height, base;
		
	System.out.println( "Please input Height: " );
	height = k.nextDouble();
	
	System.out.println( "Please input Base " );
	base = k.nextDouble();
	
	System.out.println( "The area of your triangle is " + ((base * height)/2) );
}

public static void cir()
{
	Scanner k = new Scanner(System.in);
	
	double radius;
		
	System.out.println( "Please input Radius: " );
	radius = k.nextDouble();
	
	System.out.println( "The area of your circle is " + (Math.PI * (radius * radius) ) );
	
}

public static void rec()
{
	Scanner k = new Scanner(System.in);
	
	double height, base;
		
	System.out.println( "Please input Height: " );
	height = k.nextDouble();
	
	System.out.println( "Please input Base " );
	base = k.nextDouble();
	
	System.out.println( "The area of your rectangle is " + (base * height) );
}

public static void sqr()
{
	Scanner k = new Scanner(System.in);
	
	double side;
		
	System.out.println( "Please input Side: " );
	side = k.nextDouble();
	
	
	System.out.println( "The area of your square is " + (side * side) );
	}
}