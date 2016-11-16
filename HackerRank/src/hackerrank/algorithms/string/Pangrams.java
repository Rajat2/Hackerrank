package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pangrams {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char []s = br.readLine().toLowerCase().toCharArray();
        int a[] = new int[256];
        for(int i=0;i<s.length;i++)
            a[s[i]]++;
        int flag=0;
        for(int i=97;i<=122;i++)
            if(a[i]==0)flag=1;
        
        if(flag==0)
            System.out.println("pangram");
        else
            System.out.println("not pangram");
        
    }
}
