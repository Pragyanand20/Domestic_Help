public class RomanToInt {
	public static void main(String[] args) {
		System.out.println(toInt("iv"));
	}

	static int toInt(String s) {
		String s1 = s.toLowerCase();
		int a = 0;
		int ar[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if (s1.charAt(i) == 'i') {
				ar[i] = 1;
			} else if (s1.charAt(i) == 'v') {
				ar[i] = 5;
			} else if (s1.charAt(i) == 'x') {
				ar[i] = 10;
			} else if (s1.charAt(i) == 'l') {
				ar[i] = 50;
			} else if (s1.charAt(i) == 'c') {
				ar[i] = 100;
			} else if (s1.charAt(i) == 'd') {
				ar[i] = 500;
			} else if (s1.charAt(i) == 'm') {
				ar[i] = 1000;
			}
		}
		a = ar[0];
		for (int k = 1; k < ar.length; k++) {
			if (ar[k - 1] >= ar[k]) {
				a = a + ar[k];
			} else if (k > 1) {
				a = a + (ar[k] - ar[k - 1] * 2);
			} else {
				a = (ar[k] - ar[k - 1]);
			}
		}
		return a;
	}
}