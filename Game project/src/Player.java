public class Player {
	public static void main(String[] args) {
		Game g = new Game();
		Weapon wpn = g.pressButton(); //up-casting
		if (wpn instanceof Gun) {
			Gun gu = (Gun) wpn;
			gu.laodGun();
		}else if (wpn instanceof Knife) {
			Knife k = (Knife) wpn;
			k.sharpen();
		}
		wpn.use();
	}
}