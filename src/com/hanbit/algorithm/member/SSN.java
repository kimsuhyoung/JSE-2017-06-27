package com.hanbit.algorithm.member;
import java.util.Scanner;
public class SSN{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		
		String ssn="", gender="" , name=""; 
			
	System.out.print("이름을 입력하세요\n");
	name=s.next(); 
	System.out.print("\n");
	
	System.out.print("주민등록번호를 입력하세요\n");
	ssn=s.next();
		String sYear=ssn.substring(0,2); 
		int year=Integer.parseInt(sYear);  
		int age=0;
		int gap=17-year;
	
	char ch = ssn.charAt(7);
	gender="";

		if(gap>=0){age=2017-(year+2000)+1;
			
		}else{age=2017-(year+1900)+1;
			
		} 
	
	switch(ch){ 
		
		case '1' : gender="남자"; 
		
		break;
		
		case '2' : gender="여자";
		
		break ;
		
		case '3' : gender="남자";
		
		break;
		
		case '4' : gender="여자";
		
		break;				
	}
	
	System.out.print("************************\n");
	System.out.print("|  이름 |  나이  |  성별 |\n");
	System.out.print("------------------------\n");
	System.out.print("| " + name + "| " + " |  " + age + " | " +  gender + " | \n" );
	System.out.print("************************\n");
	
	}
}