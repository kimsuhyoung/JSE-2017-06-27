package com.hanbit.algorithm.calculator;
import java.util.Scanner;
public class Multi{
public static void main(String[] args){
System.out.println("곱셈");
Scanner s=new Scanner(System.in);

System.out.println("첫번째 숫자를 입력하시오");
	int a = s.nextInt();
System.out.println("두번째 숫자를 입력하시오");
	int b = s.nextInt();

	int c = a*b;

System.out.println("곱셈"+c);


}
}

