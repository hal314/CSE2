//Hao Lu
//HW03
//Program#1
//Bycycle.java
//Write a program that prompts the user to enter two digits
//the first giving the number of counts on a cyclometer and the second giving the number of seconds during which the counts occurred
//then computes and  prints out the distance traveled and the average miles per hour
//assume the diameter of the wheel is 27 inches

//import scanner
import java.util.Scanner;

//set up the class
public class Bicycle{
    //set up main method
    public static void main(String [] args){
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter the number of seconds: ");//ask user for input
        int nSeconds = myScanner.nextInt();//accept user input
        System.out.print("Enter the number of counts: ");//ask user for input
        int nCounts= myScanner.nextInt();//accept user input
        double distance, time, mph;
        double wheelDiameter=27.0,//the diameter of the wheel
        PI=3.14159,//PI value
        feetPerMile=5280,//the constant used to convert foot to mile
        inchesPerFoot=12,//the constant used to convert inch to foot
        secondsPerMinute=60;//the constant used to convert second to minute
        distance = nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;//compute the distance traveled and convert inches to miles
        time = nSeconds/secondsPerMinute;//convert seconds traveled to minutes
        mph = distance/(time/60);//compute mph
        System.out.printf("The distance was "+"%.2f",distance);//pint out the distance traveled in miles 
        System.out.printf(" miles and took "+"%.1f",time);//print out the time passed in minutes
        System.out.println(" minutes.");
        System.out.printf("The average mph was "+"%.2f",mph);//print out the average mph
        System.out.println(".");
    }
}