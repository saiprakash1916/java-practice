public class Employee {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", perc=" + salary + "]";
	}
	public int hashCode() {
		return id;
	}
	public boolean equals(Object obj) {
		Employee e =(Employee) obj;
		return this.salary == e.salary;
	}
	public static void main(String[] args) {
		Employee e1 =new Employee(123, "sai", 20000);
		Employee e2 =new Employee(124, "sp", 30000);
		Employee e3 =new Employee(125, "prakash", 20000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e3));
		System.out.println(e1==e2);
		System.out.println(e1==e3);
		System.out.println(e2==e3);
	}
}
