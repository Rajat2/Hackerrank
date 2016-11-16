package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FunnyString {
		public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			String a = br.readLine();
			StringBuilder b = new StringBuilder(a);
			b = b.reverse();
			char []a1  = a.toCharArray();
			char []b1 = b.toString().toCharArray();
			int flag=0;
			for(int i=1;i<a1.length;i++){
				if(Math.abs(a1[i]-a1[i-1]) != Math.abs(b1[i]-b1[i-1]))
					flag=1;
			}
			if(flag==1)
				System.out.println("Not Funny");
			else
				System.out.println("Funny");
		}
		}
}
