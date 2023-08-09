package ch05;

public class FruitMainTest2 {
	public static void main(String[] args) {
		Fruit[] fruits = new Fruit[5];
		fruits[0] = new Peach("백도 복숭아", 4_100);
		fruits[1] = new Banana("골드 바나나", 4_000);
		fruits[2] = new Peach("황도 복숭아", 4_300);

		// 배열은 보통 반복문과 사용된다.

		for (int i = 0; i < fruits.length; i++) {

			if (fruits[i] != null) {
				fruits[i].showInfo();

				// 만약 바나나라면 원산지 정보도 함께 출력 하시오
				if (fruits[i] instanceof Banana) {
					String checkOrigin = Banana.origin;
//					String checkOrigin = ((Banana)(fruits[i])).origin;
					System.out.println("원산지 : " + checkOrigin);

				}

			}

		}

	}
}
