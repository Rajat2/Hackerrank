package hackerearth.christmascircuits;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ChristmasDigits {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		String a = temp[0];
		int b =	Integer.parseInt(temp[1]);
		String c = temp[2];
		StringBuilder sb = new StringBuilder();
		if(a.equals(c) || b==0 || a.length()==c.length()){
			System.out.println(a);
			return;
		}
		int x=0,y=0;
	
		for(x=0,y=0;x<a.length() && y<c.length() && a.length()<c.length() && b>0;){
			int posA=Integer.parseInt(a.charAt(x)+"");
			int posC=Integer.parseInt(c.charAt(y)+"");
			if(posA==posC){
				x++;y++;
				sb.append(posA+"");
			}
			if(sb.length()+(a.length()-x)>c.length()){
				break;
			}
			else{
				sb.append(posC+"");
				y++;
				b--;
			}
		}
		
		while(x<a.length()){
			sb.append(a.charAt(x)+"");
			x++;
		}
		while(b>0 && y<c.length() && sb.length()<c.length()){
			sb.append(c.charAt(y)+"");
			y++;
			b--;
		}
		System.out.println(sb.toString());
	}
}
