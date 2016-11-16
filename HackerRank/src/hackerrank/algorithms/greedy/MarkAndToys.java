package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class MarkAndToys {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);
		int a[] = new int[N];
		String temp1[] = br.readLine().split(" ");
		for(int i=0;i<N;i++)
			a[i] = Integer.parseInt(temp1[i]);
		Arrays.sort(a);
		int count=0;
		for(int i=0;i<N && K>-1;i++){
			if(a[i]>K)
				break;
			else{
				count++;
				K = K-a[i];
			}
		}
		System.out.println(count);
	}
}
