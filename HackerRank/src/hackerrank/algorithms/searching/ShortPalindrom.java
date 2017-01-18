package hackerrank.algorithms.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShortPalindrom {
	static int MIX(int a,int b){
		return a*26+b;
	}
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char s[] = br.readLine().toCharArray();
		int freq[] = new int[26], cfreq[] = new int[26];
		    int pairfreq[] =new int[26*26];
		    int ans = 0,mod = 1000000007;  // 2-d
		    for(char ch : s) {  // 3
		        int v = (int)(ch - 'a');  // 1 and 3-a
		        ans = (ans + cfreq[v]) % mod;  // 3-b
		 
		        for(int nc = 0; nc < 26; ++nc) {  // 3-c
		            cfreq[nc] = (cfreq[nc] + pairfreq[MIX(nc, v)]) % mod;
		        }
		 
		        for(int nc = 0; nc < 26; ++nc) {  // 3-d
		           int idx = MIX(nc, v);
		            pairfreq[idx] = (pairfreq[idx] + freq[nc]) % mod;
		        }
		 
		        freq[v]++;  // 3-e
		        /*System.out.println("\nChar is: "+ch+" int value is: "+v);
		        System.out.println("freq"+Arrays.toString(freq));
		        System.out.println("cfreq"+Arrays.toString(cfreq));*/
		    }
		  System.out.println(ans);
	}
}
