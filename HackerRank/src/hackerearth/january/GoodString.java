package hackerearth.january;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GoodString {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char str[] = br.readLine().toCharArray();
		int ans[] = new int[26];
		for(int i=0;i<str.length;i++)
			ans[str[i]-'a']++;
		int count=0;
		//System.out.println(Arrays.toString(ans));
		for(int i=0;i<ans.length;i++){
			if(ans[i]>1)
				count+= (ans[i]-1);
		}
		System.out.println(count);
	}

}
