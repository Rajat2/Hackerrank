package hackerearth.christmascircuits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChristmasDishes {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);
		boolean flag= true;
		if(N==K){
			for(int i=0;i<K;i++)
				System.out.print('a');
		}
		else{
		for(int i=0;i<N;i++)
			if(flag){
				System.out.print((char)'a'+i);
				flag=false;
			}
			/*else{
				System.out.print('b');
				flag = true;
			}*/
		}
	}
}
