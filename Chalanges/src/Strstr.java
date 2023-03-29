
public class Strstr {
	public static void main(String[] args) {
		String s1 = "ksdKhd-Karp algorithm";
		String s2 = "Karp";
		System.out.println(s1.indexOf(s2));
		System.out.println(strStr(s1, s2));
	}

	static public int strStr(String haystack, String needle) {
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				System.out.println(i + " " + j);
				if (j == needle.length()) {
					return i;
				}
				if (j + i == haystack.length()) {
					return -1;
				}

				if (needle.charAt(j) != haystack.charAt(i + j)) {
					// System.out.println(i + " " + j);
					break;
				}
			}
		}
	}
}
