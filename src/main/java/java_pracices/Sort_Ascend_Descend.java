package java_pracices;

import java.util.Arrays;

public class Sort_Ascend_Descend {

	public static void sort_Descending(int[] arr)
	{
		int len = arr.length;
		int temp = 0;
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
		}	}	}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort_Ascending(int[] arr)
	{
		int len = arr.length;
		int temp = 0;
		
		 for( int i=0; i<len; i++) {
			 for (int j= i+1; j<len; j++) {
				 if( arr[i] < arr[j] )
				 {
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
			} 	}	}
		 System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 30,50,10,70,100,10 };
		sort_Descending(arr);
		sort_Ascending(arr);
		

	}

}
