package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class GradeRport2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);

	int kor = 0, eng = 0, math = 0,  total = 0,  avg = 0; // 선언할때 int,String등은 앞에 한번만 쓰면 된다.
	String grade ="" , result="";				
	
	System.out.print("이름\n"); 	
	String name=s.next();			
	System.out.print("kor점수\n");  
	kor=s.nextInt();			
	System.out.print("eng점수\n");  
	eng=s.nextInt();			
	System.out.print("math점수\n"); 
	math=s.nextInt();			
	
	total=kor+eng+math;			
	avg=total/3;				
	
	switch(avg/10){ 
		case 10 :
			grade ="A";
			result="장학금대상입니다";
		break; 
		
		case 9  :
			grade ="A";
			result="장학금대상입니다";
			
		break;
		
		case 8 :
			grade ="B";
			result="3학점이수";
		
		break;
		
		case 7  :
			grade ="C";
			result="2학점이수";
		
		break;
		
		case 6 :
			grade ="D";
			result="1학점이수";
		
		
		default :
			grade ="F";
			result="재수강";
		
		break;
	}
	
	System.out.print("*************************************************************\n");
	System.out.print("   이름    총점  평균 등급\n");
	System.out.print(" | " + name + " | " + total + " | " + avg + " | " + grade + " | " + result + "\n");   
	System.out.print("*************************************************************\n");
		
	}
}