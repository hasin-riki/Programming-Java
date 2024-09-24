package Recursion;

import java.util.Scanner;

/**
 *
 * @author 23010
 */
public class RecursiveOperations{
    //Number of calls for Q-3
    int calls;
    
    //Q-3 part 1
    //Time Complexity= O(n)
    //Space Complexity= O(n)
    public int FindMax(int[] arr, int ind){
        if(ind==0){
            return arr[0];
        }
        return Math.max(arr[ind-1], FindMax(arr,ind-1));
    }
    
    //Q-3 part 2
    //Time Complexity= O(n)
    //Space Complexity= O(n)
    public int power(int b, int p){
	if(p==0){
            return 1;
        }
	return b*power(b, p-1);
    }
    
    //Q-3 part 3
    //Time Complexity= O(n)
    //Space Complexity= O(2^n)
    public void tower(int n, char s, char des, char t){
        calls++;
	if(n==1){
            System.out.println(s +" to "+ des);
        }
	else{
		tower(n-1, s, t, des);
		System.out.println(s +" to "+ des);
		tower(n-1, t, des, s);
	}
    }
    //Q-3 a) Recursive calls = 7
    //Q-3 b) Recursive calls = 1048575
    //Q-3 c) Frames = 4
    
    public static void main(String [] args){
		
        RecursiveOperations obj=new RecursiveOperations();
        int[] array = {6,2,9,11};
                
	System.out.println("Max Value in Array: " + obj.FindMax(array, array.length));
        
        int value= 3;
        int power= 4;
        
        System.out.println(value + "^" + power + "= " + obj.power(value,power));
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of disks for Tower of Hanoi");
        int disks= sc.nextInt();
        System.out.println("Tower of Hanoi for " + disks + " disks/n");
	obj.tower(disks,'S','D','T');
        
        System.out.println("Recursive calls Tower of Hanoi: " + obj.calls); 
		
	}
    
}
