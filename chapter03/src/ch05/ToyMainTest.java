package ch05;

import java.util.Random;
import java.util.Scanner;

public class ToyMainTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int selected = random.nextInt(3) + 1;
		

		
		Toy[] arrayToys = new Toy[3];
		arrayToys[0] = new ToyBear("테디베어", 18_000);
		arrayToys[1] = new ToyGun("k-2", 25_600);
		arrayToys[2] = new ToySword("목검", 12_000);

		for (int i = 0; i < arrayToys.length; i++) {

			if (arrayToys[i] != null) {
				arrayToys[i].showInfo();
				if (arrayToys[i] instanceof ToyBear) {
					String checkToyType = ((ToyBear) (arrayToys[i])).toyType;
					System.out.println("장난감 종류 : " + checkToyType);
					System.out.println("================================");

				} else if (arrayToys[i] instanceof ToyGun) {
					String checkToyType = ((ToyGun) (arrayToys[i])).toyType;
					System.out.println("장난감 종류 : " + checkToyType);
					System.out.println("================================");

				} else {
					String checkToyType = ((ToySword) (arrayToys[i])).toyType;
					System.out.println("장난감 종류 : " + checkToyType);
					System.out.println("================================");

				}

			}

		}

	}

}
