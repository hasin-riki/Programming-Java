public class BoyGirl{
  public static void main(String[] args){

    int counter=0;
    int sum=0;
    while(counter<1000){ //The purpose of this loop is to dertermine average family size. 
    int boy=0;  //The counter for boys is inside this loop because after each inner loop you have to reset the counter 
    int girl=0;
    while(true){
      if(Math.random()<0.5)boy++; //counter for boys would be incremented if the value of Math.random is less than 0.5
      else girl++;//else if the value of Math.random()  is greater than 0.5 grils counter would be incremented 
      if((boy>=2&&girl>=1)||(boy>=1&&girl>=3))break;//If the first or the second condition is met this statement would break the loop.
         }
   System.out.println("Boys = "+boy+" and Girls = "+girl);// This prints the number of boys and girls after each time after at least one of the two conditions are met.

    counter++; // This is the outer loop counter.
  sum=sum+boy+girl;// This statement  adds the number of boys and grils to its previous value of "sum" variable so that we can find the average. 
    }
    System.out.println("Average Family size is = "+sum/1000.);
}
}