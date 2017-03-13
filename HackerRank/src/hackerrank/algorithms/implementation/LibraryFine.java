package hackerrank.algorithms.implementation;

import java.util.Scanner;

public class LibraryFine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a_d = in.nextInt(),a_m=in.nextInt(),a_y=in.nextInt();
		int e_d = in.nextInt(),e_m=in.nextInt(),e_y=in.nextInt();
		/*int month_leap[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};*/
		//different year
		if(e_y!=a_y)
			System.out.println(a_y<e_y?0:"10000");
		//same year but different month
		else if(e_m!=a_m){
			System.out.println(500*(a_m>e_m?a_m-e_m:0));
		}
		//same month
		else{
			System.out.println(15*(a_d>e_d?a_d-e_d:0));
		}
		
	}
}
