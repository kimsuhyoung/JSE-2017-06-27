package com.hanbit.algorithm.member;
import java.util.Scanner;
public class Login{
public static final String USER_ID="kim";
	public static final String USER_PASS="1";
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
	System.out.print("로그인\n");
	
	System.out.print("아이디를 입력하세요\n");
		String Id=s.next();
	System.out.print("비밀번호를 입력하세요\n");
		String Pass=s.next();
	String a ="";
	

	if(!Id.equals(USER_ID)){
		a="해당 ID가 없습니다.\n";
		}else if(!Pass.equals(USER_PASS)){
			a="비밀번호가 틀렸습니다.\n";   
			}else{
				System.out.print("로그인 성공");
	}	
	System.out.print(a);
	
	}
}
