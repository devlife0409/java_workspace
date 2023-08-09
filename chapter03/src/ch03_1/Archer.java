package ch03_1;

public class Archer extends Hero{
	
	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	public void fireArrow() {
		System.out.println("불화살 공격");
	}
	
	@Override
	protected void attack() {
		System.out.println(name + "- 기본공격");
	}
}
