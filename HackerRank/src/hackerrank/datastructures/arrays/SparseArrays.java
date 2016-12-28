package hackerrank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SparseArrays {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Map<String, Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<N;i++){
			String temp = br.readLine();
			map.put(temp,map.get(temp)==null?1:map.get(temp)+1);
		}	
		int Q = Integer.parseInt(br.readLine());
		while(Q-->0){
			String temp = br.readLine();
			System.out.println(map.get(temp)==null?0:map.get(temp));
		}
	}
}
