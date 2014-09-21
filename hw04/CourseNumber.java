//Hao Lu
//HW04
//CourseNumber Program
//09/21/2014
//The semester during which a course is offered at Lehigh is given by a 6 digit number. 
//The first four digits give the year, and the last two digits give the semester: 
//10 spring, 20 summer 1, 30 summer 2, and 40 fall. 
//Write a program that reads in a 6 digit number, 
//makes sure that it adheres to the above description, 
//and then prints out the semester and year.

//import scanner
import java.util.Scanner;

//set up the class
public class CourseNumber{
    
    //set up the main method
    public static void main(String [] args){
        Scanner myScanner;//Declare a instance of the Scanner object
        myScanner = new Scanner( System.in );//call the Scanner constructor
        System.out.print("Enter a six digit number giving the course semester ");//ask user for input
        if (myScanner.hasNextInt())
        {
            int CN = myScanner.nextInt();//accept user input
            if (CN>=168510&&CN<=201440)
            {
                int Semester=CN%100;//read the two digits which represent semester
                int Year=(CN-Semester)/100;//read the first four digits
                if (Semester==10)
                {
                   System.out.println("The course was offered in the Spring semester of "+Year);//print out the result
                   
                }
                else if (Semester==20)
                {
                   System.out.println("The course was offered in the Summer 1 semester of "+Year);//print out the result
                }
                else if (Semester==30)
                {
                   System.out.println("The course was offered in the Summer 2 semester of "+Year);//print out the result
                }
                else if (Semester==40)
                {
                   System.out.println("The course was offered in the Fall semester of "+Year);//print out the result
                }
                else
                {
                    System.out.println(Semester+" is not a legitimate semester");//print out an error message
                    return;//leaves the program, the program terminates
                }
            }
            else
            {
                System.out.println("The number was outside the range [186510,201440]");//print out an error message
                return;//leaves the program, the program terminates
            }
        }
        else
        {
            System.out.println("You did not enter an int");//print out an error message
            return;//leaves the program, the program terminates
        }
    }
}