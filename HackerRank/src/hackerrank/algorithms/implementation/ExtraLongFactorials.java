package hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	static BigInteger fact(BigInteger n){
		if(n.compareTo(BigInteger.ZERO)==0 || n.compareTo(BigInteger.ONE)==0)
			return BigInteger.ONE;
		return n.multiply(fact(n.subtract(BigInteger.ONE)));
	}
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fact(new BigInteger(n+"")));
	}
}
