package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class PriyankaAndToys { 
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a[] = new int[N];
		String temp1[] = br.readLine().split(" ");
		for(int i=0;i<N;i++)
			a[i] = Integer.parseInt(temp1[i]);
		Arrays.sort(a);
		int count=1,min=a[0];
		for(int i=1;i<N;i++){
			if(a[i]<min+4)
				continue;
			else{
				min = a[i];
				count++;
			}
		}
		System.out.println(count);
			
	}
}
