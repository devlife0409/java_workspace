package ch12;

public class MainTest1 {

	public static void main(String[] args) {

		// 결론
		// 코드를 조좀 더 유연하고 확장성 있게
		// 설계할 때 표준, 규칙, 규약을 지켜서 설계하고 싶다면
		// Interface를 활용하자

		HomeAppliances appliances1 = new Television();
		HomeAppliances appliances2 = new Refrigerator();
		// HomeAppliances appliances3 = new ToyRobot(); ToyRobot은 HomeAppliances 상속x

		RemoteController controller1 = new Television();
		RemoteController controller2 = new Refrigerator();
		RemoteController controller3 = new ToyRobot();
		// interface도 new로 선언이 가능하다

		RemoteController[] remoteControllers = new RemoteController[3];
		remoteControllers[0] = new Television();
		remoteControllers[1] = new Refrigerator();
		remoteControllers[2] = new ToyRobot();

		for (int i = 0; i < remoteControllers.length; i++) {
			// RemoteController remoteControllers = remoteControllers[i]
			remoteControllers[i].turnOn();

		}
		System.out.println("--------------------------------------");
		for (int i = 0; i < remoteControllers.length; i++) {
			// RemoteController remoteControllers = remoteControllers[i]
			remoteControllers[i].turnOff();

		}

	}

}
