package java_pracices;

public class Min_Max {

	public static void main(String[] args) {
		
		int[] arr = { 30,50,10,70,100,10 };
		int len = arr.length;
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<len; i++) 
			{
				if( max < arr[i] )
				{
					max = arr[i];
				}
				else if ( min > arr[i])
				{
					min = arr[i];
				}
			}
		System.out.println( "Maximum = "+max +" , Minimum = "+min);
		
		
		
	}

}
