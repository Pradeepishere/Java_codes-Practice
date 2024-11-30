package Practice_project.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10,12,22,5,100,13);
		
		System.out.println(nums.stream().max(Integer::compareTo).orElse(0));
		
		 
		 
	}

}
