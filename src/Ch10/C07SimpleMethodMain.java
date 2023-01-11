package Ch10;

import java.util.Scanner;

class Sum{
	//속성
	Scanner sc= new Scanner(System.in);
	//기능
	//인자 o, return o
	int sum1(int x, int y)
	{
		return x+y;
	}
	
	//인자 o, return x
	void sum2(int x , int y)
	{
		System.out.println("SUM2(x,y) : "+ (x+y));
	}
	
	//인자 x, return o
	int sum3()
	{
		System.out.print("SUM3(x,y): ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		return x+y;
	}
	
	//인자 x, return x
	void sum4()
	{
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int sum=n1+n2+n3;
		
		System.out.println("세 수의 합 Sum4 :"+sum);
	}
}

public class C07SimpleMethodMain {

	public static void main(String[] args) {
		
		Sum calc= new Sum();
		
		int r1= calc.sum1(10,20);
		System.out.println("R1 : "+r1);
		
		calc.sum2(10,20);
		
		int r3=calc.sum3();
		System.out.println("R3 : "+r3);
		
		calc.sum4();//sc로 세수를 입력받아 세수의 합이 console 출력

	}

}
