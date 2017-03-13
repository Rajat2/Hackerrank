package hackerrank.hack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class BalancedBrackets {
	static boolean isCompaitable(char a,char b){
		if((a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']')){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			Stack<Character> stack =  new Stack<>();
			char s[] = br.readLine().toCharArray();
			boolean flag= true;
			//System.out.println("Char is: "+Arrays.toString(s));
			for(int i=0;i<s.length;i++){
				//System.out.println("i is"+s[i]);
				if(s[i]==')' || s[i]=='}' || s[i]==']'){
					if(stack.isEmpty()){
						flag = false;
						break;
					}
					char temp = stack.pop();
					if(!isCompaitable(temp,s[i])){
						flag = false;
						break;
					}
				}
				else{
					stack.push(s[i]);
				}
			}
			if(stack.isEmpty() && flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
