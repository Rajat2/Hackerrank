package hackerrank.algorithms.warmup;

import java.util.*;
import java.math.*;

public class AVeryBigSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        BigInteger result = BigInteger.ZERO;
        for(int i=0;i<n;i++){
            BigInteger b = new BigInteger(arr[i]+"");
            result = result.add(b);
        }
        System.out.println(result);
        in.close();
    }
}