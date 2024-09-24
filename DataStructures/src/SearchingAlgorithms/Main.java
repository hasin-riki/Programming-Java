package SearchingAlgorithms;

import java.util.Scanner;
/**
 *
 * @author 23010
 */
public class Main{
    
    public static void main(String[] args) {
        
        SearchingAlgorithms obj=new SearchingAlgorithms();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int array[]=new int[size];
        
        System.out.println("Enter elements into array");
        for(int i=0;i<array.length;i++){
        array[i]=i+1;}
        
        Long startTime= System.nanoTime();
        System.out.println("Linear Search: " + obj.linearSearch(array,200));
        Long endTime= System.nanoTime();
        System.out.println(endTime-startTime); 
        
        Long startTime2= System.nanoTime();
        System.out.println("Binary Search: " + obj.binarySearch(array,200));
        Long endTime2= System.nanoTime();
        System.out.println(endTime2-startTime2);
        
        Long startTime3= System.nanoTime();
        System.out.println("Recursive Linear Search: " + obj.recursiveLinearSearch(array,200,array.length-1));
        System.out.println("No of steps Recursive Linear Search: " + obj.count1);
        Long endTime3= System.nanoTime();
        System.out.println(endTime3-startTime3);
        
        Long startTime4= System.nanoTime();
        System.out.println("Recursive Binary Search: " + obj.recursiveBinarySearch(array,200,0,array.length-1));
        System.out.println("No of steps Recursive Binary Search: " + obj.count2);
        Long endTime4= System.nanoTime();
        System.out.println(endTime4-startTime4);
       }
}
