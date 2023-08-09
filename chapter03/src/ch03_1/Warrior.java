package ch03_1;

public class Warrior extends Hero {

	// 부모 클래스에 사용자 정의 생성자가 있다면
	// 자식 클래스에서 반드시 부모 생성자를 먼저 호출해야 한다.
	public Warrior(String name, int hp) {
		// super == 부모의미
		// super() == 부모생성자 호출
		// 부모가 생성되지 않았을 때 자식에서의 명령은 불가
		super(name, hp);
	}

	public void comboAttack() {
		System.out.println("전사 2단 공격");
	}

	// 상속에서 오버라이딩
	@Override // 어노테이션
	protected void attack() {
		// super.attack(); // super. == 부모에 접근해서 호출
		System.out.println(super.name + "- 기본공격");
	}
}
