package hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
        	a[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int loc=0;
        int E=100;
        while(true){
        	loc = (loc+k)%n;
        	//System.out.println(loc);
        	E = E-(a[loc]==1?2:0)-1;
        	if(loc==0)
        		break;
        }
        System.out.println(E);
	}
}
