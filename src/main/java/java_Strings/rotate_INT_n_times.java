package java_Strings;

import java.util.Arrays;

public class rotate_INT_n_times {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		int last = 0;
		int n = 3;
		System.out.println(Arrays.toString(num));
		
		for ( int i=0; i<n; i++)
		{
			last = num [num.length - 1] ;
			
			for (int j = num.length - 1; j > 0; j--)
			{
				num[j] = num[ j-1 ];
			}
			
			num[0] = last;
		}
		System.out.println(Arrays.toString(num));

	}

}
