package myGame;

import java.util.Random;
import java.util.Scanner;

public class NumQuestionGame {
	public static void main(String[] args) {

		System.out.println("=====숫자 맞추기 게임=====");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 점수");
		System.out.println("3. 게임 종료");

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int gameStarter = sc.nextInt();
		int cpuNum = random.nextInt(101);
		int record = 0;

		if (gameStarter == 1) {
			System.out.println("게임을 시작하겠습니다.");
			System.out.println("1부터 100까지의 정수 중 하나를 입력하세요.");
			System.out.println("기회는 8번입니다.");
			for (int i = 0; i < 8; i++) {
				int playerNum = sc.nextInt();
				if (playerNum == cpuNum) {
					System.out.println("맞추셨습니다.");
					record++;
					break;
					
					
				} else if (playerNum < cpuNum) {
					System.out.println("더 큰 숫자입니다.");
				} else if (playerNum > cpuNum) {
					System.out.println("더 작은 숫자입니다.");
				}
				if (i == 7) {
					System.out.println("기회를 모두 소진하셨습니다. 게임 종료");
					break;
				}
			}

		} else if (gameStarter == 2) {
			System.out.println("현재 정답을 맞춘 횟수는 " + record + "회 입니다.");
			
		}

	}

}
