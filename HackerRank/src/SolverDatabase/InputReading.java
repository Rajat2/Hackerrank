package SolverDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class InputReading {
	
	//Fill 1-D array
	static void fillArray(BufferedReader br,int a[],int len) throws IOException{
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<len;i++)
			a[i] = Integer.parseInt(temp[i]);
	}
	
	//Fill 2-D array
	static void fillArrays(BufferedReader br,int a[][],int n,int m) throws IOException{
			for(int i=0;i<n;i++){
				String temp[] = br.readLine().split(" ");
				for(int j=0;j<m;j++)
					a[i][j] = Integer.parseInt(temp[j]);
			}
		}
	
	//Print 2d array
		static void printArray(int a[][],int n,int m){
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++)
					System.out.print(" "+a[i][j]+" ");
				System.out.println();
			}
		}
		
	//Print Queue
		static void printQueue(PriorityQueue<Object> queue){
			System.out.println("\nQueue is: "+queue);
			List<Object> list = new ArrayList<>(queue);
			while(!queue.isEmpty()){
				System.out.print(" "+queue.poll()+" ");
			}
			queue.addAll(list);
		}
	
	
	public static <T> void main(String[] args) throws NumberFormatException, IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			
			//Three value intialization
			String xyz[] = br.readLine().split(" ");
			int x = Integer.parseInt(xyz[0]);
			int y = Integer.parseInt(xyz[1]);
			int z = Integer.parseInt(xyz[2]);
			
			
			//1-d Array
			int n = Integer.parseInt(br.readLine());
			int a[] = new int[n];
			fillArray(br, a,n);
			
			//2-d Array
			String pq[] = br.readLine().split(" ");
			int p = Integer.parseInt(pq[0]);
			int q = Integer.parseInt(pq[1]);
			int b[][] = new int[p][q];
			fillArrays(br, b, p, q);
			
		}*/
		
		//PriorityQueue with ascending
		PriorityQueue<Object> queue = new PriorityQueue<>();
		
		//PriorityQueue with descending
		PriorityQueue<Object> descQueue = new PriorityQueue<>(10, new Comparator<Object>() {
			@Override
			public int compare(Object arg0, Object arg1) {
				// TODO Auto-generated method stub
				return ((Integer)arg1).compareTo((Integer) arg0);
			}
		});
		
		//Testing Priority Queue
		descQueue.add(10); descQueue.add(20); descQueue.add(1); descQueue.add(15);
		queue.add(10); queue.add(20); queue.add(1); queue.add(15); 
		printQueue(queue);
		printQueue(descQueue);
	}

}
