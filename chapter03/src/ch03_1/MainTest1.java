package ch03_1;

public class MainTest1 {
	public static void main(String[] args) {

		Warrior warrior1 = new Warrior("전사1", 100);
		// 오버라이드 메서드
		// 1. 자기 자신의 메서드 확인 - Warrior class
		// 2. 본인에게 attack()메서드가 없으면 부모 객체 확인
		warrior1.attack();

	} // end main
} // end class
