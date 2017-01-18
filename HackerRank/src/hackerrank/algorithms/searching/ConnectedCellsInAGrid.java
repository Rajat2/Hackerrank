package hackerrank.algorithms.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConnectedCellsInAGrid {
	static int matrix[][],N,M,bool[][],count;
	
	void printSolution(int sol[][])
    {
		int N = sol.length;
		int M = sol[0].length;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
                System.out.print(" " + sol[i][j] +" ");
            System.out.println();
        }
    }
	
	boolean isSafe(int maze[][], int x, int y)
    {
        // if (x,y outside maze) return false
        return (x >= 0 && x < N && y >= 0 && y < M && maze[x][y] == 1);
    }
	
	boolean solveMatrixUtil(int matrix[][],int sourceX,int sourceY,int visited[][]){
		if(!isSafe(matrix, sourceX, sourceY))
			return false;
		if(visited[sourceX][sourceY]==1 || matrix[sourceX][sourceY]==0)
			return false;
		if(matrix[sourceX][sourceY]==1){
			count++;
			visited[sourceX][sourceY] =1;
		}
			
		if(isSafe(matrix, sourceX, sourceY)){
			if(visited[sourceX][sourceY] ==1 && solveMatrixUtil(matrix, sourceX-1, sourceY-1,visited))
				return true;
			
			if(visited[sourceX][sourceY] ==1 && solveMatrixUtil(matrix, sourceX-1, sourceY,visited))
				return true;
			
			if(visited[sourceX][sourceY] ==1 && solveMatrixUtil(matrix, sourceX-1, sourceY+1,visited))
				return true;
			
			if(visited[sourceX][sourceY] ==1 && solveMatrixUtil(matrix, sourceX, sourceY-1,visited))
				return true;
			
			if(visited[sourceX][sourceY] ==1 && solveMatrixUtil(matrix, sourceX, sourceY+1,visited))
				return true;
			
			if(visited[sourceX][sourceY] ==1 && solveMatrixUtil(matrix, sourceX+1, sourceY-1,visited))
				return true;
			
			if(visited[sourceX][sourceY] ==1 && solveMatrixUtil(matrix, sourceX+1, sourceY,visited))
				return true;
			
			if(visited[sourceX][sourceY] ==1 && solveMatrixUtil(matrix, sourceX+1, sourceY+1,visited))
				return true;
			
			return false;
		}
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		matrix= new int[N][M];
		bool = new int[N][M];
		for(int i=0;i<N;i++){
			String row[] = br.readLine().split(" ");
			for(int j=0;j<M;j++){
				matrix[i][j] = Integer.parseInt(row[j]);
			}
		}
		int ans=0;
		ConnectedCellsInAGrid obj = new ConnectedCellsInAGrid();
		/*System.out.println("Matrix is: ");
		obj.printSolution(matrix);
		System.out.println("Bool is: ");
		obj.printSolution(bool);*/
		for(int i=0;i<N;i++)
			for(int j=0;j<M;j++){
				if(bool[i][j]!=1 && matrix[i][j]==1){
					//System.out.println("\n-------------------\ni: "+i+" j: "+j);
					obj.solveMatrixUtil(matrix, i, j,bool);
					ans = (int)Math.max(ans,count);
					count=0;
					//System.out.println("ans is: "+ans);
					//obj.printSolution(bool);
				}
			}
		System.out.println(ans);
	}
}
