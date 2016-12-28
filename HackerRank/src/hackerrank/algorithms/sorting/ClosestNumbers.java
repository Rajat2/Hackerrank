package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClosestNumbers {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a[] = new int[N];
		String t[] = br.readLine().split(" ");
		for(int i=0;i<N;i++){
			a[i] = Integer.parseInt(t[i]);
		}
		Arrays.sort(a);
		int min = Math.abs(a[0]-a[1]);
		Map<Integer, ArrayList<String>> map = new HashMap<>();
		for(int i=1;i<N;i++){
			int temp = Math.abs(a[i]-a[i-1]);
			if(temp<min){
				min = temp;
			}
			if(map.get(temp)==null){
				map.put(temp, new ArrayList<>());
			}
			map.get(temp).add(""+a[i]+" "+a[i-1]+"");
		}
		ArrayList<String> list= map.get(min);
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
	}
}
