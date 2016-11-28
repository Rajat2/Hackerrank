package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinMaxSum {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int max=Integer.parseInt(temp[0]);
		int min=Integer.parseInt(temp[0]);
		long sum=0;
		for(int i=0;i<temp.length;i++){
			int num = Integer.parseInt(temp[i]);
			sum+=num;
			if(num>max){
				max = num;
			}
			if(num<min){
				min = num;
			}
		}
		System.out.println((sum-max)+" "+(sum-min));
		br.close();
	}
}
