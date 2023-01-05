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
				
		//3자리수
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
		while(true) {
			System.out.println(Math.random());
			Thread.sleep(500);
		}
		
		
		
		//4 수의범위제한

	}

}
