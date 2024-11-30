package java_Strings;

import java.util.Arrays;
import java.util.stream.Stream;

public class merge_2Arrays {

	public static void merge_forLoop(String[] arr1, String[] arr2)
	{
		String[] merge = new String[arr1.length + arr2.length];
		int index = 0;
		
		for ( String a1 : arr1 )
		{
			merge[index++] = a1;
		}
		for (String a2 : arr2)
		{
			merge[index++] = a2;
		}
		System.out.println(Arrays.toString(merge));
	}
	
	public static void main(String[] args) {

		String[] arr1 = { "ab", "cd" };
		String[] arr2 = { "ef", "gh" };
		// merge_forLoop(arr1, arr2);

		Stream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).forEach(s -> System.out.println(s));
		
		
	}

}
