package hackerrank.algorithms.dynamicp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class FibonacciModified {
	static BigInteger fibo(int a,int b, int n){
		BigInteger sum=BigInteger.ZERO,x=new BigInteger(a+""),y=new BigInteger(b+"");
		if(n==1)
			return x;
		if(n==2)
			return y;
	
		for(int i=3;i<=n;i++){
				sum = y.multiply(y).add(x);
				x = y;
				y = sum;
			}
		return sum;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[1]);
		int n = Integer.parseInt(temp[2]);
		System.out.println(fibo(a, b, n));
		
	}

}
