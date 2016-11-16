package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class FindDigits {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			String s = br.readLine();
			int N = Integer.parseInt(s);
			char a[] = s.toCharArray();
			int count=0;
			for(int i=0;i<a.length;i++){
				int temp = Character.getNumericValue(a[i]);
                if(temp!=0)
				    if(N%temp==0)
					   count++;
			}
			System.out.println(count);
			--T;
		}
	}

}