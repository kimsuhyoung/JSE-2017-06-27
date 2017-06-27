package com.hanbit.algorithm.hello;
import java.util.Scanner;
public class Hello{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("What's your name?");
String name=s.next();
System.out.print("Hello !!" + name);
}
}