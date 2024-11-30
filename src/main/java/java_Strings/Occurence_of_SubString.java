package java_Strings;

public class Occurence_of_SubString {

	public static void main(String[] args) {

		String str = "cathumancatmale";
		int fromindex = 0;
		String c = "cat";
		int count = 0;
		
		while ( (fromindex = str.indexOf( c , fromindex)) != -1)
		{
			System.out.print(fromindex +", ");
			fromindex = fromindex + c.length();
			count++;
		}
		System.out.println();
		System.out.println( count );
	}

}
