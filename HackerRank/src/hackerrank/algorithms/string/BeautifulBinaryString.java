package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulBinaryString {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine()),count=0;
		String s = br.readLine();
		String cheker = "010";
		for(int i=0;i<=len-3;){
			//System.out.println(s.substring(i, i+3));
			if(s.substring(i, i+3).equals(cheker)){
				count++;
				i = i+3;
			}
			else
				i++;
			//System.out.println(i);
		}
		System.out.println(count);
	}
}
