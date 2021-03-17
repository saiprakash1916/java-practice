package programming;
public class Product {
	private int pid;
	private String name;
	private double price;
	public Product(int pid, String name, double price) {
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	@Override
	public String toString() {
		return "Product [pid: " + pid + ", name: " + name + ", price: " + price + "]";
	}
}
