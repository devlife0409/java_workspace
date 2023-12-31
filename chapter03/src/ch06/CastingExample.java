package ch06;

public class CastingExample {
	public static void main(String[] args) {

		// 다형성, 업 캐스팅(Upcasting)
		// 업캐스팅은 하위 클래스 객체를 상위 클래스 타입으로 변환하는 것
		// 이 경우, 데이터 손실이 발생하지 않는다.
		// 업캐스팅은 자동적으로 이루어지므로, 별도의 형 변환 연산자가 필요없다.
		Animal animal = new Bird();

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
				Bird targetBird = (Bird) animal;
				targetBird.fly();
			}
			System.out.println("==============================");

		}

		// 다형성, 다운캐스팅(Downcasting)
		// 다운 캐스팅이란 업캐스팅된 객체를 다시 원래의 하위 클래스 타입으로
		// 변환 하는 것을 말한다.
		// 다운캐스팅은 수동으로 이루어지므로, 별도의 형 변환 연산자가 필요하다.
		// 다운캐스팅은 업캐스팅된 객체에, 하위 클래스의 메서드 및 속성을 사용하기 위해 필요하다.
		Bird bird = (Bird) animal;
	}
}
