package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Game_Of_Thrones_1 {
	public static void main(String[] args) throws Exception{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		int []a =new int[150];
		char []input = br.readLine().toCharArray();
		for(int i=0;i<input.length;i++)
			a[input[i]]++;
		int flag1=0;
		for(int i=0;i<150;i++){
			if(a[i]!=0 && a[i]%2!=0)
				flag1++;
			
		}
		if(flag1>0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

}
