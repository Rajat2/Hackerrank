package hackerrank.algorithms.string;


import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TheLoveLetterMystery {
	public static void main(String[] args)  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			char a[] = br.readLine().toCharArray();
			int j = a.length-1;
			int ans=0;
			for(int i=0;i<a.length/2;i++,j--){
				ans += (Math.abs(a[i]-a[j]));
			}
			System.out.println(ans);
		}
	}
}
