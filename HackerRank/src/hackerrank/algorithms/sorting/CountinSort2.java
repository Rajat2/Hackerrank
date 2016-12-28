package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountinSort2 {
		public static void main(String[] args) throws Exception{
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int N = Integer.parseInt(br.readLine());
		        String []temp = br.readLine().split(" ");
		        int a[] = new int[N];
		        int b[] = new int[100];
		        int c[] = new int[N];
		        for(int i=0;i<N;i++){
		        	a[i] = Integer.parseInt(temp[i]);
		            b[Integer.parseInt(temp[i])]++;
		        }
		        for(int i=1;i<100;i++){
		        	b[i] += b[i-1]; 
		        }
		        for(int i=0;i<N;i++){
		        	c[b[a[i]]-1] = a[i];
		        	--b[a[i]];
		        }
		        for(int i=0;i<N;i++)
		            System.out.print(c[i]+" ");
		}

}
