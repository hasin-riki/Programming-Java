package Hashing;

import java.util.Random;
/**
 *
 * @author Hasin
 */
public class HashingDemo{
 
    public static void main(String args[]){

        HashTable H=new HashTable(100);
        HashTableQuadratic H2=new HashTableQuadratic(100);
        Random R=new Random();
        for(int i=0;i<100;i++){
            int n=R.nextInt(900)+100; // generate hundred 3-digit random number
            H.insert(n);
            H2.insert(n);
        }
        System.out.println(H);
        System.out.println(H2);
        
        System.out.println("Number of Collisions Linear Probing: " + H.numOfCollisions);
        System.out.println("Number of Occupied Cells Linear Probing : " + H.numOfOccupiedCells);

        System.out.println("Search number '232' Linear Probing: " + H.search(232)); // find number you already insert , also check the not found case
        System.out.println();
        
        System.out.println("Number of Collisions Quadratic Probing: " + H2.numOfCollisions);
        System.out.println("Number of Occupied Cells Quadratic Probing: " + H2.numOfOccupiedCells);

        System.out.println("Search number '271' Quadratic Probing: " + H2.search(271)); // find number you already insert , also check the not found case
    }
    
}
