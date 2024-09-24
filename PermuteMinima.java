import java.util.Scanner;
public class PermuteMinima

{	public static void main(String[] args)

{	Scanner obj=new Scanner(System.in);

	System.out.println("Enter size of Array");
	int size=obj.nextInt();
	int[] array=new int[size];
	int[] permuted=new int[size];
	int[] random=new int[size];

	System.out.println("Enter values into Array");
	for(int i=0;i<array.length;i++){
	array[i]=obj.nextInt();}

	System.out.println("Original Array");
	for(int j=0;j<size;j++){
	System.out.print(array[j]+" ");}
	System.out.println();
	
	random[0]=(int)(Math.random()*size);
	int i=1;
	while(i<size){
	int x=i-1;
	random[i]=(int)(Math.random()*size);
	while(true){
	if(random[i]!=random[x])
	{x--;}
	else
	{break;}
	if(x<0)
	{i++;
	break;}}}
	
	for(int j=0;j<size;j++){
	permuted[j]=array[random[j]];}
	
	System.out.println("Permuted Array");
	for(int j=0;j<array.length;j++){
	System.out.print(permuted[j]+" ");}
	System.out.println();

	int max=permuted[0];
	for(int k=1;k<size;k++){
	if(permuted[k]>max)
	{max=permuted[k];}}
	int notinputvalue=max+1;
	
	int value=permuted[0];
	int count=0;
	for(int k=1;k<size;k++){
	if(permuted[k]<value)
	{value=permuted[k];}
	else
	{permuted[k]=notinputvalue;
	count++;}}

	int x=0;
	int[] minima=new int[size-count];
	for(int k=0;k<size;k++){
	if(permuted[k]==notinputvalue)
	{continue;}
	else
	{minima[x]=permuted[k];
	x++;}}

	System.out.println("Left-to-Right Minima Array");
	for(int j=0;j<minima.length;j++){
	System.out.print(minima[j]+" ");}
}

}