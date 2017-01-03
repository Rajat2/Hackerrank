package hackerrank.crackingthecodeinterview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalancedBrackets {
	
		static boolean isClosingBracket(char c){
			if(c==']' || c=='}' || c==')')
				return true;
			return false;
		}
		
		static boolean isOpeningBracket(char c){
			if(c=='[' || c=='{' || c=='(')
				return true;
			return false;
		}
		
		static boolean isMatched(char c2,char c1){
			if((c1=='[' && c2==']') || (c1=='{' && c2=='}') || (c1=='(' && c2==')'))
				return true;
			return false;
		}
	 public static void main(String[] args) throws Exception  {
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			while(N-->0){
				char s[] = br.readLine().toCharArray();
				Stack<Character> stack = new Stack<>();
				boolean flag = true;	
				for(int i=0;i<s.length;i++){
					System.out.println(stack);
					char c1 = s[i];
					if(isOpeningBracket(c1))
						stack.push(c1);
					else if(isClosingBracket(c1)){
						if(stack.isEmpty()){
							flag = false;
							break;
						}
						char c2 = stack.pop();
						System.out.println("c1: "+c1+"\nc2: "+c2+"\nisMatched(c1, c2): "+isMatched(c1, c2));
						if(!isMatched(c1, c2)){
							flag = false;
							break;
						}
					}
				}
				System.out.println(flag && stack.isEmpty() ?"YES":"NO");
			}
	 }
}
