//Hao Lu
//Lab06
//Enigma1

/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    Scanner myScanner;
    myScanner = new Scanner(System.in);
    if(myScanner.hasNextDouble())
    {
    double x=myScanner.nextDouble();
    if(x<0 || x>99)
    {
        System.out.println("You did not enter a number between 0 and 99");
        return;
    }
    else
    {
   System.out.println("You entered "+x+"%");
   
      System.out.println("The proportion remaining is "+(1-x/100));
    
   }
    }
   else
   {
       System.out.println("You did not enter a number");
       return;
   }
}
}


/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 * The program should check if the user entered a double between 0 and 99
 * The program deosn't work for all the numbers between 0 and 99
 * 
 * 
 */
