package LeetCode;

class abs {
	static void m1() {
		System.out.println("static");
	}

	abs() {
		System.out.println("abs");
	}
}

public class test extends abs {
	test() {
		System.out.println("test");
	}

	public static void main(String[] args) {
		abs a = new test();
		m1();

	}
}
