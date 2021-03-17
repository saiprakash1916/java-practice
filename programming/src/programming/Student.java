package programming;
public class Student {
	private int id;
	private String name;
	private double per;
	public Student(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Student [id: " + id + ", name: " + name + ", per: " + per + "]";
	} 
}
