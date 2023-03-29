import java.util.Arrays;

/*Given an array of integers, find two numbers 
 * such that they add up to a specific target
number.*/
public class TwoSum {
	public static void main(String[] args) {
		int ar[] = { 3, 2, 4, 5, 6, 5 };
		System.out.println(Arrays.toString(twoSum(ar, 6)));
	}

	static public int[] twoSum(int ar[], int target) {
		int temp = 0, a[] = new int[2];
		for (int i = 1; i < ar.length; i++) {
			for (int j = 0; j + i < ar.length; j++) {
				temp = ar[j] + ar[j + i];
				System.out.println(j + " " + (j + i) + " " + temp);
				if (target == temp) {
					a[0] = j;
					a[1] = j + i;
					return a;
				}
			}
		}
		return a;
	}
}
