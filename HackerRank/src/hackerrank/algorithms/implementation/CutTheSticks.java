package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CutTheSticks {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());	
		String nums[] = br.readLine().split(" ");
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		for(int i=0;i<n;i++){
			queue.add(Integer.parseInt(nums[i]));
		}
		while(!queue.isEmpty()){
			//System.out.println(queue.toString());
			System.out.println(queue.size());
			int min = queue.poll();
			//System.out.println(min);
			while(!queue.isEmpty() && queue.peek()==min){
				int t = queue.poll();
				//System.out.println("out: "+t);
			}
			PriorityQueue<Integer> tempQueue = new PriorityQueue<Integer>();
			while(!queue.isEmpty()){
				tempQueue.add(queue.poll()-min);
				//System.out.println("Temp queue is: "+tempQueue);
			}
			queue = tempQueue;
		}
	}
}
