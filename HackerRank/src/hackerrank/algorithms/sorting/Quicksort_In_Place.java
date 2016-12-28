package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quicksort_In_Place {
	static int partition(int []array,int low,int high)
	{
	    int pos = low;
	    for(int i=low;i<high;i++)
	        if(array[i]<array[high])
	        {
	            int temp = array[pos];
	            array[pos] = array[i];
	            array[i] = temp;
	            pos++;
	        }
	    int temp = array[pos];
	    array[pos] = array[high];
	    array[high] = temp;
	    return pos;
	}
	static void quick(int []array,int low,int high,int n)
	{
	    if(low<high)
	    {
	        int p = partition(array,low,high);
	        for(int i=0;i<n;i++)
	            System.out.print(array[i]+" ");
	        System.out.println();
	        quick(array,low,p-1,n);
	        quick(array,p+1,high,n);
	    }
	} 
	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			String temp[] = br.readLine().split(" ");
			int a[] = new int[N];
			for(int i=0;i<N;i++){
				a[i]  = Integer.parseInt(temp[i]);
			}
			quick(a,0,a.length-1,a.length);                
   } 
}
