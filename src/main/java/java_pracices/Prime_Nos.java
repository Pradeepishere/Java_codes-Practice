package java_pracices;

import java.util.Arrays;

public class Prime_Nos {
	
	public static void is_Prime_orNOT(int num)
	{
		int count = 0;
		
		for (int i =2; i< num / 2; i++) {
			if( num % i == 0 ) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println( num +" = is a Prime"  );
		}
		else 
			System.out.println( num +" = is NOT a Prime"  );
	}

	public static void prime_upto_Num(int num)
	{
		for (int i=2; i<num; i++) {
			int count = 0;
			for (int j=1; j<= i; j++) 
			{
				if ( i % j == 0 )
				{
					count++;
				}
			}
			if (count == 2)
			{
				System.out.print(i +", ");
			}
		}	
	}
	
	public static void main(String[] args) {
		
		int num = 29 ;
		is_Prime_orNOT(num);

		prime_upto_Num(num);
		
		

	}

}
