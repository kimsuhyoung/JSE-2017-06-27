package com.hanbit.algorithm.application;
import java.util.Scanner;
public class Bmi{
public static void main(String[] args){
       Scanner s=new Scanner(System.in);
              
       System.out.print("나의 체질량지수(BMI)는?\n\n");
       System.out.print("다음은 위의 공식을 스크립트를 이용해 프로그램한 것이다. 이 프로그램을 통해 체질량지수를 산출                                        할 수 있다.\n\n");
              
       System.out.print("신장");
            double high=s.nextDouble(); 
       System.out.print("m(미터)\n");
       System.out.print("(주의: 키가 179cm일 경우 1.79로 표기)\n\n");              
       System.out.print("몸무게");
            double weigh=s.nextDouble();
       System.out.print("kg(킬로그램)\n");
              
       String bmi="";
            double a=weigh/(high*high); 
              
            if(a<=18.5){
                   bmi="저체중";
            }else if(a<=24.9){
                   bmi="정상";             
            }else if(a<=29.9){
                   bmi="과체중";
            }else{
                   bmi="비만";
            }
       System.out.print("나의 체질량지수(BMI): "+a + "\n" + "당신은 " + bmi + "입니다" );
          }
     }      

