//Hao Lu
//HW09
//Blocked Again Program
//11/03/2014

import java.util.Scanner;
    public class BlockedAgain{
        
        //construct the getInt method
        public static int getInt(){
            
            Scanner myScanner;//Declare a instance of the Scanner object
            myScanner = new Scanner(System.in);//call the Scanner constructor
            System.out.print("Enter an in int between 1 and 9, inclusive: ");//ask user for input
            boolean a;
            boolean b;
            int input=0;
            do {
                a=checkInt(myScanner);
            //continues to request input from user until an int is provided
            if (a == false) {
                System.out.print("You did not enter an int; try again: ");//request input again
                myScanner.next();
            }
            else{
                
                input = myScanner.nextInt();//accept user input
                b = checkRange(input);
                if ( b == false){
                    System.out.print("You did not enter an int in [1,9]; try again: ");//print out error message and ask for input again
                    
                } 
                else {
                    return input;
                }
            }
            
                
            }while(true);
            
            
            
            }
            
        
        //construct the chaeckRange input
        public static boolean checkRange(int s) {
            
            if (s>=1 && s<=9) {
                return true;
            }
            
            else {
                return false;
            }
            
        }
        
        //construct the checkInt method
        public static boolean checkInt(Scanner scan) {
            if (scan.hasNextInt())
            {
                return true;//if the input is a int, return true
            }
            else {
                return false;//if the input is not a int, return false
            }    
        }
        
        //construct the allBlocks method
        public static void allBlocks(int d) {
            
            int diff = d-1;//calculate the indent distance for the first block
            
            for(int i=1;i<=d;i++) {
                
                blocks(i,diff);//call for the blocks method
                diff--;
                
            }
            
            return;
            
            
            
        }
        
        //construct the blocks method
        public static void blocks(int e, int f) {
            
            int lines = e+1;
            for (int i=1;i<lines;i++) {
                line(e,f);//call for the line method
                
            }
            int j=1;
            //print out the proper indent distance
                while (j<=f) {
                    System.out.print(" ");
                    j++;
                }
                while (j<=(f+(e*2-1))){
                    System.out.print("-");
                    j++;
                }
                System.out.println("");
            return;
        }
        
        //construct the line method
        public static void line(int g, int h) {
            
            
                int j=1;
                
                //print out the proper indent distance
                while (j<=h) {
                    System.out.print(" ");
                    j++;
                }
                
                //print out the proper number
                while (j<=(h+(g*2-1))){
                    System.out.print(g);
                    j++;
                }
                System.out.println("");
                return;
        }
            
            
        
        
        
        
        public static void main(String []s){
                int m;
//force user to enter int in range 1-9, inclusive.
                m = getInt(); 
                allBlocks(m);
    }
}
