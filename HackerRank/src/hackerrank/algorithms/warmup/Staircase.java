package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Staircase {

	public static void main(String[] args) throws Exception{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
        	for(int j=0;j<n-i;j++)
        		System.out.print(" ");
        	
        	for(int k=n-i;k<n;k++)
        		System.out.print("#");
        	
        	System.out.println();
        }
    }
}

