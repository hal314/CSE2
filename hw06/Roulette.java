//Hao Lu
//HW06
//Roulette Program
//10/14/2014
//Write a program that simulates a person's betting on 100 spins for 
//1000 times and collect data on the outcome. 
//For the 1000 repetitions of the 100-spin simulation, 
//compute the number of times the person loses everything 
//, compute the total winnings (of all simulations added together), 
//and compute the number of times the person  walked away with a profit 
//in one session of 100 spins of the wheel.



//set up the class
public class Roulette{
    
    //set up the main method
    public static void main (String[] args){
        
        int Repetitions = 0; //set up the repetition counter
        int i;//set up the 100 spins counter
        int Bet;//Decalre the variable for the bet
        int Outcome;//Declare the variable for the outcome
        int LoseEverything=0;//Declare a counter for losing everything
        int TotalWinnings=0;//Declare a variable for total winnings
        int WithProfit=0;//Declare a counter for walking away with profit
        int Win=0;//Declare a counter for winning times
        
        //set up the loop for 1000 repetitions
        while (Repetitions < 1000){
            
            Win = 0;//reset the counter for winning times
            i = 0;//reset the 100 spins counter
            Bet = (int)(Math.random()*38);//get a random bet from 0 to 37
            
            //set up the loop for 100 spins
            while (i < 100)
            {
              Outcome = (int)(Math.random()*38);//get a random outcome from 0 to 37
              if (Outcome == Bet)
              {
                  Win++;//if Bet and Outcome are the same, the winning times increases
              }
              i++;
            }
            
            if (Win==0)
            {
                LoseEverything++;//if there is no win in 100 spins, the LoseEverything counter increases
            }
            
            if (Win >= 3)
            {
                WithProfit++;//if there are more than 3 wins in 100 spins, the person walks away with profit
            }
            
            TotalWinnings = TotalWinnings + Win*36;//calculate the total winnings
            Repetitions++;
        }
        
        //print out the results
        System.out.println("The number of times the person loses everything is "+LoseEverything);
        System.out.println("The total winnings is "+TotalWinnings);
        System.out.println("The number of times the person walked away with a profit in one session of 100 spins of the wheel is "+WithProfit);
    }
}