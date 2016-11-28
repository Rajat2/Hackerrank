package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SherlockAndValidString {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int a[] = new int[26];
		for(int i=0;i<s.length();i++){
			a[s.charAt(i)-97]++;
		}
		
		int count = 0,tempCount=0;
		for(int i=0;i<a.length && a[i]!=0;i++){
			if(tempCount ==0)	
				tempCount = a[i];
			else if(tempCount == a[i]){
				count = tempCount;
				break;
				}
		}
		System.out.println(count);
		int flag = 0; 
		for(int i=0;i<a.length;i++){
			if(a[i] != count && a[i]!=0)
				flag++;
		}
		if(flag==0 || flag==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
