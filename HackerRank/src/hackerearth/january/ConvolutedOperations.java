package hackerearth.january;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class ConvolutedOperations {
	
	static int getCout(List<Integer> list,int X){
		int count=0;

		for(int a:list){
			if(a<X)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> array[] = new ArrayList[T];
		for(int i=0;i<T;i++){
			String temp[] = br.readLine().split(" ");
			int first = Integer.parseInt(temp[0]);
			if(first==1){
				int s = Integer.parseInt(temp[1]);
				stack.push(s);
			}
			else if(first==2){
				//find at X less then Y
				int K = Integer.parseInt(temp[1]);
				int X = Integer.parseInt(temp[2]);
				List<Integer> list = new ArrayList<>(array[K-1]);
				sb.append(getCout(list, X)+"\n");
			}
			else if(first == 0){
				stack.pop();
			}
			array[i] = new ArrayList<>(stack);
		}
		System.out.println(sb.toString());
	}
}
