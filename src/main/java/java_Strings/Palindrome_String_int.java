package java_Strings;

public class Palindrome_String_int {

	public static void palindrome_String(String str)
	{
		int len = str.length();
		int mid = str.length() / 2;
		int end = str.length() - 1;
		boolean pal = false;
		
		for( int i= 0; i< mid; i++)
		{
			if( str.charAt(i) == str.charAt(end)) {
				end--;
				pal = true;
			}
			else {
				pal = false;
				break;
			}
		}
		if(pal == true) {
			System.out.println(str +" : it is Palindrome");
		}
		else if (pal == false) {
			System.out.println(str +" : it is NOT a Palindrome");
		}
	}
	
	public static void palindrome_int(int num)
	{
		int n = num;
		int rem = 0;
		int rev = 0;
		
		while( n != 0 )
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		if (rev == num) {
			System.out.println(num +" : is Palindrome");
		}
		else System.out.println(num +" : is NOT PALindrome");
	}
	
	public static void main(String[] args) {
		
		String str = "madam";
		palindrome_String(str);
		
		int num = 12321;
		palindrome_int(num);
		
	}

}
