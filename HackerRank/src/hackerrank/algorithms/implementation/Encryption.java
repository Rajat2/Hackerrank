package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Encryption {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine().trim().replaceAll(" ","");
		int len = s.length();
		int R = (int)Math.floor(Math.sqrt(len));
		int C  = (int)Math.ceil(Math.sqrt(len));
		/*if(R*C<len)
			R= C;*/
		for (int c = 0; c < C; c++) {
	        for (int r = 0; r < R; r++) {
	            int idx =  c + r * C;
	            if (idx < len) {
	                System.out.print(s.charAt(idx));
	            }
	        }
	        System.out.print(" ");
	    }
	}
}
