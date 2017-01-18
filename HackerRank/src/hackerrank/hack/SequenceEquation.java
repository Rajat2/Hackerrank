package hackerrank.hack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class SequenceEquation {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String t[] = br.readLine().split(" " );
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<N;i++){
			map.put(Integer.parseInt(t[i]),i+1);
		}
		for(int i=0;i<N;i++){
			System.out.println(map.get(map.get(i+1)));
		}
	}
}
