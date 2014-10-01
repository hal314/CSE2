//Hao Lu
//HW05
//BoolaBoola Program
//09/29/2014
//Write a program that has three boolean variables to 
//each of which the value of true or false is randomly assigned. 
//Then, at random, combine the three variables with 
//random choices of && and || and stores the result. 
//The program should then present the expression to the user 
//and ask the user to state the result of of the expression

//import scanner
import java.util.Scanner;

//set up the class
public class BoolaBoola{
    
    //set up the main method
    public static void main(String[] args){
        
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        int Mode = (int)(Math.random()*5); //get a random integer from 0 to 4
        int RV1 = (int)(Math.random()*2);//get a random integer from 0 to 1 for the first variable
        int RV2 = (int)(Math.random()*2);//get a random integer from 0 to 1 for the second variable
        int RV3 = (int)(Math.random()*2);//get a random integer from 0 to 1 for the third variable
        
        //declare three boolean variables
        Boolean B1=true;
        Boolean B2=true;
        Boolean B3=true;
        
        Boolean Result=true;//Declare the variable which will store the result of the computation
        Boolean Answer=true;//Decalre the variable which will store the answer the user put in
        
        //Swith between four different operation combinations
        switch (Mode) {
            case 0:
                
                
                System.out.print("Does ");
                
                //Switch between two cases of the first variable
                switch (RV1) {
                    case 0:
                        System.out.print("false");
                        B1 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B1 = true;
                        break;
                }
                System.out.print(" || ");//print out the first boolean operation symbol
                
                //Switch between two cases of the second variable
                switch (RV2) {
                    case 0:
                        System.out.print("false");
                        B2 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B2 = true;
                        break;
                }
                System.out.print(" || ");//print out the second boolean operation symbol
                
                switch (RV3) {
                    case 0:
                        System.out.print("false");
                        B3 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B3 = true;
                        break;
                }
                Result = B1||B2||B3;//compute the result
                
                System.out.print(" have the value true(t/T) or false(f/F)? ");//ask for user input
                break;
        
            case 1:
                
                
                System.out.print("Does ");
                
                //Switch between two cases of the first variable
                switch (RV1) {
                    case 0:
                        System.out.print("false");
                        B1 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B1 = true;
                        break;
                }
                System.out.print(" && ");//print out the first boolean operation symbol
                
                //Switch between two cases of the second variable
                switch (RV2) {
                    case 0:
                        System.out.print("false");
                        B2 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B2 = true;
                        break;
                }
                System.out.print(" || ");//print out the second boolean operation symbol
                
                switch (RV3) {
                    case 0:
                        System.out.print("false");
                        B3 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B3 = true;
                        break;
                }
                Result = B1&&B2||B3;//compute the result
                System.out.print(" have the value true(t/T) or false(f/F)? ");//ask for user input
                break;
                
            case 2:
                
                
                System.out.print("Does ");
                
                //Switch between two cases of the first variable
                switch (RV1) {
                    case 0:
                        System.out.print("false");
                        B1 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B1 = true;
                        break;
                }
                System.out.print(" || ");//print out the first boolean operation symbol
                
                //Switch between two cases of the second variable
                switch (RV2) {
                    case 0:
                        System.out.print("false");
                        B2 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B2 = true;
                        break;
                }
                System.out.print(" && ");//print out the second boolean operation symbol
                
                switch (RV3) {
                    case 0:
                        System.out.print("false");
                        B3 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B3 = true;
                        break;
                }
                Result = B1||B2&&B3;//compute the result
                System.out.print(" have the value true(t/T) or false(f/F)? ");//ask for user input
                break;
                
            case 3:
                
                
                System.out.print("Does ");
                
                //Switch between two cases of the first variable
                switch (RV1) {
                    case 0:
                        System.out.print("false");
                        B1 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B1 = true;
                        break;
                }
                System.out.print(" && ");//print out the first boolean operation symbol
                
                //Switch between two cases of the second variable
                switch (RV2) {
                    case 0:
                        System.out.print("false");
                        B2 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B2 = true;
                        break;
                }
                System.out.print(" && ");//print out the second boolean operation symbol
                
                switch (RV3) {
                    case 0:
                        System.out.print("false");
                        B3 = false;
                        break;
                    case 1:
                        System.out.print("true");
                        B3 = true;
                        break;
                }
                Result = B1&&B2&&B3;//compute the result
                System.out.print(" have the value true(t/T) or false(f/F)? ");//ask for user input
                break;
            
        }
        
        String input = myScanner.next();//accept user input
        if (input.equals("f")||input.equals("F"))
        {
            Answer = false;//set the variable Answer to 0 when f or F was accepted
        }
        else if (input.equals("t")||input.equals("T"))
        {
            Answer = true;//set the variable Answer to 1 when t or T was accepted
        }
        else
        {
            System.out.println("Wrong; Try again");//print out error message
            return;
        }
        
        if (Answer==Result)
        {
            System.out.println("Correct");//print out correct when user typed in the right answer
        }
        else
        {
            System.out.println("Wrong; Try again");//print out error message
        }
    }
}