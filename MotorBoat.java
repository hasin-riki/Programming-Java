//Hasin Zaman
//23010
import java.util.Scanner;
public class MotorBoat{
	
	static int fuelcapacity=10000;
	static int fuel=10000;
	static int maxspeed=20;
	static int speed=0;
	static int motorefficiency=5;
	static int dist=0;

public static void changespeed(int value){
	
	speed=value;}

public static void boatruntime(int value){
	
	int time=value;}

public static void refuel(int value){
	
	fuel=fuel + value;}

public static int fuelamount(int value){
	
	int fuelused=motorefficiency*speed*speed*value;
	int fuelintank=fuel-fuelused;
	return fuelintank;}

public static int distance(int value){
	
	dist=speed * value;
	return dist;}	

public static void main(String[] args){

	Scanner obj=new Scanner(System.in);
	
	int input1=0;
	while(true){
	System.out.println("Set any speed of the Boat(Enter speed in kms/hr from 0 to 20)");
	input1=obj.nextInt();
	if(input1<=20 && input1>=0){
	break;}
	else{
	System.out.println("Speed out of range! Input Again!");}}
	changespeed(input1);
		
	System.out.println("For how long do you wish to run the boat at current speed?");
	int input2=obj.nextInt();
	boatruntime(input2);
	
	fuel=fuelamount(input2);
	System.out.println("Fuel left in tank: " + fuel);

	int input3=0;
	while(true){
	System.out.println("Enter the amount of liters of fuel to be deposited in the tank");
	input3=obj.nextInt();
	if(fuel+input3>10000 || fuel+input3<0){
	System.out.println("Tank cannot hold more fuel (Max capacity " + fuelcapacity + ")" + "(Fuel in tank already " + fuel + ")");}
	else{
	break;}}
	refuel(input3);
	System.out.println("Fuel after refueling: " + fuel);
	
	System.out.println("Distance travelled by the boat(in kms) has been: " + distance(input2));

}

}
	