package hackerrank.algorithms.dynamicp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TheCoinChangeProblem {
	static void fillArray(BufferedReader br,int a[],int len) throws IOException{
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<len;i++)
			a[i] = Integer.parseInt(temp[i]);
	}
	
	static int countRecursion( int S[], int m, int n )
	{
		System.out.println("m is: "+m+"\tn is: "+n);
	    // If n is 0 then there is 1 solution (do not include any coin)
	    if (n == 0)
	        return 1;
	     
	    // If n is less than 0 then no solution exists
	    if (n < 0)
	        return 0;
	 
	    // If there are no coins and n is greater than 0, then no solution exist
	    if (m <=0 && n >= 1)
	        return 0;
	 
	    // count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
	    return countRecursion( S, m - 1, n ) + countRecursion( S, m, n-S[m-1] );
	}
	
	static long count1( int S[], int m, int n )
	{
	    // table[i] will be storing the number of solutions for
	    // value i. We need n+1 rows as the table is consturcted
	    // in bottom up manner using the base case (n = 0)
	    long table[] = new long[n+1];
	 
	    // Initialize all table values as 0
	    //memset(table, 0, sizeof(table));
	    // Base case (If given value is 0)
	    table[0] = 1;
	 
	    // Pick all coins one by one and update the table[] values
	    // after the index greater than or equal to the value of the
	    // picked coin
	    for(int i=0; i<m; i++){
	        for(int j=S[i]; j<=n; j++){
	        	System.out.println("\ni is: "+i+"\ttaking coin as: "+S[i]+"\tj is: "+j+"\ttaking coin as: "+table[j]);
	            table[j] += table[j-S[i]];
	            System.out.println("j value is: "+table[j]);
	            System.out.println(Arrays.toString(table));
	        }
	    }
	 
	    return table[n];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pq[] = br.readLine().split(" ");
		int n = Integer.parseInt(pq[0]);
		int m = Integer.parseInt(pq[1]);
		int a[] = new int[m];
		fillArray(br, a,m);
		System.out.println(count1(a, m, n));
	}

}
