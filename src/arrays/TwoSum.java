package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// logic : target 9  - > map initially empty > 9 - each element in array> 

public class TwoSum {
	public static void main(String[] args) {
		int[] a = { 2, 0, 11, 15 ,9};
		int target = 9;
	    int [] result= 	twoSum(a, target);
		System.out.println(Arrays.toString(result));
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if (map.containsKey(target - nums[i])) {
				return new int[] {map.get(target - nums[i]), i};
			} 
			map.put(nums[i], i);
		}
		return new int[] {};
	}

}
