package hackerearth.january;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MicrosHouse {
	
	
	    
	    public void findMaxSubMatrix(int[][] a,int n,int m) {
	        int maxSum=0,singleMax=a[0][0];
	        int currentSum=0;
	        for(int i=0;i<m;i++){
	        	int tmp[] = new int[n];
	        	for(int j=i;j<m;j++){
	        		for(int k=0;k<n;k++){
	        			tmp[k]^=a[k][j];
	        			if(singleMax<a[k][j])
	        				singleMax = a[k][j];
	        		}
	        		
	        		if(currentSum>maxSum)
	        			maxSum = currentSum;
	        	}
	        }
	        System.out.println(maxSum);
	    }
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pq[] = br.readLine().trim().split(" ");
		int n = Integer.parseInt(pq[0].trim());
		int m = Integer.parseInt(pq[1].trim());
		int a[][] = new int[n][m];
		for(int i=0;i<n;i++){
			String temp[] = br.readLine().trim().split(" ");
			for(int j=0;j<m;j++)
				a[i][j] = Integer.parseInt(temp[j].trim());
		}
		br.close();
		new MicrosHouse().findMaxSubMatrix(a, n, m);
	}
}
