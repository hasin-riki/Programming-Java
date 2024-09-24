package Sorting;
/**
 *
 * @author Hasin
 */
public class HeapTree{
    
    public void heapSort(int[] arr){
        delete(arr);
        System.out.println("List after Heap Sort");
        print(arr);
    }
    
    public void buildMaxHeap(int[] arr){
        int c=1;
        int p=0;
        
        while(c<arr.length){
            int c2=c;
            int p2=p;
            while(arr[c2]>arr[p2]){
                    int temp=arr[p2];
                    arr[p2]=arr[c2];
                    arr[c2]=temp;
                    c2=p2;
                    p2=parent(p2);
            }
            c++;
            p=parent(c);
        }
    }

    public void ReHeap(int[] arr, int count){
        int p=0;
        
        while(leftChild(p)<(arr.length-count) && rightChild(p)<(arr.length-count)){
            int max;
            
            if(arr[leftChild(p)]>arr[rightChild(p)]){
                max=leftChild(p);
            }
            else{
                max=rightChild(p);
            }
            
            if(arr[p]>=arr[max]){
                break;
            }
            
            int temp=arr[p];
            arr[p]=arr[max];
            arr[max]=temp;
            
            p=max;
        }
    }

    public void delete(int[] arr){

        int index;
        if(arr[arr.length-1]!=0){
            index=arr.length-1;
        }
        else{
            int i=0;
            while(arr[i]!=0){
                i++;
            }
            index=i-1;
        }
        
        int temp;
        for(int i=1; i<=arr.length; i++){
            temp=arr[0];
            arr[0]=arr[index];
            arr[index]=temp;
            ReHeap(arr, i);
            index--;
        }
    }
    
    public int leftChild(int parent){
        return (parent*2)+1;
    }
    
    public int rightChild(int parent){
        return (parent*2)+2;
    }
    
    public int parent(int child){
        return (int)(child-1)/2;
    }
    
    public void print(int[] arr){
        for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
