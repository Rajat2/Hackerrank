package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		char s[] = br.readLine().toCharArray();
		int k = Integer.parseInt(br.readLine())%26;
		for(int i=0;i<len;i++){
			int pos = (int) s[i];
			if(pos>=65 && pos<=90){
				pos = pos+k;
				s[i] = (char)(pos>90?pos-26 : pos);
			}
			else if(pos>=97 && pos<=122){
				pos = pos+k;
				s[i] = (char)(pos>122?pos-26 : pos);
			}
		}
		System.out.println(new String(s));
	}
}
