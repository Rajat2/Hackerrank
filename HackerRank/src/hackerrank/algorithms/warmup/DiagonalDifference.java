package hackerrank.algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        long add1 = 0;
        long add2 = 0;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i==a_j)
                    add1+=a[a_i][a_j];
            }
        }
        for(int i=0,j=n-1;i<n && j<n ; i++,j--)
            add2+=a[i][j];
        System.out.println(Math.abs(add1-add2));
        in.close();
    }
}
