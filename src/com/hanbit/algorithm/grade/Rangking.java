package com.hanbit.algorithm.grade;
import java.util.Scanner;
public class Rangking{
	public static void main(String[] agrs){
		Scanner scan=new Scanner(System.in);
		System.out.print("###### 성적 랭킹 ######\n");
				
		int[] scores= new int[3]; 
		String[] names = new String[3];
		
     for(int i=0;i<3;i++){
		System.out.println("이름을 입력하세요");
		names[i] = scan.next(); 
		System.out.println("점수를 입력하세요");
		scores[i] = scan.nextInt(); 
		
		}
	
		int[] rangking = new int[3]; 
		String[] namerangking = new String[3];

		if(scores[0]>scores[1] && scores[0]>scores[2]){
			namerangking[0]=names[0];
			rangking[0]=scores[0];
			
			if(scores[1]>scores[2]){
			namerangking[1]=names[1];
			rangking[1]=scores[1];
			}else{
				
			}
			
		}
			System.out.print("1등 "+names[0] + scores[0] + "점\t" + "2등 "+names[1] + scores[1] + "점\t" + "1등 "+names[2] + scores[2] + "점\t"   );
		}
						
		}
	