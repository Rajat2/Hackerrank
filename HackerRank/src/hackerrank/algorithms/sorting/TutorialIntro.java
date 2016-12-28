package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TutorialIntro {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int V = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
        String []a = br.readLine().split(" ");
        for(int i=0;i<N;i++){
        	if(Integer.parseInt(a[i])==V)
        		System.out.println(i+1);
        }
	}
}
