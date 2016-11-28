package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class CircularArrayRotation {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String variables[] = br.readLine().split(" ");
		int n = Integer.parseInt(variables[0]);
		int k = Integer.parseInt(variables[1]);
		int q = Integer.parseInt(variables[2]);
		LinkedList<Integer> list = new LinkedList<Integer>();
		String values[] = br.readLine().split(" ");
		for(int i=0;i<values.length;i++){
			list.add(Integer.parseInt(values[i]));
		}
		for(int i=0;i<k;i++){
			list.addFirst(list.removeLast());
			//System.out.println(k+" List is: "+list.toString());
		}
		while(q-->0){
			System.out.println(list.get(Integer.parseInt(br.readLine())));
		}
		br.close();
	}
}
