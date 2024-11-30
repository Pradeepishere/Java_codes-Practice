package java_pracices;

public class fibonacci {

	public static void main(String[] args) {
		
		int[] num = { 1,2,4,3,5 };
		int sum = 0;
		
		for ( int i =0; i<num.length; i++)
		{
			sum = sum + num[i];
		}
		System.out.println(sum);
	}

}
