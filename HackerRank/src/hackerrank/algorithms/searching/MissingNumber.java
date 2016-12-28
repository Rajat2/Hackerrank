package hackerrank.algorithms.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MissingNumber {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[1000010];
		int b[] = new int[1000010];
		int N = Integer.parseInt(br.readLine());
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<N;i++)
			a[Integer.parseInt(temp[i])]++;
		int M = Integer.parseInt(br.readLine());
		String temp1[] = br.readLine().split(" ");
		for(int i=0;i<M;i++)
			b[Integer.parseInt(temp1[i])]++;
		
		for(int i=0;i<1000010;i++){
			if(a[i]!=b[i])
				System.out.print(i+" ");
		}
	}
}
