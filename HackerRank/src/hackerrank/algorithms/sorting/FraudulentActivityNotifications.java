package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FraudulentActivityNotifications {
	
	static int findMedian(int []buffer){
		Arrays.sort(buffer);
		boolean flag = buffer.length%2==0?true :false;
		if(flag){
			return (buffer[buffer.length/2]+buffer[(buffer.length+1)/2])/2;
		}
		else{
			return buffer[buffer.length/2];
		}
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int D = Integer.parseInt(temp[1]);
		int list[] = new int[N];
		String t[] = br.readLine().split(" ");
		int buffer[] = new int[D];
		for(int i=0;i<N;i++){
			list[i] = Integer.parseInt(t[i]);
		}
		int count=0,l=0;
		for(int i=D;i<N;i++,l++){
			int k=0;
			for(int j=l;j<i;j++){
				buffer[k++] = list[j];
			}
			System.out.println("1: "+Arrays.toString(buffer));
			int ans = findMedian(buffer);
			System.out.println(ans);
			if(2*ans<=list[i]){
				count++;
			}
			System.out.println("2: "+Arrays.toString(buffer));
		}
		System.out.println(count);
	}
}
