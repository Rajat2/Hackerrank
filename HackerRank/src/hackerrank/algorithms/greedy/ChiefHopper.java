package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ChiefHopper {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a[] = new int[N];
		String temp1[] = br.readLine().split(" ");
		for(int i=0;i<N;i++)
			a[i] = Integer.parseInt(temp1[i]);
		int cost=0;
		for(int i=N;i>0;i--)
			cost = (int) Math.ceil((cost+a[i])/2);
		System.out.println(cost);
	}
}
