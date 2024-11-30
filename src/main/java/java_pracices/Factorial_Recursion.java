package java_pracices;

public class Factorial_Recursion {
	
	public static int factorial(int num)
	{
		if ( num == 0) {
			return 1;
		}
		else {
			return num * factorial( num-1 );
		}
	}

	public static void factorial_loop(int num)
	{
		int fact = 1;
		for ( int i=1; i<=5; i++ )
		{
			fact = fact * i;
		}
		System.out.println(fact);
	}
	
	public static void main(String[] args) {
		
		int num = 5;
		int fact = factorial(num);
		System.out.println(fact);
		
	}
}
