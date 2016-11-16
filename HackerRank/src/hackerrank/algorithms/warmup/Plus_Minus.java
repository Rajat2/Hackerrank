package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Plus_Minus {
public static void main(String[] args) throws Exception{
	BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	//int a[] = new int[N];
	int pos=0,neg=0,zero=0;
	String []temp = br.readLine().split(" ");
	for(int i=0;i<temp.length;i++){
		int a = Integer.parseInt(temp[i]);
		if(a==0)
			zero++;
		else if(a>0)
			pos++;
		else
			neg++;
	}
	float a=(float)zero/N,b=(float)pos/N,c=(float)neg/N;
	System.out.println(b);
	System.out.println(c);
	System.out.println(a);
  }
}
