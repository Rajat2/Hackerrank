package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarsExploration {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String checker = "SOS";
		int len1 = s.length(),len2 = checker.length(),count =0;
		
		for(int i=0;i<=len1-len2; i=i+len2){
			String subs = s.substring(i,i+len2); 
			//System.out.println(subs);
			if(! subs.equals(checker)){
				for(int j=0;j<checker.length();j++){
					if(s.charAt(i+j)!=checker.charAt(j))
						count++;
				}
			}
		}
		System.out.println(count);
	}
}
