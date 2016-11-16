package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 public class AngryProfessor {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		while(T>0){
            String temp[] = br.readLine().split(" ");
			int n = Integer.parseInt(temp[0]);
			int k = Integer.parseInt(temp[1]);
			int count=0;
			int a[] = new int[n];
			String s[] = br.readLine().split(" ");
			for(int i=0;i<n;i++){
				a[i] = Integer.parseInt(s[i]);
				if(a[i]<=0)
					count++;
			}
			if(count<k)
				System.out.println("YES");
			else
				System.out.println("NO");
			--T;
		}
	}

}

