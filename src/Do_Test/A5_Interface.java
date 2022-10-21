package Do_Test;

// 인터페이스(interface)
// 클래스와 같이 .java 와 같은 단독 파일로 저장하는 것이 일반적이다.

interface Predator5 {
	String getFood5(); // 인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다. 인터페이스는 규칙이기 때문
	// 인터페이스의 메소드를 추가했다면 하단 해당하는 클래스의 메소드를 추가해준다.
	
	
	// 디폴트 메서드
	// 인터페이스의 몸통(구현체)을 가질 수 없지만, 사용한다면 실제 구현된 형태의 메소드를 가질 수 있다.
	// 사용할 때는 메소드 앞에 default 로 표기해야 한다.
	// 오버라이딩 가능
	default void printFood() {
		System.out.printf("my food is %s/n", getFood5());
	}
	
	
	// 스태틱 메소드
	// 인터페이스에 스태틱 메서드를 구현하면 '인터페이스명.스태틱메서드명' 과 같이 사용하여 일반 클래스의 스태틱 메서드를 사용하는 것과 동일하게 사용할 수 있다.
	int LEG_COUNT5 = 4; // 인터페이스 상수
	
	static int speed() {
		return LEG_COUNT5 * 30;
	}
}

class Animal5 {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Tiger5 extends Animal5 implements Predator5 { // 'implements Predator5' 문자를 붙여주어 인터페이스를 구현한다.
	public String getFood5() { // 인터페이스의 메소드는 항상 public으로 구현해야 한다.
		return "apple";
	}
}

class Lion5 extends Animal5 implements Predator5 {
	public String getFood5() {
		return "banana";
	}
}

class ZooKeeper5 {
// 	인터페이스 적용 예시
//	변경 전
//	void feed(Tiger5 tiger) { // 호랑이가 오면 사과를 던져 준다.
//		System.out.println("feed apple");
//	}
	
	
// 	변경 후
	void feed(Predator5 predator5) {
		System.out.println("feed " + predator5.getFood5());
	}
	

//	인터페이스 적용 후 위 내용으로 대체 가능
//	void feed(Lion5 lion) { // 사자가 오면 바나나를 던져 준다.
//		System.out.println("feed banana");
//	}
}

public class A5_Interface {

	public static void main(String[] args) {
		ZooKeeper5 zooKeeper5 = new ZooKeeper5();
		Tiger5 tiger = new Tiger5();
		Lion5 lion = new Lion5();
		zooKeeper5.feed(tiger);
		zooKeeper5.feed(lion);
		
		
		// 스태틱 메소드 사용
		Predator5.speed();
		System.out.println(Predator5.speed()); // LEG_COUNT(4) * 30; = 120 출력
	}

}
