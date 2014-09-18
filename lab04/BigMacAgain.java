//Hao Lu
//Lab4
//Big Mac Time Again
//Write a program that uses the Scanner class to obtain from users 
//how many Big Macs they want and whether they want an order of fries. 
//It then prints out the total cost of the meal. 
//Big Macs still cost $2.22 each,  and an order of fries costs $2.15. 

//import sacanner
import java.util.Scanner;

//set up the class
public class BigMacAgain{
    //set up the main method
    public static void main(String [] args){
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter the number of Big Macs: ");//ask user for input
        if (myScanner.hasNextInt())
        {
            int nBigMacs = myScanner.nextInt();//accept user input
            if (nBigMacs > 0)
            {
               double cost$;//declare the variable for total cost
               cost$ = nBigMacs*2.22;//calculate the total cost
               System.out.printf("You ordered "+nBigMacs+" Big Macs for a cost of "+nBigMacs+"*2.22 = "+"%.2f",cost$);
               System.out.println();
               System.out.print("Do you want an order of fries (Y/y/N/n)? ");//ask the users if they want an order of fires
               String answer = myScanner.next();//read the input
               if (answer.equals("Y")||answer.equals("y"))
               {
                   cost$ = cost$+2.15;//add an order of fires
                   System.out.println("You ordered fries at a cost of $2.15");//show users that they have ordered an order of fries at the cost of $2.15
                   System.out.printf("The total cost of the meal is "+"%.2f",cost$);//print out the total cost
                   System.out.println();
                   
                   
               }
               else if (answer.equals("N")||answer.equals("n"))
               {
                   System.out.printf("The total cost of the meal is "+"%.2f",cost$);//print out the total cost without fries
                   System.out.println();
                   
               }
               else
               {
                   System.out.println("The input is not valid");
                   return;//leaves the program, the program terminates 
               }
            }
            else
            {
                System.out.println("You did not enter an int > 0");//print out an error message
                return;//leaves the program, the program terminates
            }
        }
        else 
        {
            System.out.println("You did not enter an int");//print out an error message
            return;//leaves the program, the program terminates
        }
    }
}
