package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
	
	
public class Utpoin_Tree {
		public static void main(String[] args) throws Exception{
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			while(T>0){
				int N = Integer.parseInt(br.readLine());
				int H=1;
				if(N==0)
					H=1;
				else{
					for(int i=0;i<N;i++){
						if(i%2==0)
							H = 2*H;
						else
							H++;
					}
				}
				System.out.println(H);
				--T;
			}
		}
	}
		
