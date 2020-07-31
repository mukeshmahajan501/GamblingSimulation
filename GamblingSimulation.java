

import java.util.Scanner;

public class GamblingSimulation {

	int winArr[] = new int[30];
	int lostArr[] = new int[30];

	public void checkWinLoose() {
		int n = 0;
		while (n != 30) {
			Scanner sc = new Scanner(System.in);
			System.out.println("you want to start the game!!:Enter 1");
			System.out.println("you want to exit !!:Enter 2");
			System.out.println("enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				for (int i = 0; i < 30; i++) {
					int winCount = 0;
					int lostCount = 0;
					int stake = 100;
					int bet = 1;
					while ((stake != 150) && (stake != 50)) {
						int randomCheck = (int) Math.floor(Math.random() * 10) % 2;

						if (randomCheck == 1) {
							stake = stake + bet;
							winCount++;

						} else {
							stake = stake - bet;
							lostCount++;

						}

					}

					if (stake == 150) {
						System.out.println("you won the game");
						winArr[i] = winCount;
						System.out.println("total Amount won :" + winCount + "in day: " + (i + 1));
					} else {
						System.out.println("you lost the game");
						lostArr[i] = lostCount;
						System.out.println("total Amount lost: " + lostCount + "in day: " + (i + 1));
					}

				}

				int max = 0;

				int luckyDay = 0;
				for (int i = 0; i < 30; i++) {
					if (winArr[i] > max && winArr[i] != 0) {
						max = winArr[i];
						luckyDay = i;
					}
				}

				System.out.println("your lukkiest day:" + (luckyDay + 1));

				int min = Integer.MAX_VALUE;

				int unLuckyDay = 0;
				for (int i = 0; i < 30; i++) {
					if (lostArr[i] < min && lostArr[i] != 0) {
						min = lostArr[i];
						unLuckyDay = i;
					}
				}

				System.out.println("your unlukkiest day:" + (unLuckyDay + 1));
				System.out.println();

				break;

			case 2:
				System.exit(0);
				break;
			default:
				System.out.println("wrong input!!!");
				break;
			}
		}
		n++;

	}

	public static void main(String[] args) {
		GamblingSimulation obj = new GamblingSimulation();
		obj.checkWinLoose();

	}

}
