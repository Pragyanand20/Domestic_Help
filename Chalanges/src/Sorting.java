import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		int ar[] = { 3, 2, 4, 6, 3, 7 };
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				int t = 0;
				if (ar[i] > ar[j]) {
					t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}
}
