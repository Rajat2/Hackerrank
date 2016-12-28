package hackerrank.algorithms.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MorganAndString {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String str1 = br.readLine().trim()+(char)((int)'Z'+1); 
			String	str2 = br.readLine().trim()+(char)((int)'Z'+1);
			long p1 = 0;
			long p2=0;
			long l1 = str1.length(),l2=str2.length();
			int flag = 0;
	        while(p1<l1 && p2<l2)
	        {
	            if(str1.charAt((int) p1) < str2.charAt((int) p2))
	            {
	                System.out.print(str1.charAt((int) p1));
	                p1++;
	                flag = 0;
	            }
	            else if(str2.charAt((int) p2)<str1.charAt((int) p1))
	            {               
	                System.out.print(str2.charAt((int) p2));
	                p2++;
	                flag = 0;
	            }
	            else if(str1.charAt((int) p1)==str2.charAt((int) p2))
	            {
	                if(flag==-1)
	                {
	                    System.out.print(str1.charAt((int) p1));
	                    p1++;
	                }
	                else if(flag==1)
	                {
	                    System.out.print(str2.charAt((int) p2));
	                    p2++;
	                }                    
	                else if(flag==0)
	                {                
	                    long pp1 = p1;
	                    long pp2 = p2;
	                    while(pp1<str1.length() && str1.charAt((int) pp1)==str2.charAt((int) pp2))
	                    {
	                        pp1++;
	                        pp2++;
	                    }
	                    if(pp1>=str1.length())
	                    {
	                        System.out.print(str1.charAt((int) p1));
	                        p1++;
	                        flag = -1;
	                    }    
	                    else if(str1.charAt((int) pp1)<str2.charAt((int) pp2))
	                    {
	                        System.out.print(str1.charAt((int) p1));
	                        p1++;
	                        flag = -1;
	                    }
	                    else if(str2.charAt((int) pp2)<str1.charAt((int) pp1))
	                    {
	                        System.out.print(str2.charAt((int) p2));
	                        p2++;
	                        flag = 1;
	                    }
	                }
	            }    
	        }
	        if(p1<str1.length()-1)
	            System.out.print(str1.substring((int)p1,str1.length()-(int)p1-1));
	        else if(p2<str2.length()-1)
	            System.out.print(str2.substring((int)p2,str2.length()-(int)p2-1));
	        System.out.print("\n");
	        
        }
	}
}
