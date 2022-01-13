package mvc.controller;

import java.util.Scanner;

public class ScoreConstroller {

	public static void main(String[] args) {
		
		Scanner mu=new Scanner(System.in); //문자입력
		Scanner su=new Scanner(System.in); //숫자입력
		
		System.out.println("학생의 성적 입력 : ");
		while(true) {
			System.out.println("성명 입력 : ");
			String name=mu.nextLine();
			
			System.out.println("학번 입력 : ");
			int stuId=su.nextInt();
			
			
			System.out.println("계속해서 성적을 입력하시겠습니까?(y/n) ");
			String msg=mu.nextLine();
			if(msg.equals("n")||msg.equals("no"))
				break;
		}
	}

}
