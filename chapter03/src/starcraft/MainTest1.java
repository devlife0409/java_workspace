package starcraft;

public class MainTest1 {
	public static void main(String[] args) {
		
		Zealot zealot1 = new Zealot("질럿");
		Zergling zergling1 = new Zergling("저글링");
		Marine marine1 = new Marine("마린");
		
		zealot1.attack(marine1);
		zergling1.attack(zealot1);
		marine1.attack(zergling1);
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
	}// end main
}// end class
