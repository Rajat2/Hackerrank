package hackerrank.algorithms.dynamicp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Equal {
	static void fillArray(BufferedReader br,int a[],int len) throws IOException{
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<len;i++)
			a[i] = Integer.parseInt(temp[i]);
	}
	static int solve(int b[],int target){
		int count=0;
		int a[];
		a = Arrays.copyOf(b, b.length);
		for(int curr=0;curr<a.length;curr++){
			if(a[curr] - target >= 5){
	            count += (a[curr] - target)/5; // 5
	            a[curr] = target + (a[curr] - target) % 5;
			}
	        if (a[curr] - target >= 2){
	            count += (a[curr] - target)/2; // 2
	            a[curr] = target + (a[curr] - target) % 2;
	        }
	        if (a[curr] - target == 1){
	            count += 1;
	        }
		}
		return count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			fillArray(br, a,n);
			Arrays.sort(a);
			int target = a[0];
			int ans = solve(a, target);
			if(target>=2)
			ans = Math.min(ans, solve(a, target-2));
			if(target>=1)
				ans = Math.min(ans, solve(a, target-1));
			
			System.out.println(ans);
		}
	}	
}
