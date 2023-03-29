import java.util.Date;

//WAP to program count days in this year till date
public class DaysCount2 {
	public static void main(String[] args) {
		System.out.println((System.currentTimeMillis() - new Date(123, 0, 1).getTime()) / (24 * 60 * 60 * 1000));
	}
}