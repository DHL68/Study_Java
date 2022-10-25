package Do_Test;

// 다형성(Polymorphism)

interface Predator6 {
	String getFood6();

	default void printFood() {
		System.out.printf("my food is %s/n", getFood6());
	}

	int LEG_COUNT6 = 4;

	static int speed() {
		return LEG_COUNT6 * 30;
	}
}

// 다형성 인터페이스 생성
interface Barkable6 {
	void bark6();
}

class Animal6 {
	String name;

	void setName(String name) {
		this.name = name;
	}
}

class Tiger6 extends Animal6 implements Predator6, Barkable6 { // 인터페이스 상속
	// 콤마(,)를 이용하여 여러개를 implements 할 수 있다.

	public String getFood6() {
		return "apple";
	}

	public void bark6() { // 동물의 종류에 따른 소리 메소드 추가
		System.out.println("어흥");
	}
}

class Lion6 extends Animal6 implements Predator6, Barkable6 {
	public String getFood6() {
		return "banana";
	}

	public void bark6() {
		System.out.println("으르렁");
	}
}

class ZooKeeper6 {

	void feed(Predator6 predator6) {
		System.out.println("feed " + predator6.getFood6());
	}

}

class Bouncer6 {
	// 다향성 추가 전
	// void barkAnimal6(Animal6 animal6) {
	// if(animal6 instanceof Tiger6) {
	// System.out.println("어흥");
	// } else if(animal6 instanceof Lion6) {
	// System.out.println("으르렁");
	// }
	// }

	// 다향성 추가 후
	void barkAnimal6(Barkable6 animal6) { // Animal 대신 Barkable6을 사용
		animal6.bark6();
	}
}

public class A6_Polymorphism {

	public static void main(String[] args) {

		Tiger6 tiger = new Tiger6();
		Lion6 lion = new Lion6();

		// 다향성
		// 예시 1
		Bouncer6 bouncer6 = new Bouncer6();
		bouncer6.barkAnimal6(tiger);
		bouncer6.barkAnimal6(lion);

	}

}
