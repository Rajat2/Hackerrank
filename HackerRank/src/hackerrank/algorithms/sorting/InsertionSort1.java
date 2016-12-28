package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InsertionSort1 {
	static void printArray(int a[]){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String temp[] = br.readLine().split(" ");
		int a[] = new int[N];
		for(int i=0;i<N;i++){
			a[i]  = Integer.parseInt(temp[i]);
		}
		int V = a[a.length-1];
		for(int i=a.length-2;i>=0;i--){
			if(a[i]>V){
				a[i+1] = a[i];
				printArray(a);
			}
			else{
				a[i+1] = V;
				break;
			}
		}
		if(a[0]>V){
			a[0] = V;
		}
		printArray(a);
	}
}
