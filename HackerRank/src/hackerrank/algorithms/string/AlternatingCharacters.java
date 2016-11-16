package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class AlternatingCharacters {

	public static void main(String[] args) throws Exception{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
		char a[] = br.readLine().toCharArray();
		int count=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]==a[i+1])
				count++;
		}
		System.out.println(count);
		--T;}
	}
	
}
