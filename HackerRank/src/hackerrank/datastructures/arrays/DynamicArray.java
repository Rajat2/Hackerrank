package hackerrank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DynamicArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int Q = Integer.parseInt(temp[1]);
		int lastAns=0;
		HashMap<Integer, List<Integer>> map = new HashMap<>();
		while(Q-->0){
			System.out.println("---------------\n"+map);
			String temp1[] = br.readLine().split(" ");
			int flag = Integer.parseInt(temp1[0]);
			int x = Integer.parseInt(temp1[1]);
			int y = Integer.parseInt(temp1[2]);
			switch(flag){
			case 1:	 
					int a = (x^lastAns)%N;
					List<Integer> list = map.get(a)==null?new ArrayList<>():map.get(a);
					list.add(y);
					map.put(a, list);
				break;
			case 2:	
				int b = (x^lastAns)%N;
				List<Integer> list1 = map.get(b)==null?new ArrayList<>():map.get(b);
				lastAns = list1.get(y%list1.size());
				System.out.println(lastAns);
				break;
			}
		}
		
	}
}
