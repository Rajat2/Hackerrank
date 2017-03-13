package hackerrank.algorithms.dynamicp;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Candies {

	public static void main(String[] args)  throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a[] = new int[N];
		int b[] = new int[N];
		int total_candy=0;
		b[0] = 1;
		for(int i=0;i<N;i++)
			a[i]=Integer.parseInt(br.readLine());
		for(int i=1;i<N;i++){
			if(a[i-1]<a[i])
				b[i] = b[i-1]+1;
			else
				b[i] = 1;
		}
		for(int i=N-1;i>0;i--){
			if(a[i-1]>a[i])
				b[i-1] = Math.max(b[i]+1,b[i-1]);
            
        }
		for(int i=0;i<N;i++){
			total_candy+=b[i];
			}
		System.out.println(total_candy);
	}
}
