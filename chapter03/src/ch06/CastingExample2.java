package ch06;

import java.util.Iterator;

public class CastingExample2 {
	public static void main(String[] args) {

		// 배열 활용
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Bird();
		animals[2] = new Animal();

		System.out.println("==============================");

		for (Animal a : animals) {
			a.makeSound();
			// a.fly(); 데이터 타입을 확인하고 싶다면 instanceof 연산자
			if (a instanceof Bird) {
				Bird targetBird = (Bird) a;
				targetBird.fly();
			}
			System.out.println("==============================");

		}

//		for (int i = 0; i < animals.length; i++) {
//			
//		}
		// 다형성, 다운캐스팅(Downcasting)
		// 다운 캐스팅이란 업캐스팅된 객체를 다시 원래의 하위 클래스 타입으로
		// 변환 하는 것을 말한다.
		// 다운캐스팅은 수동으로 이루어지므로, 별도의 형 변환 연산자가 필요하다.
		// 다운캐스팅은 업캐스팅된 객체에, 하위 클래스의 메서드 및 속성을 사용하기 위해 필요하다.

	}
}
