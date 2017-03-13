package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class SaveThePrisoner {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while(T-->0){
        	int n = in.nextInt();
            int m = in.nextInt();
            int id = in.nextInt();
            int x = (m+id-1)%n;
            System.out.println(x==0?n:x);
        }
	}
}
