//Methods topic
public class Cars {
	void Start() {
		System.out.println("Start the car");
	}
	void ChangeGear() {
		System.out.println("ChangeGear the gear");
	}
	void Move () {
		System.out.println("Move the car");
	}
	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.Start();
		c1.ChangeGear();
		c1.Move();
	}
}