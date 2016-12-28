package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RichieRich {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		char temp[] = br.readLine().toCharArray();
		
		boolean odd = n%2==0?false:true;
		int left[]=new int[n/2],right[]=new int[n/2],l=-1,changes[] = new int[n/2] ;
		int middle = odd?Integer.parseInt(temp[(n/2)]+""):0;
		for(int i=0;i<n/2;i++){
			left[i] = Integer.parseInt(temp[i]+"");
			right[++l] = Integer.parseInt(temp[n-1-i]+"");
		}
		/*System.out.println("Left: "+Arrays.toString(left));
		System.out.println("Middle:"+middle);
		System.out.println("Right: "+Arrays.toString(right));
		*/
		int totalChanges = 0,availChanges=k;
		for(int i=0;i<left.length;i++){
			if(left[i]!=right[i])
				totalChanges++;
		}
		if(totalChanges>k){
			System.out.println("-1");
			System.exit(0);
		}
		if(k>=n){
			for(int i=0;i<n;i++)
				System.out.print(9);
			System.exit(0);
		}
		for(int i=0;i<left.length && availChanges>=0;i++){
			if(left[i]!=right[i]){
				availChanges--;
				left[i] = Math.max(left[i], right[i]);
				right[i] = Math.max(left[i], right[i]);
				changes[i] = 1;
			}
			//System.out.println("avail: "+availChanges);
		}
		/*System.out.println("Left: "+Arrays.toString(left));
		System.out.println("Middle:"+middle);
		System.out.println("Right: "+Arrays.toString(right));*/
		for(int i=0;i<left.length && availChanges>=0;i++){
			if(left[i]!=9){
				if(changes[i]==1 && availChanges-1>=0){
					left[i] = 9;
					right[i] = 9;
					availChanges = availChanges-1;
				}
				else if(availChanges-2>=0){
					left[i] = 9;
					right[i] = 9;
					availChanges = availChanges-2;
				}
			}
		}
		//System.out.println(availChanges);
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<left.length;i++)	
			sb.append(left[i]);
		if (availChanges>0 && odd)
		  sb.append("9");
		else if(odd)
		  sb.append(middle);
		for(int i=left.length-1;i>-1;i--)	
			sb.append(right[i]);
		System.out.println(sb.toString());
	}
}