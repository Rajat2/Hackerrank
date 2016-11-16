package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SherlockAndSquare {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String temp1[] = br.readLine().split(" ");
			int a = Integer.parseInt(temp1[0]);
			int b = Integer.parseInt(temp1[1]);
			System.out.println((int)((Math.floor(Math.sqrt(b))) - Math.ceil(Math.sqrt(a))+1 ));
		}
	}
}
