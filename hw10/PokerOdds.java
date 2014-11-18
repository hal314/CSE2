//Hao Lu
//HW10
//Program 2
//PokerOdds Program

//import Radom
import java.util.Random;

//import Scanner
import java.util.Scanner;

//set up the class
public class PokerOdds{
    
  //set up th main method
  public static void main(String [] arg){
    showHands();
    simulateOdds();
  }
  
  //construct the exactlyOneDup method
  public static boolean exactlyOneDup(int num[]){
      int count = 0; //set up a varaible to record the number of duplicates
      
      //set up a loop to compare numbers in the array with each other
      for(int i=0;i<num.length;i++){
          int j=i+1;
          while(j<num.length)
          {
              if (num[i]==num[j])
              {
                  count++;//when two numbers in the array are same,return true
              }
              
              j++;
          }
          
      }
      //return the results
      if (count==1){
          return true;//if there is only one duplicate return true
      }
      else {
          return false;//else return false
      }
      
  }
  
  //construct the showHands method
  public static void showHands(){
      Scanner scan=new Scanner(System.in);//call the Scanner constructor
      int Deck[]=new int[52];//set up the array for deck
      String answer="";
      do{
      //store 0 to 51 into the Deck array
      for(int i=0;i<Deck.length;i++){
        Deck[i] = i; 
      }
      
      int Hand[]={-1,-1,-1,-1,-1};//set up and initialize the array for hand
      
      Random r = new Random ();//Decalre a instance of the Random generator
      int k = Deck.length;//declare a variable to show the effective length of the Deck array
      //set up a loop to draw cards from the deck ramdomly
      for(int j=0;j<Hand.length;j++){
          int draw = r.nextInt(k-1);
          Hand[j] = Deck[draw];//store the ramdom pick from Deck into Hand
          //set the random pick in Deck to -1 and swap with the last effective number in Deck
          Deck[draw]=Deck[k-1];
          Deck[k-1]= -1;
          k--;//reduce the effective array size
      }
      
      //set up the strings, which will indicate the result
      String Clubs = "Clubs:  ";
      String Diamonds = "Diamonds:  ";
      String Hearts = "Hearts: ";
      String Spades = "Spades:  ";
      //set up a loop to determine the kind and value of each card in hand
      for(int j=0;j<Hand.length;j++){
          int kind = Hand[j]/13;//calculate the kind of the card
          int rank = Hand[j]%13;//calculete the rank of the card
          switch (kind){
              case 0:
                  switch (rank){
                      case 0:
                          Clubs += "A ";
                          break;
                      case 1:
                          Clubs += "K ";
                          break; 
                      case 2:
                          Clubs += "Q ";
                          break; 
                      case 3:
                          Clubs += "J ";
                          break; 
                      case 4:
                          Clubs += "10 ";
                          break; 
                      case 5:
                          Clubs += "9 ";
                          break; 
                      case 6:
                          Clubs += "8 ";
                          break; 
                      case 7:
                          Clubs += "7 ";
                          break; 
                      case 8:
                          Clubs += "6 ";
                          break; 
                      case 9:
                          Clubs += "5 ";
                          break; 
                      case 10:
                          Clubs += "4 ";
                          break; 
                      case 11:
                          Clubs += "3 ";
                          break; 
                      case 12:
                          Clubs += "2 ";
                          break; 
                  }      
              break;
              case 1:
                  switch (rank){
                      case 0:
                          Diamonds += "A ";
                          break;
                      case 1:
                          Diamonds += "K ";
                          break; 
                      case 2:
                          Diamonds += "Q ";
                          break; 
                      case 3:
                          Diamonds += "J ";
                          break; 
                      case 4:
                          Diamonds += "10 ";
                          break; 
                      case 5:
                          Diamonds += "9 ";
                          break; 
                      case 6:
                          Diamonds += "8 ";
                          break; 
                      case 7:
                          Diamonds += "7 ";
                          break; 
                      case 8:
                          Diamonds += "6 ";
                          break; 
                      case 9:
                          Diamonds += "5 ";
                          break; 
                      case 10:
                          Diamonds += "4 ";
                          break; 
                      case 11:
                          Diamonds += "3 ";
                          break; 
                      case 12:
                          Diamonds += "2 ";
                          break; 
                  }          
              break;
              case 2:
                  switch (rank){
                      case 0:
                          Hearts += "A ";
                          break;
                      case 1:
                          Hearts += "K ";
                          break; 
                      case 2:
                          Hearts += "Q ";
                          break; 
                      case 3:
                          Hearts += "J ";
                          break; 
                      case 4:
                          Hearts += "10 ";
                          break; 
                      case 5:
                          Hearts += "9 ";
                          break; 
                      case 6:
                          Hearts += "8 ";
                          break; 
                      case 7:
                          Hearts += "7 ";
                          break; 
                      case 8:
                          Hearts += "6 ";
                          break; 
                      case 9:
                          Hearts += "5 ";
                          break; 
                      case 10:
                          Hearts += "4 ";
                          break; 
                      case 11:
                          Hearts += "3 ";
                          break; 
                      case 12:
                          Hearts += "2 ";
                          break; 
                  }      
              break;
              case 3:
                  switch (rank){
                      case 0:
                          Spades += "A ";
                          break;
                      case 1:
                          Spades += "K ";
                          break; 
                      case 2:
                          Spades += "Q ";
                          break; 
                      case 3:
                          Spades += "J ";
                          break; 
                      case 4:
                          Spades += "10 ";
                          break; 
                      case 5:
                          Spades += "9 ";
                          break; 
                      case 6:
                          Spades += "8 ";
                          break; 
                      case 7:
                          Spades += "7 ";
                          break; 
                      case 8:
                          Spades += "6 ";
                          break; 
                      case 9:
                          Spades += "5 ";
                          break; 
                      case 10:
                          Spades += "4 ";
                          break; 
                      case 11:
                          Spades += "3 ";
                          break; 
                      case 12:
                          Spades += "2 ";
                          break; 
                  }      
              break;
          }
                  }
                  
            //print out the results
            System.out.println(Clubs);
            System.out.println(Diamonds);
            System.out.println(Hearts);
            System.out.println(Spades);
            //ask user for input
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
          }while(answer.equals("Y") || answer.equals("y"));
          return;
      }
      
