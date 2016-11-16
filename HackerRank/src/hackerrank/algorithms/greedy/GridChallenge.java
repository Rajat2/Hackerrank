package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class GridChallenge {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			char a[][] = new char[N][N];
			for(int i=0;i<N;i++){
				char temp[] = br.readLine().toCharArray();
				Arrays.sort(temp);
				for(int j=0;j<N;j++)
					a[i][j] = temp[j];
			}
			int flag=1;
			for(int i=0;i<N;i++)
				for(int j=1;j<N;j++)
					if(a[j-1][i]>a[j][i]){
						flag=1;break;}
			if(flag==1)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
