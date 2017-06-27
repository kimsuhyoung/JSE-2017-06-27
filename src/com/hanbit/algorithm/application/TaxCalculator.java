package com.hanbit.algorithm.application;
/*
클라이언트에서 프로그램 개발 요청이 왔습니다.
이름과 연봉을 입력받아서
연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원입니다.
로 출력하는 프로그램을 만들어주세요.
관리자가 쉽게 적용가능하도록 만들어주세요.
현재는 세율이 9.7프로라고 합니다.
*/

import java.util.Scanner;
public class TaxCalculator{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
	double rate=0.097;

System.out.print("이름을 입력하세요\n");
	String name=s.next();

System.out.print("연봉을 입력하세요\n");
	int Money=s.nextInt();
	
System.out.print("*****************************************\n");
System.out.print("|  이름  |  연봉  |  세율  |  납부할 세금 | \n");
System.out.print("-----------------------------------------\n");
System.out.print("| " + name + " | " + Money + "만원" + " | " + rate +  " | " + Money*rate + "만원 | \n");
System.out.print("*****************************************\n");
	
	
	

	}
}
       

