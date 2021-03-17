public class Game {
	String type;
	Game(){
		type = "pub-g";
	}
	public static void main(String[] args) {
		Game g1 = new Game();
		System.out.println(g1.type);
	}
}