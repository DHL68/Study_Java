package Do_Test;

// 추상클래스(Abstract Class)
// 인터페이스의 역할도 하면서 클래스의 기능도 가지고 있는 자바의 돌연변이 같은 클래스
// 추상클래스는 앞에 abstract 표기
// 인터페이스의 메소드와 같은 역할을 하는 메소드에도 똑같이 abstract 표기 

abstract class Predator7 extends Animal7 { // 추상클래스가 되기 위해 abstract 를 표기한다.
	abstract String getFood7(); // 메소드에도 abstract를 추가한다.

	void printFood() { // default 를 제거한다.
		System.out.printf("my food is %s/n", getFood7());
	}
	
	static int LEG_COUNT7 = 4; // 추상클래스의 상수는 static 선언이 필요하다.
	static int speed() {
		return LEG_COUNT7 * 30;
	}
}

interface Barkable7 {
	void bark7();
}

class Animal7 {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger7 extends Predator7 implements Barkable7 {
	
	public String getFood7() {
		return "apple";
	}
	
	public void bark7() {
		System.out.println("어흥");
	}
}

class Lion7 extends Predator7 implements Barkable7 {
	public String getFood7() {
		return "banana";
	}
	
	public void bark7() {
		System.out.println("으르렁");
	}
}

class ZooKeeper7 {

	void feed(Predator7 predator7) {
		System.out.println("feed " + predator7.getFood7());
	}
	
}

class Bouncer7 {

	void barkAnimal7(Barkable7 animal7) {
		animal7.bark7();
	}
}

public class A7_AbstractClass {

	public static void main(String[] args) {

		Tiger7 tiger = new Tiger7();
		Lion7 lion = new Lion7();

		Bouncer7 bouncer7 = new Bouncer7();
		bouncer7.barkAnimal7(tiger);
		bouncer7.barkAnimal7(lion);
	
	}

}
