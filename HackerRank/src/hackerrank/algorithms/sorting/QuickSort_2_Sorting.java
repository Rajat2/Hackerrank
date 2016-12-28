package hackerrank.algorithms.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class QuickSort_2_Sorting {
	static int partition(int ar[], int minpos, int maxpos)
    {
        int p = ar[minpos];
        ArrayList<Integer> leftlist = new ArrayList<Integer>();
        ArrayList<Integer> rightlist = new ArrayList<Integer>();

        for(int i = minpos+1 ; i <= maxpos; i++)
            {
               if(ar[i] > p)
                   rightlist.add(ar[i]);
               else
                   leftlist.add(ar[i]);
            }
        copy(leftlist,ar,minpos);
        int ppos = leftlist.size()+minpos;
        ar[ppos] = p;
        copy(rightlist,ar,ppos+1);

        return minpos + leftlist.size();
    }

     static void copy(ArrayList<Integer> list, int ar[], int startIdx)
     {
             for(int num : list)
            {
               ar[startIdx++] = num;      
            }
     }

    static void quickSort(int ar[], int minpos, int maxpos)
   {
        if(minpos >= maxpos)
            return;

       int pos = partition (ar,minpos,maxpos);

        quickSort(ar,minpos,pos-1);
        quickSort(ar,pos+1,maxpos);

        printArray(ar,minpos, maxpos);
   }
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			String temp[] = br.readLine().split(" ");
			int a[] = new int[N];
			for(int i=0;i<N;i++){
				a[i]  = Integer.parseInt(temp[i]);
			}
			quickSort(a,0,a.length-1);                
   } 
	
	private static void printArray(int[] ar,int i,int j) {
		for(int k=i;k<=j;k++){
			System.out.print(ar[k]+" ");
		}
	     System.out.println("");
	}

}