   //construct the simulateOdds method
   public static void simulateOdds(){
       
       //set up counters for each rank pair
           int A=0;
           int two=0;
           int three=0;
           int four=0;
           int five=0;
           int six=0;
           int seven=0;
           int eight=0;
           int nine=0;
           int ten = 0;
           int J=0;
           int Q=0;
           int K=0;
           
           //set up a counter for not exactly one pair
           int notOnePair=0;
           
       //set up a loop to run 10000 simulations
       for(int a=0;a<10000;a++){
           
           int Deck[]=new int[52];//set up the array for deck
           
      
        //store 0 to 51 into the Deck array
        for(int i=0;i<Deck.length;i++){
            Deck[i] = i; 
        }
      
        int Hand[]={-1,-1,-1,-1,-1};//set up and initialize the array for hand
      
        Random r = new Random ();//Decalre a instance of the Random generator
        int k = Deck.length;//declare a variable to show the effective length of the Deck array
        //set up a loop to draw cards from the deck ramdomly
        for(int j=0;j<Hand.length;j++){
            int draw = r.nextInt(k-1);
            Hand[j] = Deck[draw];//store the ramdom pick from Deck into Hand
            //set the random pick in Deck to -1 and swap with the last effective number in Deck
            Deck[draw]=Deck[k-1];
            Deck[k-1]= -1;
            k--;//reduce the effective array size
        }
        //set up a loop to calculate the rank of each card in hand
        for(int j=0;j<Hand.length;j++){
            Hand[j] = Hand[j]%13;
        }
        
        //check if there is only one pair in hand
        if(exactlyOneDup(Hand))
        {
           //set up a loop to compare numbers in the array with each other
            for(int i=0;i<Hand.length;i++){
                int j=i+1;
                while(j<Hand.length)
                {
                    if (Hand[i]==Hand[j])
                    {
                        int rank=Hand[i];
                        //use the switch to determine which counter should increment
                        switch (rank){
                            case 0:
                                A++;
                                break;
                            case 1:
                                K++;
                                break;
                            case 2:
                                Q++;
                                break;
                            case 3:
                                J++;
                                break;
                            case 4:
                                ten++;
                                break;
                            case 5:
                                nine++;
                                break;
                            case 6:
                                eight++;
                                break;
                            case 7:
                                seven++;
                                break;
                            case 8:
                                six++;
                                break;
                            case 9:
                                five++;
                                break;
                            case 10:
                                four++;
                                break;
                            case 11:
                                three++;
                                break;
                            case 12:
                                two++;
                                break;
                        }    
                                
                        }
                        
                        j++;
                  
                    }
                    
                }
                
          
            }
            
        else{
            
            notOnePair++;
        }
        
        }
        //print out the simulation results
        System.out.println("rank   freq of exactly one pair");
        System.out.println("  A     "+A);
        System.out.println("  K     "+K);
        System.out.println("  Q     "+Q);
        System.out.println("  J     "+J);
        System.out.println(" 10     "+ten);
        System.out.println("  9     "+nine);
        System.out.println("  8     "+eight);
        System.out.println("  7     "+seven);
        System.out.println("  6     "+six);
        System.out.println("  5     "+five);
        System.out.println("  4     "+four);
        System.out.println("  3     "+three);
        System.out.println("  2     "+two);
        System.out.println("--------------------------------");
        System.out.println("total not exactly one pair: "+notOnePair);
        return;   
    }
   
       
   
  
      
}
