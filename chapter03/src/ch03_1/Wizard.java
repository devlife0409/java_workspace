package ch03_1;

public class Wizard extends Hero{
	
	public Wizard(String name, int hp) {
		super(name, hp);
	}
	
	public void freezing() {
		System.out.println("얼음공격");
	}
	
	@Override
	protected void attack() {
		System.out.println(name + "- 기본공격");
	}
}
