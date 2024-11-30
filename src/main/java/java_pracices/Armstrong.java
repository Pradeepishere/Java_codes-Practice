package java_pracices;

public class Armstrong {
	
	public static void armstrong( int num)
	{
		int n = num;
		int arm  = 0;
		int rem = 0;
		
		while(n !=0)
		{
			rem = n % 10;
			arm = arm + (int)(Math.pow(rem, 3));
			n = n / 10;
		}
		if (num == arm ) {
			System.out.println( num +" : is ARMSTRONG  NUMBER" );
		}
		else
			System.out.println( num+" : is NOT Armstrong Number" );
		
	}

	public static void main(String[] args) {
		
		int num = 153;
		armstrong(num);
		

	}

}
