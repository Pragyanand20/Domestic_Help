package LeetCode;

import java.util.Arrays;

public class TwoSum2 {
	public static void main(String[] args) {
		int ar[]= {2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(twoSum(ar,16)));
	}
	static public int[] twoSum(int[] numbers, int target) {
		// Assume input is already sorted.
		for (int i = 0; i < numbers.length; i++) {
		int j = bsearch(numbers, target - numbers[i], i + 1);
		if (j != -1) {
		return new int[] { i + 1, j + 1 };
		}
		}
		throw new IllegalArgumentException("No two sum solution");
		}
		private static int bsearch(int[] A, int key, int start) {
		int L = start, R = A.length - 1;
		while (L < R) {
		int M = (L + R) / 2;
		if (A[M] < key) {
		L = M + 1;
		} else {
		R = M;
		}
		}
		return (L == R && A[L] == key) ? L : -1;
	}
}

