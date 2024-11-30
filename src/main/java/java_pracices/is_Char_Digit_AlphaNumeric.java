package java_pracices;

import java.util.Arrays;

public class is_Char_Digit_AlphaNumeric {

	public static void main(String[] args) {
		
		String str = "abc456efg@#$123^&*";
		
		char[] dig = new char[6];
		char[] cha = new char[6];
		char[] spec = new char[6];
		int d =0, c =0, sp =0;	
		
		for (int i=0; i < str.length(); i++)
		{
			if ( Character.isDigit(str.charAt(i)))
			{
				dig[d] = str.charAt(i);
				d++;
			}
			else if (Character.isAlphabetic(str.charAt(i)))
			{
				cha[c] = str.charAt(i);
				c++;
			}
			else
			{
				spec[sp] = str.charAt(i);
				sp++;
			}
		}
		System.out.println(Arrays.toString(dig ));
		System.out.println(Arrays.toString(cha));
		System.out.println(Arrays.toString(spec));

	}

}
