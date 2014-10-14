//Hao Lu
//Lab07
//LoopTheLoop Program


//import scanner
import java.util.Scanner;

//set up the class
public class LoopTheLoop{
    
    //set up the main method
    public static void main(String[] args){
        
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        
        //set up the infinite loop
        while (true){
            System.out.print("Enter an int between 1 and 15: ");//ask user for input
            if (myScanner.hasNextInt())
            {
               int nStars = myScanner.nextInt();//accept user input
               if (nStars<1||nStars>15)
               {
                   System.out.println("Your int was not in the range [1.15]");//print out error message
                   return;
               }
               else
               {
                   int i = 0;
                   int j = 0;
                   int k = 1;
                   while (i<nStars)
                   {
                       System.out.print("*");
                       i++;
                   }
                   System.out.println("");
                   while (k<=nStars)
                   {
                       j=0;
                       while (j<k)
                       {
                         System.out.print("*");
                         j++;
                       }
                       System.out.println("");
                       k++;
                   }
               }
                
            }
            
            else
            {
                System.out.println("You did not enter an int");//print out error message
                return;
            }
            System.out.print("Enter y or Y to go again-");
            String answer = myScanner.next();
            if(answer.equals("Y")||answer.equals("y"))
            {
                
            }
            else
            {
                break;//if user did not enter y or Y, break the loop
            }
        }
    }
}