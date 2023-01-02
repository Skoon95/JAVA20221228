package Ch04;

public class Ch04변수자료형 {

	public static void main(String[] args) {
		//-------------------------------
		//정수 int-4byte 정수
		//-------------------------------
//		int n1 = 0b10101101; //2진수
//		int n2 = 173;        //10진정수값
//		int n3 = 0255;       //8진수
//		int n4 = 0xad;       //16진수
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);
		
		//-------------------------------
		//정수 byte-=1byte 정수 부호 O
		//-------------------------------
//		byte n1 = -128;
//		byte n2 = -30;
//		byte n3 = 30;
//		byte n4 = 127;
//		byte n5 = 128; //문제 발생 Why? 
//		byte n5 = (byte)128; //1byte는 -128~0~127까지라 byte필요 
//		System.out.printf("%d\n",n5); // -128로 출력 Why? 
		
		//-------------------------------
		//정수 short-2byte 정수 부호 O | char-2byte정수 부호x(양수만)
		//-------------------------------
//		char n1 = 65535;  //(0~2^16-1) (0~65535)
//		short n2 = 32767; // (-2^15 ~ +2^15-1)(-32768 ~ +32767)
//		
//		char n3=60000;
//		//short n4 = n3; //문제발생 Why?
//		short n4 = (short)n3; //d
//		
//		System.out.printf("%d\n",n4);
		
		//-------------------------------
		//정수 long-8byte 정수 부호 O
		//-------------------------------
//		long n1 = 10;
//		long n2 = 20L; // L,l (리터럴접미사) : long자료형사용하여 값 저장
//		
//		long n3 = 10000000000; 문제발생 Why?
//		long n4 = 10000000000L;
		
		//-------------------------------
		//실수
		//-------------------------------
		//유리수와 무리수의 통칭
		//소숫점 이하값을 가지는 수 
		//float : 4byte 실수 (6~9자리)
		//double : 8byte 실수 (15~18자리)
		
		//정밀도 확인
		//float n1 = 0.123456789;  왼쪽 float = 오른쪽 double 다르기 때문에 오류 f,F접미사 필요
//		float n1 = 0.123456789F;
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		//-------------------------------
		//단일문자 char 2byte 정수
		//-------------------------------
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1); // a= 011000001 로 저장되어있다 유니코드표 참고
//		
//		char ch2 =98;
//		System.out.println(ch2);
//		System.out.println((int)ch2); // 011000010
//		
//		char ch3 = 'b'+1;
//		System.out.println(ch3);
//		System.out.println((int)ch3); // 011000011
//		
//		byte ch4 = 'c'+2;
//		System.out.println((char)ch4);
//		System.out.println(ch4); // 011000011
//		
//		char ch5 ='가';
//		char ch6 =0xac00+1;
//		System.out.printf("%c %c\n",ch5,ch6);
//		
//		// \\u: 유니코드값 이스케이프 문자
//		System.out.printf("%c\n",'\uAC80');
//		
//		char ch7 =55220;
//		System.out.printf("%c\n",ch7);
		
		
		//-------------------------------
		//문자열 : String (클래스 자료형)
		//-------------------------------
		
		//기본자료형(원시타입)
//		byte n1;
//		short n2;
//		double n3;
//      long n4;
		
		//클래스 자료형
		//클래스자료형으로 만든변수는 '참조변수'라고 하고
		//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
//		String name = "홍길동";
//		String job = "프로그래머";
//		
//		System.out.println(name);
//		System.out.println(job);
		
		//-------------------------------
		//boolean : 논리형(true/false 저장)
		//-------------------------------
		
//		boolean flag = (10<5); //참(긍정)
//		if(flag) {
//			System.out.println("참인경우 실행");
//		}
//		else
//		{
//			System.out.println("거짓인경우 실행");
//		}
		
		



	}

}
