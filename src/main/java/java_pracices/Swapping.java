package java_pracices;

public class Swapping {
	
	public static void swap_usingTEMP(int a, int b)
	{
		System.out.println("Before Swap : " +a  +", " +b);
		int temp = a;
		int aa = b;
		int bb = temp;
		System.out.println( "After Swap : " +aa +", " +bb );
	}
	public static void swap_using_Mul_Div(int a, int b)
	{
		System.out.println("Before Swap a : " +a  +", b : " +b);
		int aa = a * b;
		int bb = aa / b;
		    aa = aa / bb;
		
		System.out.println( "After Swap  a : " +aa +", b : " +bb );
	}
	public static void swap_using_Plus_minus(int a, int b)
	{
		System.out.println("Before Swap a : " +a  +", b : " +b);
		int aa = a + b;
		int bb = aa - b;
		    aa = aa - bb;
		System.out.println( "After Swap  a : " +aa +", b : " +bb );
	}

	public static void main(String[] args) {
		
		int a = 1;
		int b = 6;
		// swap_usingTEMP(a, b);
		// swap_using_Mul_Div(a, b);
		swap_using_Plus_minus(a, b);
		
		
		
	}

}
