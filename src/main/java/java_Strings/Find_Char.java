package java_Strings;

public class Find_Char {

	public static void main(String[] args) {

		String str = "MadamM";
		int count = 0;
		for (int i=0, j=0; i< str.length(); i++)
		{
			if ( str.charAt(i) == 'M')
			{
				count++;
				int index = str.indexOf(str.charAt(i) , +j) ;
				j++;
				System.out.println("'M' found at : " +index );	
			}
		}
		System.out.println("'M' count : " +count);
	}

}
