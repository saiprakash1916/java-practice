import java.util.Random;
public class Game {
	Weapon pressButton() {
		Weapon wp = null;
		Random r = new Random();
		int n = r.nextInt(3);
		if (n == 0) {
			wp = new Bomb();
		}else if (n == 1) {
			wp = new Gun();
		}else {
			wp = new Knife();
		}
		return wp;
	}
}
