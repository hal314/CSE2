//Hao Lu
//HW04
//IncomeTax Program
//09/21/2014
//Write a program that prompts the user to enter an int 
//that gives the thousands of dollars of income 
//and then writes out the amount of tax on the income, 
//given the following (progressive) schedule:  <20, 5%;  >=20 
//and < 40, 7%; >=40 and < 78, 12%; >=78, 14%.

//import scanner
import java.util.Scanner;

//set up the class
public class IncomeTax{
    //set up the main method
    public static void main(String [] args){
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter an int giving the number of thousands: ");//ask user for input
        if (myScanner.hasNextInt())
        {
            int Income = myScanner.nextInt();//accept user input
            int TaxRate; //declare the variable TaxRate
            int Tax;//declare the variable Tax
            if (Income< 20&&Income >=0)
            {
               TaxRate = 5;
               Tax = Income*TaxRate*10;
               System.out.println("The tax rate on $"+Income+",000 is "+TaxRate+".0%, and the tax is $"+Tax+".0");//print out the Income, the corresponding TaxRate and the Tax
               
               
            }
            else if (Income>=20&&Income<40)
            {
               TaxRate = 7;
               Tax = Income*TaxRate*10;
               System.out.println("The tax rate on $"+Income+",000 is "+TaxRate+".0%, and the tax is $"+Tax+".0");//print out the Income, the corresponding TaxRate and the Tax
               
            }
            else if (Income>=40&&Income<78)
            {
               TaxRate = 12;
               Tax = Income*TaxRate*10;
               System.out.println("The tax rate on $"+Income+",000 is "+TaxRate+".0%, and the tax is $"+Tax+".0");//print out the Income, the corresponding TaxRate and the Tax
               
            }
            else if (Income >= 78)
            {
               TaxRate = 14;
               Tax = Income*TaxRate*10;
               System.out.println("The tax rate on $"+Income+",000 is "+TaxRate+".0%, and the tax is $"+Tax+".0");//print out the Income, the corresponding TaxRate and the Tax
               
            }
            else
            {
                System.out.println("You did not enter a positive int");//print out an error message
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