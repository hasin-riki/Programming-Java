public class BankAccount{

	private String accountNumber;
	private String accountHolderName;
	private String accountType;
	private double balance;

public void setaccountNumber(String value){

	this.accountNumber=value;}

public void setaccountHolderName(String value){

	this.accountHolderName=value;}

public void setaccountType(String value){

	this.accountType=value;}

public void setbalance(double value){

	this.balance=value;}

public int getaccountNumber(){

	int a=Integer.valueOf(this.accountNumber);
	return a;}

public String getaccountHolderName(){

	return this.accountHolderName;}

public String getaccountType(){

	return this.accountType;}

public double getbalance(){

	return this.balance;}

public static void main(String[] args){

	BankAccount obj=new BankAccount();

	obj.setaccountNumber("524866");
	obj.setaccountHolderName("Hasin Zaman");
	obj.setaccountType("Savings");
	obj.setbalance(10000.0);

	System.out.println(obj.getaccountType() + " Account of Holder " + obj.getaccountHolderName() + " with the account number " + obj.getaccountNumber() + " has balance: " + obj.getbalance());
}

}