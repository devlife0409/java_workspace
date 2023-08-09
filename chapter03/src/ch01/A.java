package ch01;

public class A {

	String name;
	int height;
	int weight;
	int age;

	// main함수 테스트
	public static void main(String[] args) {

		C c1 = new C();
		c1.age = 26;
		System.out.println(c1.age);

	}// end main

} // end class A

// 하나의 .java 파일 안에서 여러개의 클래스를 설계할 수 있다.
// 단, 하나의 .java파일에서 접근제어 지시자 public class는 단 하나만 설계 가능

class B {

	String name;
	int height;
	int weight;
	int age;
	String tel;

}// end class B

class C extends A {

	String phone;

} // end C