package hackerrank.algorithms.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SherlockAndArray {
	public static void main(String[] args) throws NumberFormatException, IOException  {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
	float ans=1;
	while(T>0){
		int N = Integer.parseInt(br.readLine());
		String temp[] = br.readLine().split(" ");
		int a[] = new int[N];
		int left_sum[] = new int[N];
		int right_sum[] = new int[N];
		a[0] = left_sum[0] = Integer.parseInt(temp[0]);
		for(int i=1;i<N;i++){
			a[i] = Integer.parseInt(temp[i]);
			left_sum[i] = left_sum[i-1]+Integer.parseInt(temp[i]);
		}
		right_sum[N-1] = a[N-1];
		for(int i=N-2;i>=0;i--)
			right_sum[i] = right_sum[i+1]+a[i];
		int flag=0;
		for(int i=0;i<N;i++)
			if(left_sum[i]==right_sum[i]){
				flag=1;break;}
		if(flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
		--T;
	}
}
}
