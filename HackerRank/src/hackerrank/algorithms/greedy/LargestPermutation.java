package hackerrank.algorithms.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LargestPermutation {
	public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int K  = Integer.parseInt(temp[1]);
		String temp1[] = br.readLine().split(" ");
		Integer a[] = new Integer[N];
		Integer idxArr[] = new Integer[N];
		for(int i=0;i<N;i++){
			a[i] = Integer.parseInt(temp1[i]);
			idxArr[a[i]-1] = i;
		}
		 int swaps = 0;
		  int currentIdx = 0;
		  // Start with the biggest number and work down
		  for (int i = N - 1; i >= 0; i--) {
		    if (idxArr[i] != currentIdx) {

		      // Swap larger number with smaller number
		      // at currentIdx. 
		      int smallerNum = a[currentIdx];
		      a[idxArr[i]] = smallerNum;
		      a[currentIdx] = i + 1;

		      // Swap indices of the swapped numbers
		      int tmp = idxArr[i];
		      idxArr[i] = currentIdx;
		      idxArr[smallerNum - 1] = tmp;
		      swaps++;

		      if (swaps == K) {
		        break;
		      }
		    }
		    // currentIdx is incremented
		    currentIdx++;
		  }
		for(int x:a)
		System.out.print(x+" ");
	}
}
