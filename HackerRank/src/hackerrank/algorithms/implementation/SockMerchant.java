package hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class SockMerchant {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[101];
        for(int i=0;i<n;i++){
        	int temp = in.nextInt();
        	a[temp]++;
        }
        //System.out.println(Arrays.toString(a));
        int count=0;
        for(int i=1;i<=100;i++){
        	if(a[i]!=0)
        		count=count+(int)(a[i]/2);
        }
        System.out.println(count);
	}
}
