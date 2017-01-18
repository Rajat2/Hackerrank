package WeekOfCode_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TheGreatXOR {
	static long findCount(long num,long a[]){
		for(int i=0;i<a.length;i++){
			if(a[i]>num){
				return a[i]-num-1;
			}
			else if(a[i]==num){
				return num-1;
			}
		}
		return 0;
	}
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		final int MAX_NUMBER = 34;
		long a[] = new long[35];
		for(int i=0;i<=MAX_NUMBER;i++){
			a[i] = (long)Math.pow(2, i);
		}
		System.out.println(Arrays.toString(a));
		int N = Integer.parseInt(br.readLine());
		while(N-->0){
			long n = Long.parseLong(br.readLine());
			System.out.println(findCount(n, a));
		}
	}
}
