package ch05;

public class MainTest1 {

	public static void main(String[] args) {

		Animal animal1 = new Animal();
		Tiger tiger1 = new Tiger();
		Human human1 = new Human();

		// 다형성의 적용
		Animal animal2 = new Tiger();
		// Animal animal3 = new Human();

		Animal[] arrayAnimals = new Animal[10];
		// 인덱스 크기는 9

		arrayAnimals[0] = tiger1;
		arrayAnimals[1] = animal1;
		// arrayAnimals[2] = human1;
		// 여기까지는 컴파일 시점에서 확인 가능한 부분을 확인.
		System.out.println("---------------------------------");
		
		tiger1.move();
		tiger1.eating();
		// 부모 메서드가 아닌 자식에 의해 오버라이딩된 메서드가 호출된다.
		
		

	} // end of main

} // end of class
