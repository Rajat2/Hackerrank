package hackerearth.christmascircuits;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class ChristmasString {
	HashMap<Integer, Integer> map = new HashMap<>();
	int count=0;
	private void compareString(String p,String q){
		char a[] = p.toCharArray(),b[]=q.toCharArray();
		int counter=0,pos=-1;
		for(int i=0;i<a.length;i++){
			if(a[i]==b[i] || a[i]=='*')
				continue;
			if(a[i]!=b[i] && a[i]!='*'){
				counter++;
				pos = i+1;
			}
			if(counter>1)
				return;
		}
		if(counter==0)
			count++;
		else if(counter==1){
			int num=map.get(pos)==null?0:map.get(pos);
			map.put(pos, num+1);
		}
		else 
			return;
	}
	private int getAnswer(){
		int max=0;
		for(int i:map.keySet()){
			int temp = map.get(i);
			if(temp>max){
				max = temp;
			}
		}
		System.out.println(map);
		return this.count+max;
	}
	
	
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String p = br.readLine().trim();
		int N = Integer.parseInt(br.readLine());
		ChristmasString obj = new ChristmasString();
		for(int i=0;i<N;i++){
			obj.compareString(p, br.readLine().trim());
		}
		System.out.println(obj.getAnswer());
	}
}
