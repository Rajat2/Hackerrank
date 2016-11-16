package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class PermutingTwoArray {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String temp1[] = br.readLine().split(" ");
			int N = Integer.parseInt(temp1[0]);
			int K = Integer.parseInt(temp1[1]);
			int a[] = new int[N];
			int b[] = new int[N];
			String temp[] = br.readLine().split(" ");
			String temp2[] = br.readLine().split(" ");
			for(int i=0;i<N;i++){
				a[i] = Integer.parseInt(temp[i])*-1;
				b[i] = Integer.parseInt(temp2[i]);
			}
			Arrays.sort(a);
			Arrays.sort(b);
			boolean flag=true;
			for(int i=0;i<N;i++){
				if(-a[i]+b[i]<K)
					flag=false;
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
