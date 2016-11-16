package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class JimAndOrder {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Integer a[][] = new Integer[T][2];
		for(int i=0;i<T;i++){
			String temp[] = br.readLine().split(" ");
			a[i][0]= i;
			a[i][1] = Integer.parseInt(temp[0])+Integer.parseInt(temp[1]);
		}
		Arrays.sort(a, new Comparator<Integer[]>()
				{
				    @Override
				    public int compare(Integer[] int1, Integer[] int2)
				    {
				        Integer numOfKeys1 = int1[1];
				        Integer numOfKeys2 = int2[1];
				        return numOfKeys1.compareTo(numOfKeys2);
				    }
				});
		for(int i=0;i<T;i++)
			System.out.println(a[i][0]+1+" ");
	}
}
