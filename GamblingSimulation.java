public class GamblingSimulation{
	//declare constant variable
	final static int STAKE_AMOUNT = 100;
	final static int BIT_AMOUNT = 1;
	
	public static void main(String args[]){
	
	int randomCheck = (int)Math.floor(Math.random()*10%2);
	if(randomCheck == 1)
	{
		System.out.println("you won $1");
		int totalAmount=STAKE_AMOUNT+BIT_AMOUNT;
	}
	else
	{
		System.out.println("you loss $1");
		int totalAmount=STAKE_AMOUNT-BIT_AMOUNT;
	}

}
	
}
