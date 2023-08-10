package ch05;

import starcraft.Unit;
import starcraft.Marine;
import starcraft.Zealot;
import starcraft.Zergling;

public class MainTest2 {
	public static void main(String[] args) {
		// unit 이라는 배열에 저글링, 질럿 마린을 담아 보세요.
		// 실행도 시켜 봅시다.

		Marine mar1 = new Marine("김마린");
		Zergling zerg1 = new Zergling("박저글링");
		Zealot zea1 = new Zealot("최질럿");

		Unit[] arrayUnits = new Unit[10];

		arrayUnits[0] = mar1;
		arrayUnits[1] = zerg1;
		arrayUnits[2] = zea1;
		
		mar1.showInfo();


	}

}
