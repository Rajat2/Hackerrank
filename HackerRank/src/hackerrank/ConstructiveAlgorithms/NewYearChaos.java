package hackerrank.ConstructiveAlgorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NewYearChaos {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while(N-->0){
			int m = Integer.parseInt(br.readLine());
			String temp[] = br.readLine().split(" ");
			int[] a=new int[m];
			for(int i=0;i<m;i++)
				a[i] = Integer.parseInt(temp[i]);
			
			int cnt=0;
			boolean flag=false;
			for(int i=m-1;i>-1;i--){
				if(a[i]-(i+1)>2){
					System.out.println("Too chaotic");
					flag=true;
					break;
				}
				for(int j=Math.max(0, a[i]-2);j<i;j++){
					if(a[j]>a[i])
						cnt++;
				}
			}
			if(!flag)
				System.out.println(cnt);
		}
	}

}
