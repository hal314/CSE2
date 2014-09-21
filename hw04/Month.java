//Hao Lu
//HW04
//Month Program
//09/21/2014
//Write a program that prompts the user to enter an integer for the month 
//(1 for January, 2 for February, etc.)  
//and then displays the number of days in the month).  
//If the number 2 is entered (February) the user is then asked to enter the year. 

//import scanner
import java.util.Scanner;

//set up the class
public class Month{
    //set up the main method
    public static void main(String [] args){
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter an int giving the number of the month (1-12): ");//ask user for input
        if (myScanner.hasNextInt())
        {
            int M = myScanner.nextInt();//accept user input
            int D;//declare the variable days
            if (M==1||M==3||M==5||M==7||M==8||M==10||M==12)
            {
                D=31;//These months have 31 days
                System.out.println("The month has "+D+" days");//print out the result
                
            }
            else if (M==4||M==6||M==9||M==11)
            {
                D=30;//These months have 30 days
                System.out.println("The month has "+D+" days");//print out the result
            }
            else if (M==2)
            {
                System.out.print("Enter an int giving the year: ");//ask user for the input of year
                if (myScanner.hasNextInt())
                {
                    int Y = myScanner.nextInt();//accept user input
                    int R1 = Y%4;//the remainder when the year is divided by 4
                    int R2 = Y%100;//the remainder when the year is divided by 100
                    int R3 = Y%400;//the remainder when the year is divided by 400
                    if (R1==0&&R2!=0)
                    {
                        D=29;//There are 29 days in that month
                        System.out.println("The month has "+D+" days");//print out the result
                    }
                    else if(R2==0&&R3==0)
                    {
                        D=29;//There are 29 days in that month
                        System.out.println("The month has "+D+" days");//print out the result
                    }
                    else
                    {
                        D=28;//There are 28 days in that month
                        System.out.println("The month has "+D+" days");//print out the result
                    }
                }
                else
                {
                    System.out.println("You did not enter an int");//print out an error message
                    return;//leaves the program, the program terminates
                }
            }
            else
            {
                System.out.println("You did not enter an int between 1 and 12");//print out an error message
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