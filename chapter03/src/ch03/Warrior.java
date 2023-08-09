package ch03;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboAttack() {
		System.out.println("연속공격");
	}

	@Override
	public void attack() {
		System.out.println(name = "- 기본공격");
	}

}
