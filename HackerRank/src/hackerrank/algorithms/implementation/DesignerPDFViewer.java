package hackerrank.algorithms.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DesignerPDFViewer {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		String word = br.readLine();
		//int widthMulti = 1;
		int height=0;
		for(int i=0;i<word.length();i++){
			int num = Integer.parseInt(s[word.charAt(i)-'a']);
			//widthMulti*=num;
			if(num>height){
				height = num;
			}
		}
		System.out.println(word.length()*height);
	}
}
