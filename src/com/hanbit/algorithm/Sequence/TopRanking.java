package com.hanbit.algorithm.Sequence;
import java.util.Scanner;
public class TopRanking{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		int sum=0, avg=0, max=0, min=100, count=0; 
		System.out.print("1반의 총 학생수는 몇명?\n");
		count=s.nextInt();
		int[] arr = new int[count];
		
		for(int i=0;i<arr.length;i++){
		System.out.print("학생의 평균 점수 입력하세요\n");
		arr[i]=s.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			
		
		if(arr[i]>max){
		max=arr[i];
		}
		if(arr[i]<min){ 
			min=arr[i];
		}
		sum+=arr[i];
		}
		avg=sum/arr.length; 
		
		System.out.println("1반의 평균점수는 " + avg );
		System.out.println("1반의 최대점수는 " + max );
		System.out.println("1반의 최소점수는 " + min );
		
	}
}