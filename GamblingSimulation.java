public class GamblingSimulation{
	//declare  variable
	  int stake = 100;
	  int bet = 1;

	public void checkWinLoose()
{
        while(stake != 150 && stake != 50)
        {
                int bettingResult=(int)(Math.floor(Math.random()*10)%2);
                if(bettingResult == 1)
                {
                        stake=stake+bet;
                }
                else
                {
                        stake=stake-bet;
                }


        }


                if(stake == 150)
                {
                        System.out.println("you won the game");
			System.out.println("stake: "+stake);
                }
                else
                {
                        System.out.println("you loose the game");
		        System.out.println("stake: "+stake);
                }


}

	public static void main(String args[]){
	
	GamblingSimulation gs=new GamblingSimulation();
	gs.checkWinLoose();
}
	
}

