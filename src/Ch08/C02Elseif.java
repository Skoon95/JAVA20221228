package Ch08;

import java.util.Scanner;

public class C02Elseif {

	public static void main(String[] args) {
		// 국어, 영어 , 수학
		//각 과목당 40점 미만 불합격
		//평균이 60미만이면 불합격
		//그게 아니라면 합격
		
		//국어<40  ->불합격
		//영어<40  ->불합격
		//수학<40  ->불합격
		//평균<60  ->불합격
		
//		Scanner sc = new Scanner(System.in);
//		int kor ,eng, mat,sum;
//		double avg=0.0;
//		 kor = sc.nextInt();
//		 eng = sc.nextInt();
//		 mat = sc.nextInt();
//		 sum=kor+eng+mat;
//		 avg=(double)sum/3;
//
//		if(kor<40) {
//			System.out.println("불합격!");
//		}
//		
//		else if(eng<40) {
//			System.out.println("불합격!");
//		}
//		
//		else if(mat<40){
//			System.out.println("불합격!");
//		}
//		else if(avg<60) {
//			System.out.println("불합격!");
//		}
//		else
//		{
//			System.out.println("합격!");
//		}
		
		//나이별로 요금을 부과하는 else if문 만드세요
		//나이는 정수값으로 입력받습니다.
		//8세미만 : 요금 1000원
		//14세미만: 요금 2000원
		//20세미만: 요금 2500원
		//20세이상: 요금 3000원
		
		Scanner sc = new Scanner(System.in);
		int age;
		age = sc.nextInt();
		
		if(age<8) {
			System.out.println("1000원 입니다");
		}
		
		else if(age>=8 && age<14) {
			System.out.println("2000원 입니다");
		}
		
		else if(age>=14 && age<20) {
			System.out.println("2500원 입니다");
		}
		
		else if(age>=20) {
			System.out.println("3000원 입니다");
		}

	}

}
