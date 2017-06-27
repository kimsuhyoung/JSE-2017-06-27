package com.hanbit.algorithm.application;
import java.util.Scanner;
public class Bignumber{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
	int max=0, mid=0,min=0;
	
	System.out.print("A값을 입력하세요");
	int a =s.nextInt();
	
	System.out.print("B값을 입력하세요");
	int b =s.nextInt();
	
	System.out.print("C값을 입력하세요");
	int c =s.nextInt();
	
	if(a>b && a>c){
			max= a;
		if(b>c){
			mid= b;
			min= c;
		}else{
			mid= c;
			min= b;
		}
		
		
	}else if(b>a && b>c){
		max= b;
		if(a>c){
			mid= a;
			min= c;
		}else{
			mid= c;
			min= a;
		}
	}else{
		max= c;
		if(a>b){
			mid= a;
			min= b;
		}else{
			mid= b;
			min= a;
		}
	}
		System.out.print(String.format("%d %d %d"+max,mid,min));
	
	}
}
       

