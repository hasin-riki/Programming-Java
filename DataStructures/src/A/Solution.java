package A;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        String input=sc.nextLine();
        
        String[] array=input.split(" ");
       
        
        int[] total=new int[6];
        int[] total2=new int[6];
        
        for(int i=0; i<6; i++){
            total[i]=Integer.valueOf(array[i]);
            total2[i]=Integer.valueOf(array[i]);
            if(i==1){
                total[i]=total[i]*5;
            }
            else if(i==2){
                total[i]=total[i]*10;
            }
            else if(i==3){
                total[i]=total[i]*20;
            }
            else if(i==4){
                total[i]=total[i]*50;
            }
            else if(i==5){
                total[i]=total[i]*100;
            }
        }
        
        int largest=total[0];
        for(int i=1; i<6; i++){
            if(total[i]>largest){
                largest=total[i];
            }
        }
        
        boolean[] largestFlag=new boolean[6];
        
        for(int i=0; i<6; i++){
            if(total[i]==largest){
                largestFlag[i]=true;
            }
        }
        
        int count=0;
        while(true){
            if(largestFlag[count]==true){
                break;
            }
            else{
                count++;
            }
        }
        int lightest=total2[count];
        for(int i=0; i<6; i++){
            if(largestFlag[i]==true){
                if(total2[i]<lightest){
                    lightest=total2[i];
                }
            }
        }
        
        if(lightest==total2[0]){
                System.out.println(1);
            }
            else if(lightest==total2[1]){
                System.out.println(5);
            }
            else if(lightest==total2[2]){
                System.out.println(10);
            }
            else if(lightest==total2[3]){
                System.out.println(20);
            }
            else if(lightest==total2[4]){
                System.out.println(50);
            }
            else{
                System.out.println(100);
            }
        
    
    }
}
