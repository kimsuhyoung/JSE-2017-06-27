package com.hanbit.algorithm.application;
import java.util.Scanner;
public class TaxCalculator2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
	/*double rate=0.097;
*/
System.out.print("이름을 입력하세요\n");
	String name=s.next();

System.out.print("연봉을 입력하세요\n");
	int money=s.nextInt();
	int salary=0;
	double taxrate=0;
	/*int paytax=(int)(money*taxrate);*/
	
	if(money<=1200){
		taxrate=0.08;
		
	}else if(money>1200&&money<=4600){
		taxrate=0.17;
		
	}else if(money>4600&&money<=8800){
		taxrate=0.26;
		
	}else{taxrate=0.35;
		
	}
	
System.out.print("*****************************************\n");
System.out.print("|  이름  |  연봉  |  세율  |  납부할 세금 | \n");
System.out.print("-----------------------------------------\n");
System.out.print("| " + name + " | " + money + "만원" + " | " + taxrate +  " | " + (int)(money*taxrate) + "만원 | \n");
System.out.print("*****************************************\n");
	}
}

       

