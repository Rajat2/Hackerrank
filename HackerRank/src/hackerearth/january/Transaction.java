package hackerearth.january;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Transaction {
	static void fillArray(BufferedReader br,int a[],int len) throws IOException{
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<len;i++)
			a[i] = Integer.parseInt(temp[i]);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String xyz[] = br.readLine().split(" ");
		int T = Integer.parseInt(xyz[0]);
		int Q = Integer.parseInt(xyz[1]);
		int a[] = new int[T];
		fillArray(br, a, T);
		while(Q-->0){
			//2-d Array
			String pq[] = br.readLine().split(" ");
			int p = Integer.parseInt(pq[0]);
			int q = Integer.parseInt(pq[1]);
			int count=0,j=-1;
			for(int i=0;i<T;i++){
				if(a[i]>=p){
					count++;
					j=i;
				}
				if(count==q)
					break;
			}
			System.out.println(count==q?a[j]:-1);
		}
	}
}
