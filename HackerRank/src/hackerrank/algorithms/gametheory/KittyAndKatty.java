package hackerrank.algorithms.gametheory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KittyAndKatty {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while(N-->0){
			int x = Integer.parseInt(br.readLine());
			if(x==1 || x%2==0)
				System.out.println("Kitty");
			else
				System.out.println("Katty");
		}
	}
}
