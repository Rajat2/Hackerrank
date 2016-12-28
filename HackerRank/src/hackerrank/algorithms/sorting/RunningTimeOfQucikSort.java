package hackerrank.algorithms.sorting;



import java.util.Scanner;

public class RunningTimeOfQucikSort {
	
   static int swapCount = 0;
    static void quick(int a[], int I, int J){
    if (J - I < 2)
        return;
    int p = a[J - 1];
    int i = I, temp;
    for (int j = I; j < J; j++){
        if (a[j] <= p){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            swapCount++;
            i++;
        }
    }
    quick(a, I, i - 1);
    quick(a, i, J);
}
    public static int insertionSortPart2(int[] a){ 
        int count=0;
		 for(int i=1;i<a.length;i++){
			 int temp = a[i];
			 int j=i-1;
			 while(j > -1 && a[j]>temp){
				 a[j+1] = a[j];
				 j--;
                count++;
			 }
			 a[j+1] = temp;
		 } 
        
        return count;
	   }    
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       int[] ar1 = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
           ar1[i]=ar[i]; 
       }
       quick(ar, 0, ar.length);
       System.out.println(insertionSortPart2(ar1)-swapCount);    
                    
    }   
}
