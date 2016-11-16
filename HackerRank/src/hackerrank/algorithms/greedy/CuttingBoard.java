package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;


public class CuttingBoard {	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int mod = 1000000007;
		while(T-->0){
			String temp1[] = br.readLine().split(" ");
			int M = Integer.parseInt(temp1[0]);
			int N = Integer.parseInt(temp1[1]);
			Integer a[] = new Integer[M-1];
			Integer b[] = new Integer[N-1];
			String temp[] = br.readLine().split(" ");
			for(int i=0;i<M-1;i++)
				a[i] = Integer.parseInt(temp[i]);
			String temp2[] = br.readLine().split(" ");
			for(int i=0;i<N-1;i++)
				b[i] = Integer.parseInt(temp2[i]);
			Arrays.sort(a, Collections.reverseOrder());
			Arrays.sort(b, Collections.reverseOrder());
			int i = 0,j = 0,x_cut=1,y_cut=1,cost=0;
			while(j<M-1 && i<N-1){
				if(b[i]>= a[j]){
					x_cut++;
					cost+= (b[i]*y_cut);
					i++;
				}
				else{
					y_cut++;
					cost+= (a[j]*x_cut);
					j++;
				}
				cost = cost%mod;
			}
			while(i<N-1){
				cost+= b[i]*y_cut;
				cost = cost%mod;
				i++;
			}
			while(j<M-1){
				cost+= a[j]*x_cut;
				cost = cost%mod;
				j++;
			}
			System.out.println(cost);	
			
		}
	}
}
