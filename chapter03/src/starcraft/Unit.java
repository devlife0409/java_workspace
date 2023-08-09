package starcraft;

public class Unit {

	protected String name;
	protected int power;
	protected int hp;

	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void damaged(int power) {
		if (hp < 0) {
			System.out.println(name + "이 이미 사망했습니다.");
			return;
		}
		hp -= power;
	}

//	public void attack(String name) {
//		System.out.println(this.name + "이(가) " + name + "을 공격");
//	}

	public void attack(Unit unit) {
		unit.damaged(power);
		System.out.println(this.name + "이(가) " + unit.getName() + "을(를) 공격");
	}
	
	public void showInfo() {
		System.out.println(">>> 상태창 <<<");
		System.out.println("이름 : " + name);
		System.out.println("체력 : " + hp);
		System.out.println("공격력 : " + power);
	}

}
