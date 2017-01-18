package hackerrank.algorithms.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountLuck {
	
	
	
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
		int N = maze.length;
		int M = maze[0].length;
        // if (x,y outside maze) return false
        return (x >= 0 && x < N && y >= 0 &&
                y < M && maze[x][y] == 1);
    }
	
	boolean solveMatrixUtil(int matrix[][],int sourceX,int sourceY,int destinationX, int destinationY,int sol[][]){
		int N = matrix.length;
		int M = matrix[0].length;
		/*System.out.println("source X: "+sourceX+" source Y: "+sourceY);
		if(!(sourceX>-1 && sourceY>-1 && sourceX<N && sourceY<M))
			return false;*/
		if(sourceX==destinationX && destinationY == sourceY){
			sol[sourceX][sourceY] = 1;
			//System.out.println("Found the destination");
			return true;
		}
		if(isSafe(matrix, sourceX, sourceY) && sol[sourceX][sourceY]!=1){
			sol[sourceX][sourceY] = 1;
			
			if(solveMatrixUtil(matrix, sourceX-1, sourceY, destinationX, destinationY, sol))
				return true;
			
			if(solveMatrixUtil(matrix, sourceX, sourceY-1, destinationX, destinationY, sol))
				return true;
			
			if(solveMatrixUtil(matrix, sourceX+1, sourceY, destinationX, destinationY, sol))
				return true;
			
			if(solveMatrixUtil(matrix, sourceX, sourceY+1, destinationX, destinationY, sol))
				return true;
			
			
			sol[sourceX][sourceY] = 0;
			return false;
		}
		return false;
	}
	
	int solveMatrix(int matrix[][],int sourceX,int sourceY,int destinationX, int destinationY){
		int N = matrix.length;
		int M = matrix[0].length;
		/*System.out.println("Matrix is:");
		printSolution(matrix);*/
		int solution[][] = new int[matrix.length][matrix[0].length];
		//System.out.println("Solution after matrix is:");
		solveMatrixUtil(matrix, sourceX, sourceY, destinationX, destinationY, solution);
		solution[sourceX][sourceY] = 1;
		//printSolution(solution);
		//Find the number of wave;
		int count=0,x=sourceX,y=sourceY;
		solution[sourceX][sourceY] = 2;
		matrix[sourceX][sourceY] = 2;
		while(true){
			//System.out.println("Count is"+count+"\nX: "+sourceX+" Y:"+sourceY);
			//found answer
			
			if(sourceX==destinationX && sourceY==destinationY)
				break;
			
			//go to down
			if(sourceX<N-1 && solution[sourceX+1][sourceY]==1){
				while(sourceX<N-1 && solution[sourceX+1][sourceY]==1){
					if(isOtherWay(matrix, solution,sourceX,sourceY))count++;
					solution[sourceX+1][sourceY] = 2;
					matrix[sourceX+1][sourceY] = 2;
					sourceX++;
				}
			}
			//go to right
			if(sourceY<M-1 && solution[sourceX][sourceY+1]==1){
				while(sourceY<M-1 && solution[sourceX][sourceY+1]==1){
					if(isOtherWay(matrix, solution,sourceX,sourceY))count++;
					solution[sourceX][sourceY+1] = 2;
					matrix[sourceX][sourceY+1] = 2;
					sourceY++;
				}
			}
			//go to up
			if(sourceX > 0 && solution[sourceX-1][sourceY]==1){	
				while(sourceX > 0 && solution[sourceX-1][sourceY]==1){
					if(isOtherWay(matrix, solution,sourceX,sourceY))count++;
					solution[sourceX-1][sourceY] = 2;
					matrix[sourceX-1][sourceY] = 2;
					sourceX--;
				}

			}
			//go to left
			if(sourceY > 0 && solution[sourceX][sourceY-1]==1){
				
				while(sourceY > 0 && solution[sourceX][sourceY-1]==1){
					if(isOtherWay(matrix, solution,sourceX,sourceY))count++;
					solution[sourceX][sourceY-1] = 2;
					matrix[sourceX][sourceY-1] = 2;
					sourceY--;
				}
			}
		}
		/*System.out.println("Matrix is:");
		printSolution(matrix);
		System.out.println("Solution is:");
		printSolution(solution);*/
		
		return count;
	}
	
	boolean isOtherWay(int matrix[][],int sol[][],int a,int b){
		int count=0;
		int N = matrix.length;
		int M = matrix[0].length;
		if(a>0 && matrix[a-1][b]==1)
			count++;
		if(b>0 && matrix[a][b-1]==1)
			count++;
		if(a<N-1 && matrix[a+1][b]==1)
			count++;
		if(b<M-1 && matrix[a][b+1]==1)
			count++;
		
		if(count>1)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String NM[] =br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			int matrix[][]= new int[N][M];
			CountLuck obj = new CountLuck();
			int sourceX=0,sourceY=0,destinationX = 0,destinationY=0;
			for(int i=0;i<N;i++){
				char row[] = br.readLine().toCharArray();
				for(int j=0;j<M;j++){
					if(row[j]=='*'){
						matrix[i][j] = 1;
						destinationX = i;
						destinationY = j;
					}
					else if(row[j]=='M'){
						matrix[i][j] =1;
						sourceX = i;
						sourceY = j;
					}
					else if(row[j]=='X')
						matrix[i][j] =0;
					else if(row[j]=='.')
						matrix[i][j] =1;
				}
			}
			int K = Integer.parseInt(br.readLine());
			if(K==obj.solveMatrix(matrix, sourceX, sourceY, destinationX, destinationY))
				System.out.println("Impressed");
			else
				System.out.println("Oops!");
		}
		br.close();
	}
}
