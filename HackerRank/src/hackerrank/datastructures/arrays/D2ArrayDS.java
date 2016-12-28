package hackerrank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class D2ArrayDS {
	static int getSum(int a[][],int x,int y){
		int temp_sum=0;
		temp_sum = a[x][y]+a[x][y+1]+a[x][y+2]+a[x+1][y+1]+a[x+2][y]+a[x+2][y+1]+a[x+2][y+2];
		return temp_sum;
	}
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N=6;
		int a[][] = new int[N][N];
		for(int i=0;i<N;i++){
			String temp[] =br.readLine().split(" ");
			for(int j=0;j<N;j++)
				a[i][j] = Integer.parseInt(temp[j]);
		}
		int sum=Integer.MIN_VALUE,temp_sum=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				temp_sum = getSum(a, i, j);
				if(temp_sum>sum){
					sum = temp_sum;
				}
			}
		}
		System.out.println(sum);
	}
}
