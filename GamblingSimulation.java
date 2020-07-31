
public class GamblingSimulation {

	public void checkWinLoose() {

		for (int i = 1; i <= 20; i++) {
			int stake = 100;
			int bet = 1;
			int totalAmount = 0;
			while ((stake != 150) && (stake != 50)) {
				int randomCheck = (int) Math.floor(Math.random() * 10) % 2;

				if (randomCheck == 1) {
					stake = stake + bet;

				} else {
					stake = stake - bet;
				}

			}

			if (stake == 150) {
				System.out.println("total Amount won in day:"+i);

			} else {
				System.out.println("total amount lost in days: "+i);
			}

		}

	}

	public static void main(String[] args) {
		GamblingSimulation obj = new GamblingSimulation();
		obj.checkWinLoose();
	}

}
