package Ch07;

import java.util.Random;
import java.util.Scanner;

public class C02나머지연산자 {

	public static void main(String[] args) throws InterruptedException {
		
		//1 짝홀수구분 n%2== 0 or 1 
		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		
//		String result = (num1%2==0)?"짝수입니다":"홀수입니다";
//		System.out.println("결과 :"+result);
				
		//2 배수구분
//		int n1,n2,n3,sum;
//		n1=sc.nextInt();
//		n2=sc.nextInt();
//		n3=sc.nextInt();
//		sum=n1+n2+n3;
//		String result =(sum%5==0)?"5의 배수입니다":"5의 배수가 아닙니다";
//		System.out.println("Result : "+result);
				
		//3수의 범위제한
		// N % 2  = 0~1
		// N % 3  = 0~2
		// N % 10 = 0~9
		// N % 100= 0~99
		//난수생성
		//01 Random객체 생성
//		Random rnd = new Random();
//		while(true) {
//			System.out.println(rnd.nextInt(5)); //N%5 과 동일 숫자 0~4
//			Thread.sleep(500);
//		}
		
		//02 Math.random() 사용
//		while(true) {
//			System.out.println( (int)(Math.random()*100)%45 +1);
//			Thread.sleep(500);
//		}
		
		
		
		//4 자리수
//		int num= 56789;
//		
//		System.out.println("오른쪽 끝 1자리 : "+ (num % 10));
//		System.out.println("오른쪽 끝 2자리 : "+ (num % 100));
//		System.out.println("오른쪽 끝 3자리 : "+ (num % 1000));
//		System.out.println("오른쪽 끝 4자리 : "+ (num % 10000));
//		System.out.println();
//		System.out.println("왼쪽 끝 1자리 : "+ (num / 10000));
//		System.out.println("왼쪽 끝 2자리 : "+ (num / 1000));
//		System.out.println("왼쪽 끝 3자리 : "+ (num / 100));
//		System.out.println("왼쪽 끝 4자리 : "+ (num / 10));
		
		//정수 하나를 입력받아 거꾸로 저장해보세요(반복문법 이후 풀어보기)%,/연산 동시이용할 것
		//예
		
		//입력 : 1234
		//저장
		//int reverse = 4321;
		//출력 :4321
		
		//문제
		//정수값 3개를 입력받아서 그 합이
		//짝수이면서 5의 배수면 '참입니다'를 출력 아니면 '거짓입니다'를 출력하세요
		//조건식에 %, &&연산기호를 사용합니다
		//삼항연산자를 사용합니다
		 
		int num1,num2,num3,sum;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sum=num1+num2+num3;
		
		String result=(sum%5==0 && sum%2==0 )?"참입니다" :"거짓입니다";
		System.out.println("Result :" +result);
		

	}

}
