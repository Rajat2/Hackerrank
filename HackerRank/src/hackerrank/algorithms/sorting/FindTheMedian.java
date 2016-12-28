package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindTheMedian {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a[] = new int[N];
		String t[] = br.readLine().split(" ");
		for(int i=0;i<N;i++){
			a[i] = Integer.parseInt(t[i]);
		}
		Arrays.sort(a);
		System.out.println(a[(N+1)/2]);
	}
}
