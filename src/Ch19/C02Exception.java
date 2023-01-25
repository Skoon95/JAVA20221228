package Ch19;

public class C02Exception {

	public static void main(String[] args) {
		try 
		{
			//int arr[] = new int[3];
			//arr[5]=10;
			//String str=null;
			//System.out.println(str.hashCode());
			System.out.println(10/0);	//산술s오류 ArithmeticException
		}catch(Exception e) {
			System.out.println("NULL예외처리");
		}

		System.out.println("실행코드1");
		System.out.println("실행코드2");
		
		
	}

}
