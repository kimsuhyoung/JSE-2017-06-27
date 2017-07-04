package com.hanbit.algorithm.application;
import java.util.Scanner;
public class Time{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
				
		System.out.print("초를 시간과 분으로 바꾸어주는 프로그램입니다. \n");
		System.out.print("초를 입력하여 주세요\n");
		int num=s.nextInt();
		
		int hours=num/3600;    
		int minute=num%3600/60; 
		int second=num%3600%60; 
		
		System.out.print(hours + "시간" + minute + "분" + second + "초");
		
		
	}
}

