//toString method
public class Cars1 {
	String model;
	int price;
	@Override
	public String toString() {
		return this.model +" = "+ this.price +" Rs/-";
	}
	public Cars1() {
	}
	public Cars1(String model, int price) {
		this.model=model;
		this.price=price;
	}
	public static void main(String[] args) {
		Cars1 c1 = new Cars1("Alto", 420000);
		Cars1 c2 = new Cars1("Octavia", 165000);
		Cars1 c3 = new Cars1("Audi Q3", 412000);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
