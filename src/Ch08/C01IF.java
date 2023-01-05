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
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age>=8)
//		{
//			System.out.println("학교에 다닙니다");
//		}
//		else
//		{
//			System.out.println("학교에 다니지 않습니다");
//		}
		
		//정수하나 받아 입력받은수가 짝수인지 홀수인지 확인
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		if(num1%2==0)
		{
			System.out.println("짝수입니다");
		}
		else
		{
			System.out.println("홀수입니다");
		}
		
		
		//정수하나 받아 입력받은수가 3의배수인지 아닌지 확인
		int num2=sc.nextInt();
		if(num2%3==0)
		{
			System.out.println("3의 배수입니다");
		}
		else
		{
			System.out.println("3의 배수가 아닙니다");
		}
		
		//두수를 입력받아 큰수를 출력
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println("큰 값은 : " +n1);
		}
		if(n1<n2)
		{
			System.out.println("큰 값은 : " +n2);
		}
		if(n1==n2)
		{
			System.out.println("같은 값입니다.");
		}
		//세수를 입력받아 큰수를 출력(&& 연산자를 사용해보세요)
		
		

	}

}
