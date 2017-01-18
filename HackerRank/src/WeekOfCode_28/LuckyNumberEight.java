package WeekOfCode_28;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LuckyNumberEight {
	long count=0l;
	long mod = 1000000007;
	String input;
	StringBuilder cur;
	
	 boolean isDivisible(String s){
		if(s.length()<=3 && Integer.parseInt(s)%8==0)
			return true;
		if(s.length()>3 && Integer.parseInt(s.substring(s.length()-3))%8==0){
			return true;
		}
		return false;
	}

	  void next(int pos, int reminder) {
	    cur.append(input.charAt(pos));

	    if (reminder == 1) {
	      if(Integer.parseInt(cur.toString().charAt(cur.length()-1)+"")%2==0 && isDivisible(cur.toString())){
	    	 count++;
	         count = (long)count%mod;
	         System.out.println(cur);
	      }
	    } else {
	      for (int i = pos + 1; i + reminder - 1 <= input.length(); i++)
	        next(i, reminder - 1);
	    }
	    cur.deleteCharAt(cur.length() - 1);
	  }

	  public void generate(String input) {
	    cur = new StringBuilder();
	    this.input = input;
	    for (int length = 1; length <= input.length(); length++)
	      for (int pos = 0; pos + length <= input.length(); pos++)
	        next(pos, length);
	  }

	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LuckyNumberEight obj = new LuckyNumberEight();
		obj.generate(br.readLine());
		System.out.println(obj.count);
	}
}
