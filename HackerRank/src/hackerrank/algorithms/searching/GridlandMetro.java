package hackerrank.algorithms.searching;

import java.util.Scanner;

public class GridlandMetro {
	public static void main(String[] args) {
		   Scanner sc=new Scanner(System.in);
		   long n=sc.nextInt(),m=sc.nextInt(),c=0;
		   int k=sc.nextInt();
		    long b[][]=new long[k][];
		    boolean bo[]=new boolean[k];
		    for(int j=0;j<k;j++)
		        b[j]=new long[]{sc.nextLong(),sc.nextLong(),sc.nextLong()};
		    for(int i=0;i<k;i++)
		        {
		        long max=b[i][2],min=b[i][1];
		        if(bo[i])continue;
		        for(int j=i+1;j<k;j++)
		        if(b[i][0]==b[j][0])
		         {
		            if(b[j][1]<min)
		                if(b[j][2]>=min)
		                min=b[j][1];               //if starting and ending append to 1st.
		                else continue;				//if starting and ending comes before 1st.
		            if(b[j][2]>max)
		                if(b[j][1]<=max)			//if starting and ending append to 1st.
		            max=b[j][2];
		                else continue;				//if starting and ending comes after 1st.
		            bo[j]=true;
		        }
		        c+=max-min+1;
		    }
		    System.out.println(n*m-c);
		}
}
