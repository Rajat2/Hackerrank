package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperReducedString {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){
				s = s.substring(0,i-1)+s.substring(i+1);
				i=0;	
			}
		}
		if(s.length()==0)
			System.out.println("Empty String");
		else
			System.out.println(s);
		
	}
}
