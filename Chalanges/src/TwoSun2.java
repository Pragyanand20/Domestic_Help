import java.util.Arrays;

/*Similar to Question [1. Two Sum], except that the input array is already sorted in
ascending order.*/
public class TwoSun2 {
	public static void main(String[] args) {
		int ar[] = { 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(twoSum(ar, 9)));
	}

	static public int[] twoSum(int ar[], int target) {
		int temp = 0, a[] = new int[2];
		for (int i = 0; i < ar.length; i++) {
			temp = ar[i];
			System.out.println(i);
			int f = Arrays.binarySearch(ar, (i + 1), (ar.length), (target - temp));
			if (f >= 0) {
				return new int[] { i, f };
			}
		}
		return new int[] { 0 };
	}
}
