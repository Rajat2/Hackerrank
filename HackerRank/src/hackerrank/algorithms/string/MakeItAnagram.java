package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MakeItAnagram {
	public static void main(String[] args) throws Exception{
	BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
	char a[] = br.readLine().toCharArray();
	char b[]  = br.readLine().toCharArray();
	int total[] = new int[26];
    int total1[] = new int[26];
	for(int i=0;i<a.length;i++)
		total[a[i]-97]++;
	for(int i=0;i<b.length;i++)
		total1[b[i]-97]++;
	int count=0;
	
	for(int i=0;i<26;i++)
		count+=Math.abs(total[i]-total1[i]);
	System.out.println(count);
	}
}
