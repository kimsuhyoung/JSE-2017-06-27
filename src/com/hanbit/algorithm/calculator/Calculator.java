package com.hanbit.algorithm.calculator;
import java.util.Scanner; 
public class Calculator{ 

public static void main(String[] args){  

System.out.print("Calculator\n");

Scanner s=new Scanner(System.in); 

int result =0; 

System.out.print("정수를 입력하시오\n");
	int a =s.nextInt(); 

System.out.print("정수를 입력하시오\n");
	int b =s.nextInt(); 

System.out.print("연산자를 선택하세요. 1.더하기 2.빼기 3.곱하기 4.나누기\n");
	int opcode=s.nextInt(); 

if(opcode==1){
result=a+b;} 
else if (opcode==2){
result=a-b;}
else if (opcode==3){
result=a*b;}
else {
result=a/b;} 

System.out.print("결과: "+result); 

}
}