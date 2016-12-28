package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LilysHomework {
	static int solution(int list[],int sort[]){
		int N = list.length;
		int swap_count = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<N;i++)
			map.put(list[i], i);
		for(int i=0;i<N;i++){
			if(list[i]!=sort[i]){
				swap_count++;
				int index = map.get(sort[i]);
				int temp = list[i];
				list[i] = sort[i];
				list[index] = temp;
				map.put(temp,index);
 			}
		}
		return swap_count;
	}
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int list[] = new int[N];
		int sort[] = new int[N];
		String t[] = br.readLine().split(" ");
		for(int i=0;i<N;i++){
			list[i] = Integer.parseInt(t[i]);
			sort[i] = Integer.parseInt(t[i]);
		}
		Arrays.sort(sort);
		int reverse[] = new int[N];
		int k=0;
		for(int i=N-1;i>=0;i--,k++){
			reverse[k] = list[i];
		}
		//System.out.println(Arrays.toString(reverse));
		int a = solution(list, sort);
		int b = solution(reverse, sort);
		System.out.println(Math.min(a, b));
	}
}
