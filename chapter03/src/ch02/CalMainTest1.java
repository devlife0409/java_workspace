package ch02;

public class CalMainTest1 {
	public static void main(String[] args) {
		
		// 같은 패키지 내에서 접근가능 (default 접근제어지시자)
		Cal2 cal2 = new Cal2();
		cal2.sum(10, 40); // sum 메서드 - 부모클래스 기능		
		cal2.minus(30, 15); // minus 메서드 - 자식클래스 기능
		
		// Cal이란 객체(부모객체)는 생성이 된걸까?
		// 부모 클래스 먼저 생성 후 자식 클래스 생성
		
		// multiply 메서드 재정의 (오버라이드)
		cal2.multiply(2, 0);
		
		// 매서드 오버 로딩은 sysout이다.
		System.out.println("안녕");
		System.out.println('A');
		System.out.println(100);
		System.out.println(0.5);
		System.out.println(true);
	}//end main
}// end class
