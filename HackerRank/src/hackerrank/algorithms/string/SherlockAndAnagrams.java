package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SherlockAndAnagrams {
	
	static boolean checkAnagram(String first,String second){
		if(first.length()!=second.length())
			return false;
		
		int let[] = new int[26];
		boolean result = true;
		for (int n = 0; n < first.length(); n++)
		    {
		    let[first.charAt(n)-'a']++;
		    let[second.charAt(n)-'a']--;
		}
		for (int n= 0; n <26; n++)
		    {
		    if (let[n] != 0){
		        result = false;
		        break;
		     }
		}
		return result;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String s = br.readLine();
			int k=0;
			String list[] = new String[(s.length()*(s.length()+1))/2];
			for(int i=0;i<s.length();i++){
				for(int j=1;j<=s.length()-i;j++){
					list[k++] = s.substring(i,i+j);
				}
			}
			System.out.println(Arrays.toString(list));
			int count=0;
			for(int i=0;i<k;i++){
				for(int j=i+1;j<k;j++)
					if(checkAnagram(list[i], list[j]))
						count++;
			}
			System.out.println(count);
		}
	}
}
