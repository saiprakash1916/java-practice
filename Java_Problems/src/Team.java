//toString method and perameterized constructor and over loaded program
public class Team {
	String  teamName;
	String  teamOwner;
	@Override
	public String toString() {
		return this.teamName +" owner is "+ this.teamOwner;
	}
	public Team(){
		
	}
	public Team(String teamName, String teamOwner) {
		this.teamName=teamName;
		this.teamOwner=teamOwner;
	}
	public static void main(String[] args) {
		Team t1 = new Team("RCB", "Vijay Mallya");
		System.out.println(t1);
		Team t2 = new Team("KKR", "Sharukh Khan");
		System.out.println(t2);
	}
}
