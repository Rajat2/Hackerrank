package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class AppleAndOrange {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String variables[] = br.readLine().split(" ");
		int s = Integer.parseInt(variables[0]);
		int t = Integer.parseInt(variables[1]);
		
		String variables1[] = br.readLine().split(" ");
		int a = Integer.parseInt(variables1[0]);
		int b = Integer.parseInt(variables1[1]);
		
		String variables2[] = br.readLine().split(" ");
		int m = Integer.parseInt(variables2[0]);
		int n = Integer.parseInt(variables2[1]);
		
		String apples[] = br.readLine().split(" ");
		int countApple=0;
		for(int i=0;i<apples.length;i++){
			int d = Integer.parseInt(apples[i]);
			int pos = a+d;
			if(pos>=s && pos<=t){
				countApple++;
			}
		}
		String oranges[] = br.readLine().split(" ");
		int countOrange=0;
		for(int i=0;i<oranges.length;i++){
			int d = Integer.parseInt(oranges[i]);
			int pos = b+d;
			if(pos>=s && pos<=t){
				countOrange++;
			}
		}
		System.out.println(countApple+"\n"+countOrange);
		br.close();
	}
}
