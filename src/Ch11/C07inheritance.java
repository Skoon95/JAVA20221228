package Ch11;

class Person{
	void breath() {
		System.out.println("쉼쉬기");
	}
	void eat(){
		System.out.println("밥먹기");
	}
	void say(){
		System.out.println("말하기");
	}
}

class Student01 extends Person{ //사람 클래스를 상속한 학생 클래스
	void learn() {
		System.out.println("배우기");
	}
}

class Teacher extends Person{ //사람 클래스를 상속한 선생 클래스
	void teach() {
		System.out.println("가르치기");
	}
}
 


public class C07inheritance {

	public static void main(String[] args) {
		Student01 s1 = new Student01(); //학생 클래스 s1생성
		s1.breath();  //사람 클래스의 breath 매서드를 상속 받았음
		s1.learn();
		s1.say();
		
		Teacher t1 = new Teacher(); // 선생 클래스 t1생성
		t1.eat();  //사람 클래스의 eat 매서드를 상속 받았음
		t1.teach();
		t1.say();
		
		Person person = new Person();
		person.breath();
		//person.learn(); //자식 클래스의 매서드나 멤버 변수는 사용하지 못함
		

	}

}
