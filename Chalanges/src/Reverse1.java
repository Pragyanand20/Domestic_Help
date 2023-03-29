
public class Reverse1 {
	public static void main(String[] args) {
		String s1 = "the   sky is blue";
		System.out.println(reverseWord(s1));
	}

	static String reverseWord(String s) {
		String s3 = "";
		for (int i = 0; i < s.length(); i++) {
			StringBuffer s2 = new StringBuffer();
			while (i < s.length() && s.charAt(i) != ' ') {
				s2.append(s.charAt(i));
				i++;
			}
			s3 = new String(s2 + " " + s3);

		}
		return s3.trim();
	}
}
