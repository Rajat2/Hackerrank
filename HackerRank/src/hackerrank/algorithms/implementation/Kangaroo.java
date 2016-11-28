package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kangaroo {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String variables[] = br.readLine().split(" ");
		int a = Integer.parseInt(variables[0]);
		int b = Integer.parseInt(variables[1]);
		int c = Integer.parseInt(variables[2]);
		int d = Integer.parseInt(variables[3]);
		int ans1 = (a-c);
		int ans2 = (d-b);
		if(b==d)
			System.out.println("NO");
		else
			System.out.println(ans1%ans2==0 && ans1/ans2>0?"YES":"NO");
		br.close();
	}
}
