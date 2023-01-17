package Ch14;

class C02Simple{
	int n1;
	static int n2;
	
	void Func1() {
		n1=10;
		n2=20;
	}
	static void Func2() {
		//n1=10;  //문제발생...Why?
		n2=20;
		int num=10;
	}
}

public class C02Static {

	public static void main(String[] args) {
		

	}

}
