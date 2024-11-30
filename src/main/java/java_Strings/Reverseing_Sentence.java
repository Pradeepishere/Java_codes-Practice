package java_Strings;

public class Reverseing_Sentence {

	public static void Reverse_all(String str)
	{
		String reverse = "";
		
		for(int i =str.length()-1; i>=0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		System.out.println(reverse);
	}
	public static void Reverse_Word_inSamePosition(String str)
	{
		String reverse = "";
		String[] words = str.split(" ");
		
		for (int i=0; i<words.length; i++)
		{
			String word = words[i];
			for ( int j=word.length()-1; j>=0; j-- )
			{
				reverse = reverse + word.charAt(j);
			}
			reverse = reverse + " ";
		}
		
		System.out.println(reverse);
	}
	
	public static void reverse_words(String str)
	{
		String reverse = "";
		String[] words = str.split(" ");
		for( int i=words.length-1; i>=0; i-- )
		{
			reverse = reverse + " " + words[i];
		}
		System.out.println(reverse.trim());
	}
	
	public static void main(String[] args) {
		
		String str = "I Love India";
		
		reverse_words(str);
		Reverse_all(str);
		Reverse_Word_inSamePosition(str);

		

	}

}
