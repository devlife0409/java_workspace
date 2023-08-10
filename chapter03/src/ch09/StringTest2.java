package ch09;

public class StringTest2 extends Object {
	// 자바의 모든 클래스는 Object 클래스로부터 상속받는다.
	public static void main(String[] args) {

		// StringBuilder, StringBuffer
		// 멀티 쓰레드 프로그래밍 - StringBuffer
		// 단일 쓰레드 프로그래밍 - StringBuilder

		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append('A');
		strBuffer.append('B');
		System.out.println(strBuffer);
		System.out.println(System.identityHashCode(strBuffer));
		
		// StringBuffer를 문자열 타입(String)으로 변환하고 싶다면, 
		// toString() 메서드를 사용해야 한다.
		String result = strBuffer.toString();
		System.out.println(result);
		
	}
}
