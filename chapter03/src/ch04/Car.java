package ch04;

/**
 * 자동차와 엔진 관계에 있어 절대 상속을 사용하지 말자
 * 문법적인 오류는 없지만 틀린 객체 지향 방법이다.
 * 차와 엔진의 관계는 '포함 관계'로 설계해야 한다.
 */

public class Car {
	
	// 속성
	private String name;
	private int price;
	// 자동차 - 엔진은 상속관계를 쓸 수 없는 예시
	private Engine engine;
	// 포함관계****

	public Car(String name, int price, Engine engine) {
		this.name = name;
		this.price = price;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Engine getEngine() {
		return engine;
	}

}
