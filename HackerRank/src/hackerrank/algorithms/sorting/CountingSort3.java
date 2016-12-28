package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountingSort3 {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int b[] = new int[100];
        for(int i=0;i<N;i++){
        	String []temp = br.readLine().split(" ");
        	int t = Integer.parseInt(temp[0]);
            b[t]++;
        }
        for(int i=1;i<100;i++){
        	b[i] += b[i-1]; 
        }
        for(int i=0;i<100;i++)
            System.out.print(b[i]+" ");
	}

}
