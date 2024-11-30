package collections_Practice;

import java.util.HashMap;

public class Occurence_ofChar {

	public static HashMap<Character, Integer> occurence_ofChar_forLoop(String str)
	{
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++)
		{
			int count = 0;
			if( ! hm.containsKey(str.charAt(i)))
			{
				hm.put(str.charAt(i), ++count);
			}
			else
			{
				int cnt = hm.get(str.charAt(i));
				hm.put(str.charAt(i), ++cnt);
			}
		}
		System.out.println(hm);
		return hm;
	}
	public static HashMap<Character, Integer> ocurence_ofChar_forEach(String str)
	{
		char[] chr = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char c : chr)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1 );
			}
			else
				hm.put(c, 1);
		}
		System.out.println(hm);
		return hm;
	}
	
	public static void main(String[] args) {
		
		String str = "madamnooram";
		ocurence_ofChar_forEach(str);
		
		
		
		

	}

}
