public class PanCard {
	String panNumber;
	public static void main(String[] args) {
		PanCard p1 = new PanCard("KELP22369");
		System.out.println("Pan card number is " + p1.panNumber);
		PanCard p2 = new PanCard("SAI221928");
		System.out.println("Pan card number is " + p2.panNumber);
	}
	PanCard(String panNumber){
		this.panNumber = panNumber;
	}
}
