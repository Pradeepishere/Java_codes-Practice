package collections_Practice;

import java.util.HashSet;
import java.util.Set;

public class Remove_repeated_StringsinArray {

	public static void main(String[] args) {

		String[] str = { "java", "ruby", "java", "api" };
		
		Set<String> set = new HashSet<String>();
		
		for (String s : str )
		{
			set.add(s);
		}
		System.out.println(set);
	}

}
