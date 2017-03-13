package hackerrank.algorithms.dynamicp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheMaximumSubArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T>0){
			int N = Integer.parseInt(br.readLine());
			int a[] = new int[N];
			String temp[] = br.readLine().split( " ");
			for(int i=0;i<N;i++)
				a[i] = Integer.parseInt(temp[i]);
			int max=0,max_so_far=-10000,max_non_cont=0,maximum=-10000;
			for(int i=0;i<N;i++){
				max +=a[i];
				if(max_so_far<max)
					max_so_far = max;

				if(max<0)
					max=0;
									
				if(a[i]>0)
					max_non_cont +=a[i];
                if (maximum<a[i])
                    maximum = a[i];
			
			}
			if(max_non_cont==0)
				max_non_cont = maximum;
			System.out.println(max_so_far+" "+max_non_cont);
			--T;
		}
	}

}
