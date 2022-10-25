package Do_Test;

class Animal1 {
	String name;

	public void setName(String name) {
		this.name = name;

	}

}

public class A1_Class {
	public static void main(String[] args) {
		Animal1 cat = new Animal1(); // cat 객체 생성
		cat.setName("boby"); // 메소드 호출 / cat 객체에 boby 이름 생성

		Animal1 dog = new Animal1(); // dog 객체 생성
		dog.setName("happy");

		System.out.println(cat.name);
		System.out.println(dog.name);
		// name 의 객체는 공유되지 않는다.
		// 객체 변수의 값이 독립적으로 유지
		// static 을 이용하게 되면 객체 변수를 공유하도록 만들 수 있음.

	}

}
