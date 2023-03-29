import java.util.Date;

// WAP to program count days in this year till date
public class DaysCount {
	public static void main(String[] args) {
		Date d = new Date(123, 0, 1); // 2023 jan 1
		// date is started from Sun Dec 31 00:00:00 IST 1899
		System.out.println(d.getTime()); // in millisec count from midnight, January 1, 1970 UTC
		Date d1 = new Date();
		System.out.println(d1); // current date
		long l = d1.getTime() - d.getTime(); // difference in millisec
		long l2 = l / (24 * 60 * 60 * 1000); // calculate millisec to days
		System.out.println(l2);
	}
}
