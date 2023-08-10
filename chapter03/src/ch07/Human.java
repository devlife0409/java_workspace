package ch07;

// 추상 메서드를 상속받았다면, 
// 1. 자식 클래스도 추상 클래스화 시켜준다.
// 추상 메서드를 가진 클래스는 추상 클래스
public class Human extends Animal {

	@Override
	public void hunt() {
		System.out.println("돌도끼로 사냥을 한다.");
		
	}

}
