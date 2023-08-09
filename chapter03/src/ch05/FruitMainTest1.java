package ch05;

public class FruitMainTest1 {
	public static void main(String[] args) {
		
		// 다형성
		// ! 용어 - 업 캐스팅(up casting)
		Fruit fruit1 = new Banana("델몬트 바나나", 2_000);
		Fruit fruit2 = new Peach("황도 복숭아", 3_000);

		fruit1.showInfo();
		fruit2.showInfo();
		
		// 바나나 객체의 origin 변수를 출력해보자
		// 업 캐스팅 된 상태에서는 컴파일 시점만 확인한다.
		
		// System.out.println(fruit1.origin); 오류 확인
		// 컴파일 시점에서 어떻게 origin 변수를 출력할 수 있을까
		
		// 1단계 - 다운 캐스팅
		Banana banana1 = ((Banana)(fruit1));
		System.out.println(banana1.origin);
		// 2단계 - 다운 캐스팅
		String checkOrigin = ((Banana)(fruit1)).origin;
		
		
		
	} // end of main

} // end of class
