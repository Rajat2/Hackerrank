package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Gemstones {
	public static void main(String[] args) throws Exception{
	BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
	int N=T;
	int a[] = new int[26];
	while(T>0){
		char []t = br.readLine().toCharArray();
		boolean temp[] = new boolean[26];
		for(int i=0;i<t.length;i++)
			if(temp[t[i]-97]==false){
				temp[t[i]-97]=true;
				a[t[i]-97]++;
			}
		--T;
		}
	int count=0;
	for(int i=0;i<a.length;i++)
		if(a[i]%N==0)
			count++;
	System.out.println(count);
  	}
}
