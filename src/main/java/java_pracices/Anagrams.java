package java_pracices;

import java.util.Arrays;

public class Anagrams {
	
	public static void anagrams(String str1, String str2)
	{
		 char[] arr1 = str1.toLowerCase().toCharArray();
		 char[] arr2 = str2.toLowerCase().toCharArray();
		 
		 if (str1.length() == str2.length()) 
		 {
			 Arrays.sort(arr1);
			 Arrays.sort(arr2);
			 
			 if(Arrays.equals(arr1, arr2))
			 {
				 System.out.println("str1 & str2 are Equals, they are ANAGRAMS");
			 }
			 else
				 System.out.println("str1 & str2 are NOT Anagrams");
		 }
		 else
			 System.out.println("str1 & str2 are NOT Anagrams");
	}

	public static void main(String[] args) {
		
		String str1 = "Army";
		String str2 = "Mary";
		
		anagrams(str1, str2);
		
		
		

	}

}
