package collections_Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_repeated_Char {
	
	public static void remove_repeat_Char_loop(String str)
	{
		char[] chr = str.toCharArray();
		String s = "";
		
		for(int i=0; i<str.length(); i++) {
			for ( int j=i+1; j<str.length(); j++) 
			{
				if ( chr[i] == chr[j])
				{
					chr[j] = '-';
		}	}	}
		for (char c : chr) {
			if ( c != '-')   // or  if ( !(c == '-') )
			{
				s = s + c;
		}   }
		System.out.println(s);
	}

	public static void remove_repeated_Char_Set(String str)
	{
		Set<Character> set = new LinkedHashSet<Character>();
		String s = "";
		for (int i=0; i<str.length(); i++) 
		{
			set.add(str.charAt(i));
		} 
		for( char c : set)
		{
			s = s + c ;
		}
		System.out.println(s);
	}
	public static void remove_repetedChar_indexof(String str)
	{
		String s = "";
		for ( int i=0; i<str.length(); i++)
		{
			if (s.indexOf(str.charAt(i)) < 0 || str.charAt(i) == ' ' )
			{
				s = s + str.charAt(i);
			}
		}
		System.out.println(s);
	}
	
	public static void main(String[] args) {

		String str = "MadamM racwe";
	//	remove_repeat_Char_loop(str);
	//	remove_repeated_Char_Set(str);
		
		remove_repetedChar_indexof(str);
		
	}

}
