package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ViralAdvertising {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long prev =(long) Math.floor(5/2); 
		long ans=prev;
		for(int i=1;i<n;i++){
			long next = (long) Math.floor((3*prev)/2);
			ans+=next;
			prev = next;
		}
		br.close();
		System.out.println(ans);
	}
}
