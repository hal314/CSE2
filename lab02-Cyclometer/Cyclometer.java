//Hao Lu
//Lab2
//Cyclometer Program

public class Cyclometer{
  public static void main(String [] args){
  int secsTrip1=480;//time used in trip1
  int secsTrip2=3220;//time used in trip 2
  int countsTrip1=1561;//the counts of rotation in trip1
  int countsTrip2=9037;//the counts of rotation in trip2
  double wheelDiameter=27.0,//the diameter of the wheel
  PI=3.14159,//PI value
  feetPerMile=5280,//the constant used to convert foot to mile
  inchesPerFoot=12,//the constant used to convert inch to foot
  secondsPerMinute=60;//the constant used to convert second to minute
double distanceTrip1,distanceTrip2,totalDistance;

System.out.println("Trip 1 took "+
  (secsTrip1/secondsPerMinute)+" minutes and had "+
  countsTrip1+" counts.");
System.out.println("Trip 2 took "+
  (secsTrip2/secondsPerMinute)+" minutes and had "+
  countsTrip2+" counts.");
distanceTrip1=countsTrip1*wheelDiameter*PI;
//Above gives distance in inches
//(for each count,a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1=inchesPerFoot*feetPerMile;//Converts to distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");
  }
}