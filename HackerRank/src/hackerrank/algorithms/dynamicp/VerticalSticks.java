package hackerrank.algorithms.dynamicp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class VerticalSticks {
	static void fillArray(BufferedReader br,int a[],int len) throws IOException{
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<len;i++)
			a[i] = Integer.parseInt(temp[i]);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			int ans[] = new int[n];
			fillArray(br, a,n);
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(a[j]>=a[i])
						ans[i]++;
				}
			}
			float final_ans = 0;
			for(int i=0;i<n;i++){
				final_ans+=(float)((float)(n+1)/(float)(ans[i]+1));
			}
			//System.out.println(Arrays.toString(ans));
			System.out.printf("%.2f",final_ans);
			System.out.println();
		}
	}
}
