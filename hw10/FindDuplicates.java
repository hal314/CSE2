//Hao Lu
//HW10
//Program 1
//FindDuplicates Program



//import scanner
import java.util.Scanner;

//set up the class
public class FindDuplicates{
    
  //set up the main method    
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);//call the Scanner constructor
    int num[]=new int[10];//set up the array
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");//ask user for input
      
      ////store the inputs into the arrar
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      
      //call the hadDups method and show the result
      if(hasDups(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);//display the result
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }
  
  //construct the listArray method
  public static String listArray(int num[]){
    String out="{";
    //print out each number in the array
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  
  //construc the hasDups method
  public static boolean hasDups(int num[]){
      
      //set up a loop to compare numbers in the array with each other
      for(int i=0;i<num.length;i++){
          int j=i+1;
          while(j<num.length)
          {
              if (num[i]==num[j])
              {
                  return true;//when two numbers in the array are same,return true
              
                  
              }
              else 
              {
                  j++;
              }
          }
          
      }
      return false;//if there are no duplicate numbers, return false
  }
  
  //construct the exactlyOneDup method
  public static boolean exactlyOneDup(int num[]){
      int count = 0; //set up a varaible to record the number of duplicates
      
      //set up a loop to compare numbers in the array with each other
      for(int i=0;i<num.length;i++){
          int j=i+1;
          while(j<num.length)
          {
              if (num[i]==num[j])
              {
                  count++;//when two numbers in the array are same,return true
              }
              
              j++;
          }
          
      }
      //return the results
      if (count==1){
          return true;//if there is only one duplicate return true
      }
      else {
          return false;//else return false
      }
  }
}
