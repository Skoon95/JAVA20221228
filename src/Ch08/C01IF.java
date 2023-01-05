package Ch08;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		//01 단순 IF
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age >=8)
//		{
//			System.out.println("학교에 다닙니다");
//		}
//		System.out.println("첫 번째 IF 블럭 종료");
//		if(age<8)
//		{
//			System.out.println("학교에 다니지 않습니다");
//		}
//		System.out.println("두 번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다");
		
		//02 IF-ELSE
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=8)
		{
			System.out.println("학교에 다닙니다");
		}
		else
		{
			System.out.println("학교에 다니지 않습니다");
		}

	}

}
