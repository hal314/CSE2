//Hao Lu
//HW11
//Program 1
//PokerHands Program

//import Scanner
import java.util.Scanner;

//set up the class
public class PokerHands{

  //set up th main method
  public static void main(String [] args){
    showHands();
  }
  
  //construct the showHands method
  public static void showHands(){
    Scanner scan=new Scanner(System.in);
    int deck[]=new int[52];
    int hand[]={-1,-1,-1,-1,-1};
    String answer="";
    do{
      int k=0;
      int h=0;
      for(int i=0;i<deck.length;i++)
        //store 0 to 51 into the Deck array
        deck[i]=i;
      for(int i=0;i<5;i++){
        System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
        answer=scan.next();
        switch(answer){//input suit of card
          case "c":
          case "C":
            h=0;
            break;
          case "d":
          case "D":
            h=13;
            break;
          case "h":
          case "H":
            h=26;
            break;
          case "s":
          case "S":
            h=39;
            break;
          default:
            System.out.println("You did not enter a valid response");
            i--;
            continue;
        }
        System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
        answer=scan.next();
        switch(answer){//input rank of card
          case "a":
          case "A":
            h+=0;
            break;
          case "k":
          case "K":
            h+=1;
            break;
          case "q":
          case "Q":
            h+=2;
            break;
          case "j":
          case "J":
            h+=3;
            break;
          case "10":
            h+=4;
            break;
          case "9":
            h+=5;
            break;
          case "8":
            h+=6;
            break;
          case "7":
            h+=7;
            break;
          case "6":
            h+=8;
            break;
          case "5":
            h+=9;
            break;
          case "4":
            h+=10;
            break;
          case "3":
            h+=11;
            break;
          case "2":
            h+=12;
            break;
          default:
            System.out.println("You did not enter a valid response");
            i--;
            continue;
        }
        if(deck[h]==-1){//card already dealt
          System.out.println("You already entered that card");
          i--;
          continue;
        }
        hand[k++]=h;//increment k and assign card value to hand[]
        deck[h]=-1;//mark card as dealt
      }
      showOneHand(hand);//display hand value
      pattern(hand);//analyze pattern
      System.out.print("Enter 'y' or 'Y' ton enter a(nother) hand- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }
  
  //construct the showOneHand method
  public static void showOneHand(int hand[]){
    String suit[]={"Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "};
    String face[]={"A ","K ","Q ","J ","10 ","9 ","8 ","7 ","6 ","5 ",
            "4 ","3 ","2 "};
    String out="";
    for(int s=0;s<4;s++){
      out+=suit[s];
      for(int rank=0;rank<13;rank++)
        for(int card=0;card<5;card++)
          if(hand[card]/13==s && hand[card]%13==rank)
            out+=face[rank];
      out+='\n';
    }
    System.out.println(out);
  }
  
  //construct the pattern method
  public static void pattern(int hand[]){
    boolean isStraight=false, isFlush=false;
    //rank array for straight
    int rank[]=new int[13];
    for(int i=0;i<13;i++)
      rank[i]=0;
    for(int i=0;i<5;i++){
      rank[hand[i]%13]++;//increment cards rank on array
    }
    for(int i=0;i<9;i++){
      if(rank[i]==1 && rank[i+1]==1 && rank[i+2]==1 && rank[i+3]==1 && rank[i+4]==1)
        isStraight=true;
    }
    
    //suit array for flush
    int suit[]=new int[4];
    for(int i=0;i<4;i++)
      suit[i]=0;
    for(int i=0;i<5;i++){
      suit[hand[i]/13]++;//increment cards suit on array
    }
    for(int i=0;i<4;i++){
      if(suit[i]==5)
        isFlush=true;
    }
    
    //frequency array that counts number of ranks
    int freq[]=new int[5];
    for(int i=0;i<5;i++)
      freq[i]=0;
    for(int i=0;i<13;i++)
      freq[rank[i]]++;
    if(freq[4]==1){//4 same numbers
      System.out.println("\nThis is a Four of a Kind");
      return;
    }
    if(freq[2]==1 && freq[3]==1){//3 same numbers and 2 same numbers
      System.out.println("\nThis is a Full House");
      return;
    }
    if(freq[3]==1){//3 same numbers
      System.out.println("\nThis is a Three of a Kind");
      return;
    }
    if(freq[2]==2){//2 pairs of same numbers
      System.out.println("\nThis is a Two Pair");
      return;
    }
    if(freq[2]==1){//1 pair of same numbers
      System.out.println("\nThis is a One Pair");
      return;
    }
    if(isStraight && isFlush && rank[0]==1){//A K Q J 10 of same suit
      System.out.println("\nThis is a Royal Flush");
      return;
    }
    if(isStraight && isFlush){//same suit straight
      System.out.println("\nThis is a Straight Flush");
      return;
    }
    if(isStraight){//straight
      System.out.println("\nThis is a Straight");
      return;
    }
    if(isFlush){//flush
      System.out.println("\nThis is a Flush");
      return;
    }
    //everything else is a high card
    System.out.println("\nThis is a High Card");
    return;
  }
}