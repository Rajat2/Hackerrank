package hackerrank.crackingthecodeinterview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakingAnagrams {
	 public static void main(String[] args) throws Exception  {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			char a[] = br.readLine().toCharArray();
			char b[] = br.readLine().toCharArray();
			int a1[]=new int[26],b1[]=new int[26];
			for(int i=0;i<a.length;i++)
				a1[a[i]-97]++;
			for(int i=0;i<b.length;i++)
				b1[b[i]-97]++;
			int count=0;
			for(int i=0;i<26;i++){
				if(a1[i]!=b1[i])
					count+= a1[i]>b1[i]?a1[i]-b1[i]:b1[i]-a1[i];
			}
			System.out.println(count);
	 }
}
