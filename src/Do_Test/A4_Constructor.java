package Do_Test;

// 생성자(Constructor)

class Animal4 {
	String name;
	
	void setName(String name) {
		this.name = name;
	}
}

class Dog4 extends Animal4 {
	
	// 디폴트(default) 생성자
	// 생성자의 입력 항목이 없고 생성자 내부에 아무 내용이 없는 위와 같은 생성자를 디폴트 생성자
	// 클래스에 생성자가 없더라도 컴파일러는 자동으로 디폴드 생성자를 추가한다.
	Dog4() {
	}
	
	void sleep() {
		System.out.println(this.name + " zzz");
	}
}

class HouseDog4 extends Dog4 {
	
	// 생성자
	// 메소드처럼 메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메소드
	// new 클래스명(입력인수, ...)
	HouseDog4(String name) {
		this.setName(name);
	}
	
	// 생성자의 규칙
	// 클래스명과 메소드명이 동일하다.
	// 리턴타입을 정의하지 않는다. (void도 사용하지 않는다.)
	
	
	// 생성자 오버로딩(Overloading)
	// 하나의 클래스에 여러개의 입력항목이 다른 생성자를 만들 수 있다.
	HouseDog4(int type) {
		if(type == 1) {
			this.setName("yorkshire");
		} else if(type == 2) {
			this.setName("bulldog");
		}
	}
	
	void sleep() {
		System.out.println(this.name + " zzz in house");
	}
	
	void sleep(int hour) {
		System.out.println(this.name + " zzz in house for " + hour + " hours");
	}
}


public class A4_Constructor {

	public static void main(String[] args) {
		
		// 생성자
		// HouseDog4 dog = new HouseDog4();
		// 에러 발생의 이유
		// 오류가 발생하는 이유는 객체 생성 방법이 생성자의 규칙과 맞지 않기 때문
		
		HouseDog4 dog = new HouseDog4("happy"); // 생성자 호출 시 문자열을 전달해야 한다.
        System.out.println(dog.name); // happy 출력
        
                
        // 디폴트 생성자
        Dog4 DogEx = new Dog4(); // 상단의 클래스에서는 디폴트 생성자가 자동으로 생성됨
        
        
        // 생성자 오버로딩
        HouseDog4 happy = new HouseDog4("happy"); // 문자열로 생성
        // String 자료형으로 입력받는 클래스
        HouseDog4 yorkshire = new HouseDog4(1); // 숫자값으로 생성
        // int 자료형으로 입력받는 클래스
	}

}
