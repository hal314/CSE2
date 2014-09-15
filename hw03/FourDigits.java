//Hao Lu
//HW03
//Program#3
//FourDigits.java
//Write a program that prompts the user to enter a double
//Then prints out the first four digits to the right of the decimal point

//import scanner
import java.util.Scanner;

//set up the class
public class FourDigits{
    //set up main method
    public static void main(String [] args){
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter a double and I display the four digits to the right of the decimal    point ");//ask user for input
        double input = myScanner.nextDouble();//accept user input
        int firstDigit, secondDigit, thirdDigit, fourthDigit;//set up the variables that store each of the four digits
        firstDigit = (int)(input*10)%10;//store the first digit
        secondDigit = (int)(input*100)%10;//store the second digit
        thirdDigit = (int)(input*1000)%10;//store the third digit
        fourthDigit = (int)(input*10000)%10;//store the fourth digit
        System.out.println("The four digits are "+firstDigit+secondDigit+thirdDigit+fourthDigit);//print out results
    }
}