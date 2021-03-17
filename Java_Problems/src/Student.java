public class Student {
	String name = "sai";
	Student(String name) {
		System.out.println(name);
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		 new Student("prakash");
	}
}
