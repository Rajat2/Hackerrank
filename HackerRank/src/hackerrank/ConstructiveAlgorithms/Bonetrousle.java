package hackerrank.ConstructiveAlgorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bonetrousle {

	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String temp[] = br.readLine().split(" ");
			long n = Long.parseUnsignedLong(temp[0]);//Total stick
			long k = Long.parseUnsignedLong(temp[1]);//box for sale
			long b = Long.parseUnsignedLong(temp[2]);//box to buy
			long min=Long.parseUnsignedLong("0"),max=Long.parseUnsignedLong("0");
			for(long i=1;i<=b;i++){
		        min+=i;
		        max+=k-i+1;
			}
			if(n<min || n>max)
	        {
	            System.out.println(-1);
	            continue;
	        }
			
			long r=(n-min)%b;
	        long q=(n-min)/b; 
	        StringBuilder sb = new StringBuilder();
	        if(r==0){
	        	sb.append(1+q+" ");
	        	for(long i=2;i<=(b-r);i++)
	        		sb.append(i+q+" ");
	        }
	        else{
	        	long i=1;
	        	for(i=1; i<=(b-r); i++)
	            {
	        		sb.append(i+q+" ");
	            }
	        	sb.append(i+q+1+" ");
	            i++;
	            for(; i<=b; i++)
	            {
	                sb.append(i+q+1+" ");
	            }
	        }
	        System.out.println(sb.toString().trim());
		}
	}

}
