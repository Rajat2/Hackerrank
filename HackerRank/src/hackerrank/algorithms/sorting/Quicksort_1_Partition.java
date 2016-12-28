package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quicksort_1_Partition {
	 public static void quickSortPart(int[] a){
		 int n = a.length;
		 int left[] = new int[n];
		 int right[] = new int[n];
		 int equal[] ={a[0]};
		 int k=0,j=0;
		 for(int i=1;i<a.length;i++){
			if(a[i]<=equal[0]){
				left[j++] = a[i];
			}
			else{
				right[k++] = a[i];
			}
		 }
		 printArray(left,j);
		 printArray(equal,1);
		 printArray(right,k);
	 }
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			String temp[] = br.readLine().split(" ");
			int a[] = new int[N];
			for(int i=0;i<N;i++){
				a[i]  = Integer.parseInt(temp[i]);
			}
			quickSortPart(a);                
    }    
	 private static void printArray(int[] ar ,int length ) {
	      for(int i=0;i<length;i++)
	    		  System.out.print(ar[i]+" ");
	   }
}
