//Hao Lu
//HW07
//NumberStack Program


//import scanner
import java.util.Scanner;

//set up the class
public class NumberStack{
    
    //set up the main method
    public static void main(String[] args){
        
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner(System.in);//call the Scanner constructor
        
        System.out.print("Enter an integer between 1 and 9: ");//ask user for input
        if (myScanner.hasNextInt())
        {
            int input = myScanner.nextInt();//accept user input
            if(input<1||input>9)
            {
                System.out.println("Your int was not in the range [1,9]");//print out error message
                return;
            }
            
            else
            {
                //set up the loop using for loops
                int NumberCounter = 1;//the quantity of numbers in a line
                System.out.println("Using for loops: ");
                for (int number=1;number <= input;number++){
                    
                    for (int i=1;i<=number;i++){
                    
                     for (int j=1;j<=NumberCounter;j++){
                         System.out.print(number);
                     }  
                     System.out.println("");//print out a new line
                    }
                    
                    for (int k=1;k<=NumberCounter;k++){
                        System.out.print("-");
                    }
                    System.out.println("");//print out a new line
                NumberCounter = NumberCounter+2;//increase NumberCounter by 2 
                
                
                }
                
                //set up the loop using while loops
                //reset the counters
                NumberCounter = 1;
                int number = 1;
                int i = 1;
                int j = 1;
                int k = 1;
                System.out.println("Using while loops: ");
                while (number <= input){
                    
                    while (i<=number){
                    
                     while (j<=NumberCounter){
                         System.out.print(number);
                         j++;//increase j by 1
                     }  
                     System.out.println("");//print out a new line
                     i++;//increase i by 1
                     j = 1;//reset the counter for the quantity of numbers in a line
                    }
                    
                    while (k<=NumberCounter){
                        System.out.print("-");
                        k++;//increase k by 1
                    }
                    System.out.println("");//print out a new line
                    number++;//increase number by 1
                    NumberCounter = NumberCounter+2;//increase NumberCounter by 2 
                    
                    //reset the counters
                    i = 1;
                    k = 1;
                
                }
                
                
                //set up the loop using do while loops
                //reset the counters
                NumberCounter = 1;
                number = 1;
                i = 1;
                j = 1;
                k = 1;
                System.out.println("Using do-while loops: ");
                do{
                    
                    do{
                    
                     do{
                         System.out.print(number);
                         j++;//increase j by 1
                     }while (j<=NumberCounter);  
                     System.out.println("");//print out a new line
                     i++;//increase i by 1
                     j = 1;//reset the counter for the quantity of numbers in a line
                    }while (i<=number);
                    
                    do{
                        System.out.print("-");
                        k++;//increase k by 1
                    }while (k<=NumberCounter);
                    System.out.println("");//print out a new line
                    number++;//increase number by 1
                    NumberCounter = NumberCounter+2;//increase NumberCounter by 2 
                    
                    //reset the counters
                    i = 1;
                    k = 1;
                
                }while (number <= input);
                
            
            }
        }
        
        else
        {
            System.out.println("You did not enter an int");//print out error message
            return;
        }
    }
}