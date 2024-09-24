package Sorting;
/**
 *
 * @author Hasin
 */
public class SortingAlgorithm{
    
    public void QuickSort(int[] arr, int L, int U){
        System.out.println("QuickSort");
        print(arr);
        int m=Partition(arr, L, U);
        
        if(m-1>L){
            QuickSort(arr, L, m-1);
        }
        if(m+1<U){
            QuickSort(arr, m+1, U);
        }
    }
    
    public int Partition(int[] arr, int L, int U){
        int Low=L;
        int pivot=arr[L];
        System.out.println("Partition");
        print(arr);
        while(L<U){
            while(L<=U && arr[L]<=pivot){
                L++;
            }
            while(L<=U && arr[U]>pivot){
                U--;
            }
            if(L<U){
                swap(arr, L, U);
            }
        }
        arr[Low]=arr[U];
        arr[U]=pivot;
        return U;
    }
    
    public void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public void print(int[] arr){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
