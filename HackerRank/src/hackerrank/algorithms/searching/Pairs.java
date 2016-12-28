package hackerrank.algorithms.searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pairs {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String ND[] = br.readLine().split(" ");
		int N = Integer.parseInt(ND[0]);
		long K = Long.parseLong(ND[1]);
		String temp[] = br.readLine().split(" ");
		Set<Long> set = new HashSet<Long>();
		for(int i=0;i<N;i++){
			set.add(Long.parseLong(temp[i]));
		}
		int count=0;
		Iterator<Long> itr = set.iterator();
		while(itr.hasNext()){
			if(set.contains(itr.next()+K))
				count++;
		}
		System.out.println(count);
	}
}
