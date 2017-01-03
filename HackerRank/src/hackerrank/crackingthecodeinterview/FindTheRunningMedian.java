package hackerrank.crackingthecodeinterview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

/* Maintain 2 queue.
 * Higher for maintain all higher element in ascending order
 * Lower for maintain all lower element in descending order
 * 
 * print lower peek if odd lenght
 * else print median of peak of both queue.
 */

public class FindTheRunningMedian {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			int a[] = new int[N];
			for(int i=0;i<N;i++)
				a[i] = Integer.parseInt(br.readLine());
			PriorityQueue<Integer> lower=new PriorityQueue<Integer>(1000, new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2-o1;
				}
			});
			PriorityQueue<Integer> higher = new PriorityQueue<Integer>();
			float median;
			for(int c:a){
				if(lower.isEmpty())
					lower.add(c);
				else{
					if(lower.size()>higher.size()){
						if(lower.peek()>c){
							higher.add(lower.poll());
							lower.add(c);
						}
						else{
							higher.add(c);
						}
					}
					else{
						Integer p = higher.peek();
	                    if( p != null && p >= c ) {
	                        lower.add(c);
	                    } else {
	                        // Remove one from higher
	                        lower.offer(higher.poll());
	                        higher.add(c);    
	                    }
					}
				}
				int s = lower.size() + higher.size();
	            if( s % 2 == 0) {
	                median = (lower.peek() + higher.peek()) / 2.0f;
	            } else {
	                median = (float) lower.peek();
	            }
	            System.out.println(median);
			}
		}
}
