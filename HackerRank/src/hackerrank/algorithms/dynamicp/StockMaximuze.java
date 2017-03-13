package hackerrank.algorithms.dynamicp;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class StockMaximuze {
	public static void main(String[] args)  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			int N = Integer.parseInt(br.readLine());
			int a[] = new int[N];
			String temp[] = br.readLine().split(" ");
			for(int i=0;i<N;i++)
				a[i] = Integer.parseInt(temp[i]);
			long max_till_now = 0;
			long profit = 0;
			for(int i=N-1;i>=0 ;i--){
				max_till_now = Math.max(max_till_now, a[i]);
				profit +=(long)(max_till_now-a[i]);
			}
			System.out.println(profit);
		}
	}
}
