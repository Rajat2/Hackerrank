package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSort1 {
	 public static void main(String[] args) throws Exception{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
	        String []a = br.readLine().split(" ");
	        int b[] = new int[100];
	        for(int i=0;i<N;i++)
	            b[Integer.parseInt(a[i])]++;
	        for(int i=0;i<=99;i++)
	            System.out.print(b[i]+" ");
	    }

}
