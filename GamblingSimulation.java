public class GamblingSimulation {

        public void checkWinLoose() {

                for (int i = 1; i <= 30; i++) {
                        int winCount = 0;
                        int lostCount = 0;
                        int stake = 100;
                        int bet = 1;
                        int totalAmount = 0;
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
                                totalAmount = winCount;
                                System.out.println("total Amount won in day:"+i +" Amount:"+ totalAmount);

                        } else {
                                System.out.println("you loose the game");
                                totalAmount = lostCount;
                                System.out.println("total amount lost in days: "+i +" Amount:"+ totalAmount);
                        }

                }

        }

        public static void main(String[] args) {
                GamblingSimulation obj = new GamblingSimulation();
                obj.checkWinLoose();
        }

}

