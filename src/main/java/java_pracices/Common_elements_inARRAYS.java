package java_pracices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Common_elements_inARRAYS {

	public static void commonELE_Using_forLoop(int[] arr1, int[] arr2)
	{
		ArrayList<Integer> common = new ArrayList<Integer>();
		
		for ( int i= 0; i<arr1.length; i++) {
			for ( int j=0; j< arr2.length; j++) {
				if( arr1[i] == arr2[j] )
				{
					common.add(arr1[i]);
		}	}	}
		System.out.println(common);
	}
	
	public static void commonELE_Using_ArrayList(int[] arr1, int[] arr2)
	{
		List<Integer> aray1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		List<Integer> aray2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		
		aray1.retainAll(aray2);
		System.out.println(aray1);
	}
	
	public static void main(String[] args) {
		
		int[] arr1 = { 4,2,3,1,6 };
		int[] arr2 = { 6,7,8,4 };
		
		List<Integer> aray1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
		List<Integer> aray2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
		
		List<Integer> common1 = aray1.stream().filter( aray2::contains).collect(Collectors.toList());
		
		List<Integer> common2 = aray1.stream().filter( a1->aray2.contains(a1)).collect(Collectors.toList());
		System.out.println(common1);
		System.out.println(common2);
		
	
	}

}
