package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, find two numbers 
 * such that they add up to a specific target
number.*/
public class TwoSum1 {
	public static void main(String[] args) {
		int ar[] = { 2, 7, 11, 15 };
		System.out.println(Arrays.toString(twoSum(ar, 9)));
	}

	static public int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			int x = numbers[i];
			System.out.println(map);
			if (map.containsKey(target - x)) {
				return new int[] { map.get(target - x), i };
			}
			map.put(x, i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
