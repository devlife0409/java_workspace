package ch02;

public class Cal {

	// 속성

	// 기능
	// 더하기 빼기 곱하기 등등
	public Cal() {
		System.out.println("Cal() 생성자 호출 - 부모");
	}

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		return n1 * n2;
	}

}// end class cal

// 객체 지향 패러다임
// ** 객체와 객체간에 상호작용, 관계를 형성해 나가는 것

class Cal2 extends Cal {
	public Cal2() {
		System.out.println("Cal2() 생성자 호출 - 자식");
	}

	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	// 상속에서는 메서드의 제정의 가능
	// @ < 어노테이션 - 주석 + 힌트
	@Override
	public int multiply(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("0을 입력하셨습니다.");
		}
		return n1 * n2;
	}// 오버라이드
		// 오버로딩, 오버라이드는 다른 개념
		// 생정자 오버로딩 --> 메서드 오버로딩

	public int minus(int n1, int n2, int n3) {
		return n1 - n2 - n3;
	}
	// 상속 - 바텁업(bottom-up방식)
}// end class cal2
