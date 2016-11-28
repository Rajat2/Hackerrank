package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CamelCase {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int count=1;
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))){
				count++;
			}
		}
		System.out.println(count);
	}
}
