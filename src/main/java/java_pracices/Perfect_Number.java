package java_pracices;

public class Perfect_Number {
	
	public static void perfect_No( int num)
	{
int sum = 0;
		
		for (int i= 1; i<num; i++)
		{
			if ( num % i == 0 )
			{
				sum = sum + i;
			}
		}
		if (num == sum ) {
			System.out.println( sum +" : is Perfecrt No." );
		}
		else 
			System.out.println( sum +" : is NOT Perfect No.");
	}

	public static void main(String[] args) {
		
		int num = 1275;
		perfect_No(num);

	}

}
