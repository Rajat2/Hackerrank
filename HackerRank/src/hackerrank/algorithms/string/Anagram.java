package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Anagram {
	public static void main(String[] args)  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			String s = br.readLine();
			int len = s.length();
			if(len%2==0){
				int a[] = new int[26];
				int b[] = new int[26];
				char a1[] = s.substring(0, len/2).toCharArray();
				char b1[] = s.substring(len/2).toCharArray();
				for(int i=0;i<a1.length;i++){
					a[a1[i]-97]++;
					b[b1[i]-97]++;
				}
				int ans = 0;
				for(int i=0;i<26;i++){
					int diff = Math.abs(a[i]-b[i]);
					if(diff!=0)
						ans+=diff;
				}
				System.out.println(ans);
			}
			else
				System.out.println("-1");
		}
	}
}
