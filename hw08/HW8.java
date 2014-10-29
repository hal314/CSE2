//Hao Lu
//HW08
//10/27/2014

import java.util.Scanner;
public class HW8{
    //set up the getInput method
    public static char getInput(Scanner scan, String s) {
    // loop for re-entry
    do {
      // take input from user
      String temp = scan.nextLine();
      char ch = temp.charAt(0);
      // check length
      if(temp.length() > 1) {
        System.out.print("You should enter exactly one character- ");
      }
      else {
        // check through the list and return ch if matching
        for(int i = 0; i < s.length(); i++) {
          if(ch == s.charAt(i)) {
            return ch;
          }
        }
        // prompt for error if not matching
        System.out.print("You did not enter a character from the list '" + s + "'; try again- ");
      }
    } while(true);
  }
  
  
  public static char getInput(Scanner scan, String s, int attempts) {
    // loop for re-entry
    int j=attempts;
    char d = ' ';
    do {
      // take input from user
      String temp = scan.nextLine();
      char ch = temp.charAt(0);
      // check length
      if(temp.length() > 1) {
        System.out.print("You should enter exactly one character- ");
      }
      else {
        // check through the list and return ch if matching
        for(int i = 0; i < s.length(); i++) {
          if(ch == s.charAt(i)) {
            return ch;
          }
        }
        // prompt for error if not matching
        System.out.print("You did not enter a character from the list '" + s + "'; try again- ");
      
         j--; 
      }
    } while(j>=0);
    
    
    return d;//return ' ' after certain attempts
    
  }
  
  
  public static char getInput(Scanner scan, String d, String s) {
    // loop for re-entry
    do {
        
        System.out.println(d);
        System.out.print("Enter one of: ");
        for (int j=0; j<s.length()-1;j++){
            System.out.print("'"+s.charAt(j)+"', ");
        }
        System.out.print("'"+s.charAt(s.length()-1)+"': ");
      // take input from user
      String temp = scan.nextLine();
      char ch = temp.charAt(0);
      // check length
      if(temp.length() > 1) {
        System.out.println("Enter exactly one character ");
      }
      else {
        // check through the list and return ch if matching
        for(int i = 0; i < s.length(); i++) {
          if(ch == s.charAt(i)) {
            return ch;
          }
        }
        // prompt for error if not matching
        System.out.println("You did not enter an acceptable character ");
      
      }
    } while(true);
    
    
  }

         
        
        
        
    
  public static void main(String []arg){
	char input;
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
	input=getInput(scan,"Cc");
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	else{
	    System.out.println("");
	    System.out.println("You failed after 5 tries");
	}
	input=getInput(scan,"Choose a digit.","0123456789");
	System.out.println("You entered '"+input+"'");
  }  
}
