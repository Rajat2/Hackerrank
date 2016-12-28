package hackerrank.datastructures.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeftRotation {
	void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
    public static void main(String[] args) throws Exception  {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String ND[] = br.readLine().split(" ");
		int N = Integer.parseInt(ND[0]);
		int D = Integer.parseInt(ND[1]);
		int arr[] = new int[N];
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<N;i++)
			arr[i] = Integer.parseInt(temp[i]);
		LeftRotation obj = new LeftRotation();
		obj.leftRotate(arr, D, N);
		for(int i=0;i<N;i++)
			System.out.print(arr[i]+" ");
    }
}
