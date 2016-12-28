package hackerrank.algorithms.searching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class HackerlandRadioTransmitters {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String ND[] = br.readLine().split(" ");
		int N = Integer.parseInt(ND[0]);
		int K = Integer.parseInt(ND[1]);
		String temp[] = br.readLine().split(" ");
		TreeSet<Integer> set = new TreeSet<Integer>();
	    for(int i=0; i < N; i++){
	        set.add(Integer.parseInt(temp[i]));
	    }
	    int location;
	    int transmitters = 0;
	    while(!set.isEmpty()){
	        int index = set.pollFirst(); 
	        location = index;
	        transmitters++;
	        while(!set.isEmpty() && set.first() <= index + K){
	            location = set.first();
	            set.pollFirst();
	        }
	        while(!set.isEmpty() && set.first()-location <= K)
	            set.pollFirst();                
	    }
	    System.out.println(transmitters);
	}
}
