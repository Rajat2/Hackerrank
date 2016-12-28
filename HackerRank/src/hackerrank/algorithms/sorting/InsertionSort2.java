package hackerrank.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort2 {
	 public static void insertionSortPart2(int[] a){ 
		 for(int i=1;i<a.length;i++){
			 int temp = a[i];
			 int j=i-1;
			 while(j > -1 && a[j]>temp){
				 a[j+1] = a[j];
				 j--;
			 }
			 a[j+1] = temp;
			 printArray(a);
		 }  
	   }    
	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	       int s = in.nextInt();
	       int[] ar = new int[s];
	       for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	       }
	       insertionSortPart2(ar);    
	                    
	    }    
	    private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }

}
