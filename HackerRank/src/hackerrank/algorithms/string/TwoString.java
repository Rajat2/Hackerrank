package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TwoString {
	public static void main(String[] args)  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			char a[] = br.readLine().toCharArray();
			char b[] = br.readLine().toCharArray();
			int a1[] = new int[256];
			int b1[] = new int[256];
			for(int i=0;i<a.length;i++)
				a1[a[i]]++;
			for(int i=0;i<b.length;i++)
				b1[b[i]]++;
			int flag=0;
			for(int i=0;i<256;i++)
				if(a1[i] == b1[i]){
					flag=1;break;}
			if(flag==1)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		
	}
}
