package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class MinMax {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K  = Integer.parseInt(br.readLine());
		int a[] = new int[N];
		for(int i=0;i<N;i++)
			a[i] = Integer.parseInt(br.readLine());
		Arrays.sort(a);
		int final_min=a[K-1]-a[0];
		for(int i=1;i<N-K;i++){
			int min = a[i+K-1]-a[i];
			if(final_min > min )
				final_min = min;
		}
		System.out.println(final_min);
	}
}
