package LeetCode;

public class ReverseWord {
	public static void main(String[] args) {
		String s1 = "the   sky is blue";
		System.out.println(reverseWords(s1));
	}

	public static String reverseWords(String s) {
		StringBuilder reversed = new StringBuilder();
		int l = s.length();
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				l = i;
			} else if (i == 0 || s.charAt(i - 1) == ' ') {
				if (reversed.length() != 0) {
					reversed.append(' ');
				}
				reversed.append(s.substring(i, l));
			}
		}
		return reversed.toString();
	}
}
