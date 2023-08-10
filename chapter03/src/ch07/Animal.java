package ch07;

// 추상 클래스란
// 1. abstract 키워드를 포함한 클래스
// 2. 하나 이상의 추상 메서드를 포함하면, 반드시 추상 클래스
// 추상 클래스에는 규칙이 존재한다.
public abstract class Animal {
	
	public void move() {
		System.out.println("움직인다.");
	}

	
	// 추상 메서드란
	public abstract void hunt();
	
}
