package Ch11;

class Controller{
	Member member;

	 void SetMember(Member member) {
		this.member = member;
	}
	 
	 Member getMeber() {
		 return member;
	 }

	
}

class Member{
	String name;
	int age;
	String addr;
	//모든 인자 받는 생성자(Source기능 사용해서 코드 삽입)
	public Member(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	//toString재정의(Source기능 사용해서 코드 삽입)
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
}

public class C08ClassMethod {

	public static void main(String[] args) {
		Controller con = new Controller();
		//Member hong = new Member("홍길동",40,"대구");
		//System.out.println("hong : "+hong);
		con.SetMember(new Member("홍길동",40,"대구"));
		System.out.println(con.getMeber());

	}

}
