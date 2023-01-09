package Ch09;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		//기본 While

		//조건식이 거짓이 되게끔 하기 위한 연산
//		int i=0; //탈출용 변수
//		while(i<10) //조건식
//		{
//			System.out.println("Hello World");
//			i++;
//		}
		
		//1부터 10까지의 합 구하기
//		int i= 1;
//		int sum=0;
//		while(i<=10)
//		{
//			System.out.println("i 값 : " +i);
//			sum= sum+i;
//			i++;
//			
//		}
//		System.out.println("1부터 10까지의 합 : "+sum);
		
//		Scanner sc = new Scanner(System.in);
		//1부터 N(키보드로부터 입력)까지 수의 합
		
//		int n1=1;
//		int N=0;
//		int sum=0;
//		N=sc.nextInt();
//		
//		while(n1<=N) {
//			sum=sum+n1;
//			n1++;
//		}
//		System.out.println("1부터 입력받은 수까지의 합 : "+sum);
				
		//N부터 M까지(N,M은 키보드로부터 입력)
		//내가 푼 버전
//		int n1=0;
//		int n2=0;
//		int sum=0;
//		n1=sc.nextInt();
//		n2=sc.nextInt();
//		
//		while(n1<=n2) {
//			sum=sum+n1;
//			n1++;
//		}
//		System.out.println("처음 입력 값과 두 번째 입력 수 까지의 합은 : "+sum);
		
		//선생님 버전
		//Scanner sc = new Scanner(System.in);
//		int N=sc.nextInt(); //초기값
//		int M=sc.nextInt(); //마지막값
//		
//		if(N>M) {
//			//Swap
//			int tmp = N;
//			N=M;
//			M=tmp;
//		}
//		
//		int i = N;
//		int sum=0;
//		
//		while(i<=M) {
//			System.out.println("N 값 : " +N);
//			sum=sum+i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d",N,M,sum);
		
		
		//N부터 M까지의 합(N,M은 키보드로부터 입력), 조건 N>M 
//		int N=0;
//		int M=0;
//		int sum=0;
//		
//		N=sc.nextInt();
//		System.out.println("첫 번째 입력 값  N:" +N);
//		M=sc.nextInt();
//		System.out.println("두 번째 입력 값  M:" +M);
//		
//		if(N>M) {
//			while(M<=N) {
//				sum=sum+N;
//				M++;
//			}
//			System.out.printf("%d 부터 %d까지의 합 : %d",M,N,sum);
//			
//		}
//		else {
//			System.out.println("두 번째 입력 값이 더 크거나 같습니다.");
//		}
		
		
		//구구단(2단)
//		int dan=2;
//		int i=1;
//		while(i<=9) {
//			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//			i++;
//		}
		
		//구구단(N단)
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		int r=1;
//		while(r<=9) {
//			System.out.printf("%d x %d = %d\n",dan,r,dan*r);
//			r++;
//		}
		//1부터 10까지 수중의 4의 배수만 출력
//		int i= 1;
//	
//	    while(i<=10)
//		{
//	    	if(i%4==0)
//			System.out.println("i 값 : " +i);
//
//			i++;
//			
//		}
	  //1부터 N까지 수중의 4의 배수만 출력
//		Scanner sc = new Scanner(System.in);
		
//		int i=1;
//		int n=sc.nextInt();
//		
//		while(i<=n) {
//			
//			if(i%4==0) 
//				System.out.printf("1부터 %d 까지 수 중 4의 배수: %d\n",n,i);
//			
//			i++;
				
	//	}
		//1 부터 100까지 수중에 3의 배수의 합만 출력
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n)
		{
			if(i%3==0) {
				System.out.println("i : "+ i);
				sum+=i;; //sum =sum+i;
			}
			i++;
		}
		System.out.println("합 :" + sum);
		
		
	}

}
