package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareTheTriplets {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String A[] = br.readLine().split(" ");
		String B[] = br.readLine().split(" ");
		int countAlice=0,countBob=0;
		for(int i=0;i<A.length;i++){
			if(Integer.parseInt(A[i])>Integer.parseInt(B[i])){
				countAlice++;
			}
			else if(Integer.parseInt(A[i])<Integer.parseInt(B[i])){
				countBob++;
			}
		}
		System.out.println(countAlice+" "+countBob);
		br.close();
	}
}
