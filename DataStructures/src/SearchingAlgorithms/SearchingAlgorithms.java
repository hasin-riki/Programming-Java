package SearchingAlgorithms;
/**
 *
 * @author Hasin
 */
public class SearchingAlgorithms{
    
    int count1=0;
    int count2=0;
    
    public int recursiveLinearSearch(int[] array, int element, int index){
        count1++;
        if(index==-1){
            return -1;
        }
        else if(array[index]==element){
            return index;
        }
        return recursiveLinearSearch(array,element,--index);
    }
    
    public int recursiveBinarySearch(int[] array, int element, int lower, int upper){
        count2++;
        int mid=(int)(lower+upper)/2;
        if(lower>upper){
            return -1;
        }
        else if(array[mid]==element){
            return mid;
        }
        else if(element>array[mid] && lower<upper){
            return recursiveBinarySearch(array, element, mid + 1, upper);}
        else if(element<array[mid] && lower<upper){
            return recursiveBinarySearch(array, element, lower, mid - 1);}
        return -1;
    }
    
    public int linearSearch(int[] array,int element){
        int count=1;
        for(int i=0;i<array.length;i++){
           if(array[i]==element){
               count+=3;
               System.out.println("No of steps Linear Search: " + count);
               return i;
           }
           count+=5;
        }
        count+=3;
        System.out.println("No of steps Linear Search: " + count);
        return -1;
    }
    
    public int binarySearch(int[] array,int element){
        int upper=array.length-1;
        int lower=0;
        int mid=(int)(upper+lower)/2;
        int count=4;
        while(lower<=upper){
            if(array[mid]==element){
                count+=3;
                System.out.println("No of steps Binary Search: " + count);
                return mid;
            }
            else if(element>array[mid]){
                count+=2;
                lower= mid + 1;
            }
            else{
                count+=2;
                upper= mid - 1;
            }
            
            count+=6;
            mid=(int)(upper+lower)/2;
        }
        count+=4;
        System.out.println("No of steps Binary Search: " + count);
        return -1;  
    }
}

