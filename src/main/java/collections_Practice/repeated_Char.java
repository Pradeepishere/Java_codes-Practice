package collections_Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class repeated_Char {
	
	public static void repeatedChar_EntrySet(String str)
	{
		HashMap<Character, Integer> hm = Occurence_ofChar.ocurence_ofChar_forEach(str);
		Set<Entry<Character, Integer>> es = hm.entrySet();
		for (Entry<Character, Integer> e : es)
		{
			if( e.getValue() > 1)
			{
				System.out.println("Key : "+e.getKey() +" , Value : "+e.getKey());
		}	}
	}
	
	public static void repeated_char_KeySet(String str)
	{
		HashMap<Character, Integer> hm = Occurence_ofChar.occurence_ofChar_forLoop(str);
		Set<Character> allkeys =  hm.keySet();
		for (Character ke : allkeys)
		{
			if (hm.get(ke) > 1) 
			{
				System.out.println("Key : "+ke +" , Value : "+hm.get(ke));
	}	}	}

	public static void main(String[] args) {

		String str = "madamnoora";
		// repeated_char_KeySet(str);
			
		
		
	}

}
