package hackerrank.algorithms.warmup;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TimeConversion {

	public static void main(String[] args) throws Exception{
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		String time[] = br.readLine().split(":");
		char temp[] = time[2].toCharArray();
		int hh = Integer.parseInt(time[0]);
		if(hh<12 && temp[2]=='P'){
			System.out.println(Integer.parseInt(time[0])+12+":"+time[1]+":"+temp[0]+temp[1]);
		}
		else if(hh==12 && temp[2]=='A')
			System.out.println("00:"+time[1]+":"+temp[0]+temp[1]);
		else
			System.out.println(time[0]+":"+time[1]+":"+temp[0]+temp[1]);

	}

}
