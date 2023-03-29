
import java.util.Arrays;
import java.util.List;

/*Program to increment Employee salary by 10% 
* whose age is greater  than 25 and display the Employee using JAVA8 StreamAPI
*/
public class IncSalary {

	private String name;
	private int age;
	private double salary;

	public IncSalary(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		String s = String.format("IncSalary [name=" + name + ", age=" + age + ", salary=" + "%.2f" + "]", salary);
		return s;
	}

	public static void main(String[] args) {
		IncSalary emp1 = new IncSalary("Qais", 26, 10000l);
		IncSalary emp2 = new IncSalary("Pragyanand", 27, 30000l);
		IncSalary emp3 = new IncSalary("Irfan", 24, 40000l);
		IncSalary emp4 = new IncSalary("Praveen", 27, 20000l);
		List<IncSalary> list = Arrays.asList(emp1, emp2, emp3, emp4);

		list.stream().filter(emp -> emp.getAge() > 25).map(emp -> {
			emp.setSalary(emp.getSalary() * 1.1);
			return emp;
		}).forEach(System.out::println);
	}
}