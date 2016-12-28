package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TheFullCountingSort {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        int a[] = new int[N];
        int b[] = new int[100];
        int c[] = new int[N];
        Map<Integer, Queue<String>> map = new HashMap<>();
        for(int i=0;i<N;i++){
        	String []temp = br.readLine().split(" ");
        	if(i<N/2){
        		temp[1] = "-";
        	}
        	a[i] = Integer.parseInt(temp[0]);
        	b[Integer.parseInt(temp[0])]++;
        	if(map.get(a[i])==null){
        		Queue<String> queue = new LinkedList<String>();
        		queue.add(temp[1]);
        		map.put(a[i], queue);
        	}
        	else{
        		map.get(a[i]).add(temp[1]);
        	}  
        }
        for(int i=1;i<100;i++){
        	b[i] += b[i-1]; 
        }
        for(int i=0;i<N;i++){
        	c[b[a[i]]-1] = a[i];
        	--b[a[i]];
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<N;i++){
        	Queue<String> queue = map.get(c[i]);
           sb.append(queue.poll()+" ");
        }
        System.out.println(sb.toString());
	}

}
