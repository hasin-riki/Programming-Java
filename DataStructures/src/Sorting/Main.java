package Sorting;
/**
 *
 * @author Hasin
 */
public class Main{
    
    public static void main(String[] args){
        
        SortingAlgorithm quickSort=new SortingAlgorithm();
    
        int[] arr=new int[10];
        int[] arr2=new int[100];

        for(int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*10)+1;
            arr2[i]=(int)(Math.random()*100)+1;
        }

        quickSort.QuickSort(arr, 0, arr.length-1);

        System.out.println("Quick Sort");
        for(int i=0;i<10;i++){
        System.out.print(arr[i] + ", ");
        }
        System.out.println();
        System.out.println();
        
        
        //HeapTree heapTree=new HeapTree();
        
        //heapTree.buildMaxHeap(arr2);
        
        //System.out.println("Max Heap");
        //heapTree.print(arr2);
        //System.out.println();
        
        //heapTree.heapSort(arr2);
    }
}
