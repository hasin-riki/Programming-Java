public class Television{

private String manufacturer;//Company that has manufactured television

private int screen_size;//Size of television screen

private boolean powerOn;//Television power on or off

private int channel;//Current channel on television

private int volume;//Current volume of television

public Television(String brand,int screensize){

manufacturer=brand;
screen_size=screensize;
powerOn=false;
channel=2;
volume=20;

}//Constructor is being used to initialize the values

public void setchannel(int value){

	this.channel=value;}//to change current channel

public void power(boolean value){

	this.powerOn=value;}//to turn on or off television

public void increaseVolume(int value){

	this.volume=volume+value;}//to increase volume

public void decreaseVolume(int value){

	this.volume=volume-value;}//to decrease volume

public int getchannel(){

	return this.channel;}//get current channel

public int getvolume(){

	return this.volume;}//get current volume

public String getmanufacturer(){

	return this.manufacturer;}//get brand's name

public int getscreen_size(){

	return this.screen_size;}//get size of screen

public static void main(String[] args){

	Television obj=new Television("Sony", 42);

	System.out.println("Manufacturer : " + obj.getmanufacturer());
	System.out.println("Screen Size in inches : " + obj.getscreen_size());
	System.out.println("Channel : " + obj.getchannel());
	System.out.println("Volume : " + obj.getvolume());

	obj.setchannel(25);
	obj.power(true);
	obj.increaseVolume(30);
	obj.decreaseVolume(10);

	System.out.println();
	System.out.println("Channel : " + obj.getchannel());
	System.out.println("Volume : " + obj.getvolume());

}

}