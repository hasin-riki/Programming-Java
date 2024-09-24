/**
 * @author Hasin
 */
public class javaTime{
    public static void main(String[] args){
	
	final int size = 1000;
    	int arr1[][] = new int[size][size];
    	int arr2[][] = new int[size][size];
	int sum[][] = new int[size][size];
	
	for(int r = 0; r<size; r++)
        for(int c = 0; c<size; c++){
            arr1[r][c] = 2;
            arr2[r][c] = 3;
        }
		
	long start, end;
	start = System.currentTimeMillis();

    	for(int r = 0; r<size; r++)
        for(int c = 0; c<size; c++){
            sum[r][c] = (arr1[r][c] + arr2[r][c]);
        }

    	end = System.currentTimeMillis();
    
    	System.out.printf("Row Major: %dms\n",(end - start));
	
	int arr3[][] = new int[size][size];
    	int arr4[][] = new int[size][size];
	
	for(int r = 0; r<size; r++)
        for(int c = 0; c<size; c++){
            arr3[r][c] = 2;
            arr4[r][c] = 3;
        }
	
	start = System.currentTimeMillis();

    	for(int c = 0; c<size; c++)
        for(int r = 0; r<size; r++){
            sum[r][c] = (arr3[r][c] + arr4[r][c]);
        }

    	end = System.currentTimeMillis();
    
    	System.out.printf("Col Major: %dms\n",(end - start));
	}
}
