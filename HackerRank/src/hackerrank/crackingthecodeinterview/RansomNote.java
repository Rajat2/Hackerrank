package hackerrank.crackingthecodeinterview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
	 public static void main(String[] args) throws Exception  {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String NM[] = br.readLine().split(" ");
			Map<String,Integer> magazine = new HashMap<String,Integer>();
			Map<String,Integer> ransom = new HashMap<String,Integer>();
			String temp[] = br.readLine().split(" ");
			for(int i=0;i<temp.length;i++){
				magazine.put(temp[i], magazine.getOrDefault(temp[i], 0)+1);
			}
			String temp1[] = br.readLine().split(" ");
			for(int i=0;i<temp1.length;i++){
				ransom.put(temp1[i], ransom.getOrDefault(temp1[i], 0)+1);
			}
			boolean flag = true;
			 for (Map.Entry<String, Integer> entry : ransom.entrySet()) {
		            Integer i = magazine.get(entry.getKey());
		            if (i == null) {
		                flag=false;
		            	break;
		            } else {
		                if (entry.getValue() > i) {
		                	flag=false;
			            	break;
		                }
		            }
		        }
			System.out.println(flag?"Yes":"No");
	 }
}
