package hackerearth.january;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ShareMarket {
	private static boolean flag; 
	 private static final String token = " ";
	
	 public static void findTargetSumSubsets(int[] input, int target, String ramp, int index,int quantity) {

	        if(index > (input.length - 1)) {
	            if(isSolution(ramp, quantity, target)) {
	                flag = true;
	                return;
	            }
	            return;
	        }
	        

	        //First recursive call going ahead selecting the int at the currenct index value
	        findTargetSumSubsets(input, target, ramp + input[index] + token, index + 1,quantity);
	        //Second recursive call going ahead WITHOUT selecting the int at the currenct index value
	        findTargetSumSubsets(input, target, ramp, index + 1,quantity);
	    }
	 
	 private static boolean isSolution(String intString,int quantity,int target) {
	        int sum = 0;
	        StringTokenizer sTokens = new StringTokenizer(intString, token);
	        int count = sTokens.countTokens();
	        while (sTokens.hasMoreElements()) {
	            sum += Integer.parseInt((String) sTokens.nextElement());
	        }
	        return (sum==target) && (count==quantity);
	    }
	
	
	static void fillArray(BufferedReader br,int a[],int len) throws IOException{
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<len;i++)
			a[i] = Integer.parseInt(temp[i]);
	}
	
	public static <T> void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
			int T = Integer.parseInt(br.readLine());
			while(T-->0){
				int N = Integer.parseInt(br.readLine());
				int a[] = new int[N];
				fillArray(br, a, N);
				int K = Integer.parseInt(br.readLine());
				int quantity[] = new int[K];
				fillArray(br, quantity, K);
				int cost[] = new int[K];
				fillArray(br, cost, K);
				for(int i=0;i<K;i++){
					flag = false;
					findTargetSumSubsets(a, cost[i], "", 0,quantity[i]);
					sb.append(flag?"Yes\n":"No\n");
				}
			}
			System.out.println(sb.toString());
		}

}
