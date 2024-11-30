package java_Strings;

import java.util.Arrays;

public class print_0_atEnd_ofArray {

	public static void main(String[] args) {

		int[] arr = { 2, 1, 0, 4, 7, 0, 5,0 };
		int n = 0 	,		index = 0 ;
		int [] newarr = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			if ( arr[i] != n )
			{
				newarr[index++] = arr[i];
			}
		}
		if ( index < arr.length )
		{
			newarr[index++] = n;
		}
		System.out.println(Arrays.toString(newarr ));
		
	}

}
