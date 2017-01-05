package hackerrank.ConstructiveAlgorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlippingTheMatrix {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while(N-->0){
			int n = Integer.parseInt(br.readLine())*2;
			int a[][] = new int[n][n];
			for(int i=0;i<n;i++){
				String temp[] = br.readLine().split(" ");
	            for(int j=0;j<n;j++)
	                a[i][j] = Integer.parseInt(temp[j]);
	        }
			long sum=0;
			for(int i=0;i<n/2;i++)
				for(int j=0;j<n/2;j++)
					sum+= Math.max(Math.max(Math.max(a[i][j], a[n-i-1][j]),a[i][n-j-1]),a[n-i-1][n-j-1]);
			System.out.println(sum);
		}
	}
}
