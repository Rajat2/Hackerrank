package hackerrank.hack;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SimpleTextEditor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        StringBuilder s = new StringBuilder();
        Stack<Integer> opstack = new Stack<Integer>();
        Stack<String> argstack = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q-- >0) {
            int op = sc.nextInt();
            switch(op) {
                case 1: String argstr = sc.next();
                        s.append(argstr);
                        opstack.push(op);
                        argstack.push(Integer.toString(argstr.length()));
                        break;
                
                case 2: int argi = sc.nextInt();
                        argstr = s.substring(s.length() - argi);
                        s.delete(s.length()-argi,s.length());
                        opstack.push(op);
                        argstack.push(argstr);
                        break;
                
                case 3: argi = sc.nextInt();
                        System.out.println(s.charAt(argi -1));
                        break;
                
                case 4: argi = opstack.pop();
                        if(argi == 1) {
                            argi = Integer.parseInt(argstack.pop());
                            s.delete(s.length()-argi,s.length());
                        }
                        else {
                            argstr = argstack.pop();
                            s.append(argstr);
                        }
                        break;
                        
            }
        }
    }
}