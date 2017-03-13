package hackerearth.january;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LotsOfCircles {
	
	static int getFlag(int a,int b,int c,int d){
		int flag=0;
		c*=-1;d*=-1;
		int min = Math.min(Math.min(a,b),Math.min(c, d));
		
		flag= min==a?0:min==b?1: min==c?2:3;
		return flag;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int maxX1=0,maxX2=0,maxX3=0,maxX4=0;
		int flag=0;
		for(int i=0;i<T;i++){
			String temp[] = br.readLine().split(" ");
			int R = Integer.parseInt(temp[0]);
			int X;
			flag = getFlag(maxX1, maxX2, maxX3, maxX4);
			switch(flag){
				case 0:
					flag=1;
					X=maxX1+R;
					sb.append(X+" "+R+"\n");
					maxX1+=2*R;
					break;
				case 1:
					flag=2;
					X=maxX2+R;
					sb.append(X+" "+(R*-1)+"\n");
					maxX2+=2*R;
					break;
				case 2:
					flag=3;
					X=maxX3-R;
					sb.append(X+" "+(R*-1)+"\n");
					maxX3-=2*R;
					break;
				case 3:
					flag=0;
					X=maxX4-R;
					sb.append(X+" "+R+"\n");
					maxX4-=2*R;
					break;
			}
		}
		System.out.println(sb.toString());
	}

}
