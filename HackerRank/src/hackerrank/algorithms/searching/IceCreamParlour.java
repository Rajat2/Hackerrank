package hackerrank.algorithms.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class IceCreamParlour {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			int M = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			int a[] = new int[N];
			String temp[] = br.readLine().split(" ");
			for(int i=0;i<temp.length;i++)
				a[i] = Integer.parseInt(temp[i]);
			int x1=-1,y1=-1;
			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					if(a[j]+a[i]==M){
						if(i<j){
						x1 = i+1;
						y1 = j+1;}
						else{
							x1 =j+1;
							y1= i+1;
						}
						break;
					}
				}
			}
				System.out.println(x1+" "+y1);
			--T;
		}
		
	}

}
