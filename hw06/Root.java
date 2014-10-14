//Hao Lu
//HW06
//Root Program
//10/14/2014
//Write a Java program that forces the user to enter a double 
//that is greater than 0, uses the algorithm to compute the 
//square root of the number, and then prints it out. 
//Use 0.0000001 as the “tolerance” for stopping the loop that 
//computes the square root


//import scanner
import java.util.Scanner;

//set up the class
public class Root{
    
    //set up the main method
    public static void main(String[] args){
        
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter a positive double, the program will compute the square root: ");//ask user for input
        if (myScanner.hasNextDouble())//check if the user put in a double
        {
           double x = myScanner.nextDouble();//accept user input
           if (x<=0)
           {
               System.out.println("The double is not greater than 0");//print out an error message
               return;//leaves the program, the program terminates
           }
           else
           {
               double low = 0;//initialize low
               double high = 1+x;//initialize high
               double middle=(high+low)/2;//declare the variable middle
               while ((high-low)>=0.0000001*(1+x)){
                   
                   middle = (high+low)/2;//calculate middle
                   
                   //If the square of middle is greater than x, then change high to middle
                   if(middle*middle > x)
                   {
                       high = middle;
                   }
                   
                   //otherwise change low to middle
                   else
                   {
                       low = middle;
                   }
                   
                   
                   
               }
               System.out.println("The square root of "+x+" is "+middle);//print out the result
           }
        }
        
        else
        {
            System.out.println("You did not enter a double");//print out an error message
            return;//leaves the program,the program terminates
        }
        
    } 
}