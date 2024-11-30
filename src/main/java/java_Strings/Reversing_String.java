package java_Strings;

public class Reversing_String {

	public static void reverse_String1(String str)
	{
		String reverse = "";
		
		for( int i=0; i<str.length(); i++)
		{
			reverse = str.charAt(i) + reverse;
		}
		System.out.println(reverse);
	}
	public static void reverse_String2(String str)
	{
		String reverse = "";
		
		for( int i=str.length()-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
	
	public static void main(String[] args) {
		
		String str = "EducationAcademy";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		
		
		
		

	}

}
