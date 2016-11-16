package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class GreedyFlorist {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int K  = Integer.parseInt(temp[1]);
		String temp1[] = br.readLine().split(" ");
		Integer a[] = new Integer[N];
		for(int i=0;i<N;i++)
			a[i] = Integer.parseInt(temp1[i]);
		Arrays.sort(a, Collections.reverseOrder());
		int cost=0,sum=0,mul=1;
		for(int i=0;i<N; i = i+K){
			sum=0;
			int count=0;
			for(int j=i; count<K && j<N;j++,count++)
				sum+=a[j];
			
			cost+= sum*(mul);
			mul++;
		}
		System.out.println(cost);
	}
}
