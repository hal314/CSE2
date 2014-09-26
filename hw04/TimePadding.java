//Hao Lu
//HW04
//TimePadding Program
//09/21/2014
//Write a program that has the user enter an positive integer 
//giving the number of seconds that have passed during the day 
//and then displays the time in conventional form. 
//(The problem here is displaying time with “padded” 0s, e.g., 10:03:05)

//import scanner
import java.util.Scanner;

//set up the class
public class TimePadding{
    
    //set up the main method
    public static void main(String [] args){
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter the time in seconds: ");//ask user for input
        if (myScanner.hasNextInt())
        {
            int Seconds = myScanner.nextInt();//accept user input
            if (Seconds<=0)
            {
                System.out.println("You did not enter a positive int");//print out an error message
                return;//leaves the program, the program terminates
            }
            else
            {
                int S = Seconds%60;//calculate the second part
                Seconds = Seconds-S;//calculate the remaining seconds
                int M = Seconds%3600/60;//calculate the minute part
                Seconds = Seconds-M*60;//calculte the remaining seconds
                int H = Seconds/3600;//calculte the hour part
                
                System.out.printf("The time is "+H);//print out the hour part
                if (M<10)
                {
                    System.out.printf(":0"+M);//print out the minute part
                }
                else
                {
                    System.out.printf(":"+M);//print out the minute part
                }
                if (S<10)
                {
                    System.out.printf(":0"+S);//print out the second part
                }
                else
                {
                    System.out.printf(":"+S);//print out the second part
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("You did not enter an int");//print out an error message
            return;//leaves the program, the program terminates
        }
    }
}