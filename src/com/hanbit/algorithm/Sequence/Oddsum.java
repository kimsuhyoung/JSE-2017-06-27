package com.hanbit.algorithm.Sequence;
public class Oddsum{
	public static void main(String[] args){
		
		int[] arr=new int[10];
		int sum=0;
		
		for(int i=0;i<arr.length;i++){
			arr[i]=i+1;
			
			if(arr[i]%2==1){ 
				sum+=arr[i];
			}
		}
		System.out.print("홀수의 합" + sum);
	}
}