package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class GradeRport{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
	
	int kor = 0, eng = 0, math = 0,  total = 0,  avg = 0; 
	String grade ="";				
		
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
		
	if(avg>=90){grade="A";
		
	}else if(avg>=80){grade="B";
		                            //이렇게도 가능하다
	}else if(avg>=70){grade="C";
		
	}else if(avg>=60){grade="D";
		
	}else{grade="F";
		
	}
	
	System.out.print("*************************************************************\n");
	System.out.print("   이름    총점  평균 등급\n");
	System.out.print(" | " + name + " | " + total + " | " + avg + " | " + grade + " | \n");//모니터에 "이름"과 grade값을 출력
	System.out.print("*************************************************************\n");
	
	}
}