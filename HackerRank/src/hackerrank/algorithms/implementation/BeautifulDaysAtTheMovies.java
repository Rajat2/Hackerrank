package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulDaysAtTheMovies {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String variables[] = br.readLine().split(" ");
		int i = Integer.parseInt(variables[0]);
		int j = Integer.parseInt(variables[1]);
		int k = Integer.parseInt(variables[2]);
		int countDay=0;
		for(int x=i;x<=j;x++){
			if(Math.abs(x-Integer.parseInt(new StringBuilder(x+"").reverse().toString()))%k==0){
				countDay++;
			}
		}
		System.out.println(countDay);
		br.close();
	}
}
