package ch12;

// 인터페이스 사용법
public class Refrigerator 
extends HomeAppliances implements RemoteController, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("냉장고 전원을 켭니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고 전원을 끕니다.");
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void notification() {
		System.out.println("삐빅");
		// TODO Auto-generated method stub
		
	}
}
