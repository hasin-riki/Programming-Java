import java.util.Scanner;
public class L10AE4{
 
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[5];
    int[] tmp;
   
    int i=0;
    while(sc.hasNextInt()){
      if(i==arr.length)//whenever i that is incrementing at the end of the loop after a value is input is equal to current size of array
	{tmp=new int[2*arr.length];//size of temp array doubled
        for(int j=0;j<arr.length;j++){
          tmp[j]=arr[j];}//original array contents added to temporary array
        tmp[i]=sc.nextInt();//first value after i has become equal to original array size
        arr=tmp;}//contents of temporary array copied to original array
      else{arr[i]=sc.nextInt();}
      i++;}//i incremented when value input in orginal array
   
    for(i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
   
  }
 
}
