package hackerrank.hack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MaximumElement {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		Stack<Integer> stackMain = new Stack<>();
		Stack<Integer> stackTemp = new Stack<>();
		for(int i=0;i<T;i++){
			String temp[] = br.readLine().split(" ");
			int first = Integer.parseInt(temp[0]);
			if(first==1){
				int s = Integer.parseInt(temp[1]);
				if(stackMain.isEmpty() && stackTemp.isEmpty()){
					stackMain.push(s);
					stackTemp.push(s);
				}
				else{
					stackMain.push(s);
					stackTemp.push(stackTemp.peek()>=s?stackTemp.peek():s);
				}
			}
			else if(first==2){
				stackMain.pop();
				stackTemp.pop();
			}
			else if(first == 3){
				System.out.println(stackTemp.peek());
			}
		}
	}

}
