package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StringConstruction {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n-->0){
			String s = br.readLine();
			Set<Character> set = new HashSet<Character>();
			for(int i=0;i<s.length();i++)
				set.add(s.charAt(i));
			System.out.println(set.size());
		}
	}
}
