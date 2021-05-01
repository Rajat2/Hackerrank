package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class BonAppetit {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum_actual = 0;
        for(int i=0;i<n;i++){
        	int temp = in.nextInt();
        	if(i!=k)
        		sum_actual+=temp;
        }
        sum_actual/=2;
        int sum_charged=in.nextInt();
        System.out.println(sum_actual==sum_charged?"Bon Appetit":sum_charged-sum_actual);
	}
}
