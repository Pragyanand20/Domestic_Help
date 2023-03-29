// check palindrom do not count space
public class Palindrome {
	public static void main(String[] args) {
		String string = "A man, a plan, a canal: Panama";
		System.out.println("is pelindrom: " + isPalindrome(string));
	}

	public static boolean isPalindrome(String s) {
		String s1 = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			int c = s1.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				sb.append(s1.charAt(i));
			}
		}
		String s2 = new String(sb);
		String s3 = new String(sb.reverse());
		System.out.println(s2);
		if (s2.equals(s3)) {
			return true;
		} else {
			System.out.println(s3);
			return false;
		}
	}
}
