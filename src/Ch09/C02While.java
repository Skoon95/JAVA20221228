package Ch09;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		//구구단(2단~9단)
		
//		int dan=2;
//		int i=1;
//		while(dan<=9) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		//9단~2단 출력
//		9 x 1 = 9
//      9 x 2 = 9
//			..
//		8 x 1 = 8
//		    ..
//		2 x 9 = 18
//		int dan=9;
//		int i=1;
//		while(dan>=2) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
//		
		
		
		
		//2단 ~9단 출력
//		9x9=81
//		9x8=72
//		..
//		2x1=2
		
//		int dan=9;
//		int i=9;
//		while(dan>=2) {
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		//N단을 입력받아 N단부터 9단까지 출력
		
		
		//N,M을 입력받아 N부터 M단까지 출력(N<M and N<8 and M<=9)
		
		//1
		//*****
		//*****
		//*****
		//*****
//		int i=0; //줄바꿈
//		int j=0;
//		
//		while(i<4) {
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//2
//		*
//		**
//		***
//		****
//		int i=0; //줄바꿈
//		int j=0;
//		
//		while(i<4) {
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//높이 입력: 7
		//높이만큼의 직각삼각형별이 출력되도록합니다
		Scanner sc= new Scanner(System.in);
		int i=0; //줄바꿈
		int j=0;
		int h=sc.nextInt();
		
		while(i<h) {
			j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		//3
//		****
//		***
//		**
//		*
		
		
		
		//4
//		  *
//		 ***
//	    *****
//	   *******
		
		
		
		
		
		
	}

}
