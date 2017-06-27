package com.hanbit.algorithm.matrix;
public class MatrixBasic{
	public static void main(String[] args){
		int[][] mtx=new int[5][5];
		
		for(int i=0;i<mtx.length;i++){
			for(int j=0;j<mtx[i].length;j++){//매트릭스에서 하나 들어가서 열을 제어하려면
			System.out.print(String.format("[%d][%d] ",i,j));	
			}
			System.out.print("\n");
		}
		
	}
}