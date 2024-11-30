package java_Strings;

public class STRING_toINT_without_InBuilt {

	public static void main(String[] args) {

		String str = "123456789";
		int n = 0;
		
		for (int i=0; i<str.length(); i++ )
		{
			n = n * 10 + ((int) str.charAt(i) - 48 );
			System.out.println(n);
		}
		System.out.println(n);
		
		

	}

}
