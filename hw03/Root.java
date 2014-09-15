//Hao Lu
//HW03
//Program#2
//Root.java
//write a program that prompts the user to enter a double
//then prints out a crude estimate of the cube root of the number 
//and the value of this crude guess when cubed.

//import scanner
import java.util.Scanner;

//set up the class
public class Root{
    //set up main method
    public static void main(String [] args){
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter a double, and I print its cube root ");//ask user for input
        double input = myScanner.nextDouble();//accept user input
        double guess;//set up the double guess
        guess = input/3;//compute the first the guess
        for (int i=1; i<6; i=i+1) {
           guess=(2*guess*guess*guess+input) /(3*guess*guess);//improve the accuracy of the guess
        }
        System.out.println("The cube root is "+guess+":");//print out the guess root
        System.out.println(guess+"*"+guess+"*"+guess+" = ");//print out the product
        System.out.println(guess*guess*guess);
    }
}
