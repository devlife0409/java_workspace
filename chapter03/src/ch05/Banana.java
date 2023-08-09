package ch05;

public class Banana extends Fruit {
	
	static String origin;
	
	public Banana(String name, int price) {
		super(name, price); // 부모 생성자 호출
		origin = "필리핀";
	}
	
	
	
	

}
