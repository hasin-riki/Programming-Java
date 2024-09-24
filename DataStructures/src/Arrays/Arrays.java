package Arrays;

//@author hasin

import java.util.Scanner;

public class Arrays {

    public static int findIndex(int array[], int value){
       int index=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                index=i;
            }
    }
        return index;
    }
    
    public static void clear(int array[]){
        for(int i=0;i<array.length;i++){
            array[i]=0;
        }
    }
    
    public static void updateValue(int array[], int value, int index){
        
        if(array==null || index<0 || index>=array.length){
            System.out.println("Error");}
        else{
            array[index]=value;
        }
    }
    
    public static int[] removeValue(int array[], int value){
        int x=findIndex(array,value);
        System.out.println("Index: "+ x);
        if(array==null || x<0 || x>=array.length){
            System.out.println("Error");
            return array;
        }

        int array2[]=new int[array.length-1];
        
        
        for(int i=0;i<x;i++){
            array2[i]=array[i];
        }
        for(int i=array.length-1;i>x;i--){
            
            array2[i-1]=array[i];
           
        }
            
        return array2;
    }
    
    public static void display(int array[]){
        System.out.println("Updated Array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
        
    public static void main(String[] args){
    
        Scanner obj=new Scanner(System.in);
        
        System.out.println("Enter Size of Array");
        int size=obj.nextInt();
        System.out.println("Empty Array");
        int array[]=new int[size];
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        
        System.out.println("Enter values into Array");
        for(int i=0;i<array.length;i++){
            array[i]=obj.nextInt();
        }
        
        System.out.println("Array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        
        System.out.println("Enter value to find");
        int value=obj.nextInt();
        int x=findIndex(array,value);
        System.out.println("Index of value: " + x);
        
        System.out.println("Enter value to update");
        int value2=obj.nextInt();
        System.out.println("Enter index to be updated");
        int value3=obj.nextInt();
        updateValue(array,value2,value3);
        
        display(array);
        
        System.out.println("Enter value to be removed");
        int value4=obj.nextInt();
        int array2[]=removeValue(array,value4);
        
        display(array2);
        
        clear(array2);
        
        display(array2);
    }

}
