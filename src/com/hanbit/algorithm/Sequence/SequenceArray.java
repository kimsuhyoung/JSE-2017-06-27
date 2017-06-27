package com.hanbit.algorithm.Sequence;
public class SequenceArray{
	public static void main(String[] args){
		int[] arr =new int[10];
		for(int i=0;i<10;i++){	
			
		}
		int sum=0;            
		for(int i=0;i<arr.length;i++){
			arr[i]=i+1; 
			System.out.print(arr[i]+"\t");
			sum+=arr[i]; 
		}
		System.out.print("sum : " + sum); 
	}
}