//Methods topic
public class Players {
	String name;
	void Play() {
		System.out.println(this.name + " play");
	}
	public static void main(String[] args) {
		Players p1 = new Players();
		p1.name = "sai";
		p1.Play();
		Players p2 = new Players();
		p2.name = "prakash";
		p2.Play();
	}
}
