//Hao Lu
//HW05
//BurgerKing Program
//09/29/2014
//Write a program that prompts the user to enter a choice of a burger, 
//a soda, or fries. Then the program prompts the users for 
//details of their choices

//import scanner
import java.util.Scanner;

//set up the class
public class BurgerKing{
    
    //set up the main method
    public static void main(String[] args){
        
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        
        //print out instructions and ask for user input
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("   Burger (B or b)");
        System.out.println("   Soda (S or s)");
        System.out.print("   Fries (F or f)  ");
        
        String input1 = myScanner.next();//accept user input
        if (input1.length()!=1)
        {
            System.out.println("a single character expected");//print out an error message
            return;//leaves the program, the program terminates
        }
        else
        {
            //print out the result when user typed in B or b
            if (input1.equals("B")||input1.equals("b"))
            {
                System.out.println("Enter A or a for \"all the fixins\"");
                System.out.println(" C or c for cheese");
                System.out.print(" N or n for none of the above ");//ask user for another input
                String input2 = myScanner.next();//accept user input
                if (input2.length()!=1)
                {
                    System.out.println("a single character expected");//print out an error message
                    return;//leaves the program, the program terminates
                }
                else
                {
                    //print out the result when user typed in A or a
                    if (input2.equals("A")||input2.equals("a"))
                    {
                       System.out.println("You ordered a burger with all the fixins"); 
                    }
                    
                    //print out the result when user typed in C or c
                    else if (input2.equals("C")||input2.equals("c"))
                    {
                       System.out.println("You ordered a burger with cheese");
                    }
                    
                    //print out the result when user typed in N or n
                    else if (input2.equals("N")||input2.equals("n"))
                    {
                       System.out.println("You ordered a burger with none of the above"); 
                    }
                    
                    //print out the error message when user typed in other letters
                    else
                    {
                        System.out.println("You did not enter any of A, a, C, c, N, or n");
                        return;//leaves the program, the program terminates
                    }
                }
            }
            
            //print out the result when user typed in S or s
            else if (input1.equals("S")||input1.equals("s"))
            {
                System.out.println("Do you want Pepsi (p or P),");
                System.out.print("Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)  "); //ask user for another input
                String input3 = myScanner.next();//accept user input
                if (input3.length()!=1)
                {
                    System.out.println("a single character expected");//print out an error message
                    return;//leaves the program, the program terminates
                }
                else
                {
                    //print out the result when user typed in P or p
                    if (input3.equals("P")||input3.equals("p"))
                    {
                       System.out.println("You ordered a Pepsi"); 
                    }
                    
                    //print out the result when user typed in C or c
                    else if (input3.equals("C")||input3.equals("c"))
                    {
                       System.out.println("You ordered a Coke");
                    }
                    
                    //print out the result when user typed in S or s
                    else if (input3.equals("S")||input3.equals("s"))
                    {
                       System.out.println("You ordered a Sprite"); 
                    }
                    
                    //print out the result when user typed in M or m
                    else if (input3.equals("M")||input3.equals("m"))
                    {
                        System.out.println("You ordered a Mountain Dew");
                    }
                    //print out the error message when user typed in other letters
                    else
                    {
                        System.out.println("You did not enter any of P, p, C, c, S, s, M or m");
                        return;//leaves the program, the program terminates
                    }
                }
                
            }
            
            //print out the result when user typed in F or f
            else if (input1.equals("F")||input1.equals("f"))
            {
                System.out.print("Do you want a large or small order of fries (l,L,s, or S)  ");//asl user for another input
                String input4 = myScanner.next();//accept user input
                if (input4.length()!=1)
                {
                    System.out.println("a single character expected");//print out an error message
                    return;//leaves the program, the program terminates
                }
                else
                {
                    //print out the result when user typed in L or l
                    if (input4.equals("L")||input4.equals("l"))
                    {
                       System.out.println("You ordered large fries"); 
                    }
                    
                    //print out the result when user typed in S or s
                    else if (input4.equals("S")||input4.equals("s"))
                    {
                       System.out.println("You ordered small fries");
                    }
                    
                    
                    
                    //print out the error message when user typed in other letters
                    else
                    {
                        System.out.println("You did not enter any of L, l, S or s");
                        return;//leaves the program, the program terminates
                    }
                }
            }
            
            //print out an error message when user typed in other letters
            else
            {
                System.out.println("You did not enter any of B, b, S, s, F, or f");
                return;//leaves the program, the program terminates
            }
        }
    }
}