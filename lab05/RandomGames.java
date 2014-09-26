//Hao Lu
//Lab05
//RandomGames Program
//09/25/2014
//Write a program that uses the Scanner class to obtain from the user
//one of three choices for a game of chance: (1) Roulette; (2) Craps; or (3) Picking a
//card from a deck of playing cards. The user should enter one of the Strings “R” , “r”,
//“C”, “c”, “P”, “p”. If the string is not of length one, an error message should be
//displayed. If the string has any other character than ‘R’, ‘r’, ‘C’, ‘c’, ‘P’, or ‘p’ an error
//message should be displayed. If the user enters “R” or “r” then the program will print
//the results of a play at Roulette, one of the numbers 0, 00, 1, 2, …, 36 (the roulette
//wheel has 18 red numbers, 1, 3, …, 35, 18 black numbers, 2,4,...,36, and a blue 0
//and a blue 00). If the user enters “C” or “c”, then the program should display the
//random outcome of two rolls of a die (each roll in the range 1, 2, …, 6). If the user
//enters “P” or “p”, then the program should display a random draw from a deck of
//cards

//import scanner
import java.util.Scanner;

//set up the class
public class RandomGames{
    
    //set up the main method
    public static void main(String [] args){
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");//ask user for input
        String input = myScanner.next();//accept user input
        if (input.length()!=1)
        {
            System.out.println("a single character expected");//print out an error message
            return;//leaves the program, the program terminates
        }
        else
        {
            //If the user enters “R” or “r” then the program will print
            //the results of a play at Roulette
            if (input.equals("r")||input.equals("R"))
            {
                int Roulette = (int)(Math.random()*38);// get a random integer from 0 to 37
                
                //The program displays the random number from the Roulette
                switch (Roulette) {
                    case 37:
                        System.out.println("Roulette: 00");
                        break;
                    default:
                        System.out.println("Roulette: "+Roulette);
                        break;
                }
            }
            
            
            //If the user enters “C” or “c”, then the program should display the
            //random outcome of two rolls of a die (each roll in the range 1, 2, …, 6)
            else if (input.equals("c")||input.equals("C"))
            {
                int R1 = (int)(Math.random()*6)+1;//get a random integer from 1 to 6 for the first roll
                int R2 = (int)(Math.random()*6)+1;//get a random integer from 1 to 6 for dice second roll
                int Sum = R1+R2;//compute the sum of two rolls
                System.out.println("Craps:"+R1+" + "+R2+" = "+Sum);//Display the results of the game
                
            }
            
            
            //If the user enters “P” or “p”, then the program should display a 
            //random draw from a deck of cards
            else if (input.equals("p")||input.equals("P"))
            {
                int kind =  (int)(Math.random()*4)+1;//get a random integer from 1 to 4 which will represent the kind of card
                int N = (int)(Math.random()*13)+1;//get a random integer from 1 to 13 which will represent the number on card
                
                //Display the number on card
                switch (N){
                    
                    case 11:
                        System.out.print("Jack of ");
                        break;
                    case 12:
                        System.out.print("Queen of ");
                        break;
                    case 13:
                        System.out.print("King of ");
                        break;
                    default:
                        System.out.print(N+" of ");
                        break;
                    
                }
                
                //Display the kind of the card
                switch (kind){
                    case 1:
                        System.out.println("diamonds");
                        break;
                    case 2:
                        System.out.println("hearts");
                        break;
                    case 3:
                        System.out.println("spades");
                        break;
                    case 4:
                        System.out.println("clubs");
                        break;
                }
            }
            
            //otherwise print out an error message
            else
            {
                System.out.println("'"+input+"' is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");//print out an error message
                return;//leaves the program, the program terminates

            }
        }
    }
}