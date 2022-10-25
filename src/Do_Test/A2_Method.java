package Do_Test;

// 똑같은 내용을 반복해서 사용할 때, 반복적으로 사용할 가치가 있는 부분이라면,
// 하나로 묶어 '어떤 입력값을 주었을 때 어떤 리턴 값을 돌려준다' 라는 식의 메소드를 작성할 수 있음

public class A2_Method {

	int sum(int a, int b) { // a, b는 매개변수
		return a + b;
	}
	// sum 메소드는 입력값으로 두개의 값(int 자료형 a, int 자료형 b)을 받으며 리턴값은 두 개의 입력값을 더한 값(int
	// 자료형)이다.

	// 메소드 4가지 유형 (메소드 설계)

	// 입력과 출력이 모두 있는 메소드
	// 리턴값받을변수 = 객체.메소드명(입력인수1, 입력인수2, ...)
	int sumA(int a, int b) {
		return a + b;
	}

	// 입력 값 - int 자료형 a, int 자료형 b
	// 리턴 값 - int 자료형

	// 입력과 출력이 모두 없는 메소드
	// 리턴값받을변수 = 객체.메소드명()
	String say() {
		return "Hi";
	}

	// 입력 값 - 없음
	// 리턴 값 - String 자료형

	// 입력은 없고 출력은 있는 메소드
	// 객체.메소드명(입력인수1, 입력인수2, ...)
	void sumB(int a, int b) {
		System.out.println(a + "과 " + b + "의 합은 " + (a + b) + "입니다.");
	}

	// 입력 값 - int 자료형 a, int 자료형 b
	// 리턴 값 - void (없음)

	// 입력은 있고 출력은 없는 메소드
	// 객체.메소드명()
	void sayC() {
		System.out.println("Hi");
	}

	// 입력 값 - 없음
	// 리턴 값 - void (없음)

	// return 의 다른 쓰임 (메소드 설계)
	void sayNick(String nick) {
		if ("fool".equals(nick)) {
			return; // 매개 변수에 fool 이 포함된다면 return 으로 빠져나온다.
		}
		System.out.println("나의 별명은 " + nick + "입니다.");
	}

	// 메소드 내에서 선언된 변수의 효력 범위
	// 메소드 안에서만 쓰이는 변수를 로컬 변수라고 부른다.
	void varTestA(int a) {
		a++; // 기능을 하지 않음
	}

	// 응용 1
	int varTestB(int b) {
		b++; // 증가시키고
		return b; // return 으로 빼줬다.
	}

	// 응용 2 (객체를 넘기는 방법)
	int c; // 객체 변수

	void varTestC(A2_Method sample) { // Sample 클래스의 객체변수로 선언
		sample.c++;
	}

	// this 활용하기
	int d; // 객체변수 d

	void varTestD() {
		this.d++;
	}
	// sample 객체를 이용하여 varTestD라는 메소드를 호출할 경우 굳이 sample 객체를 전달할 필요가 없다
	// 왜냐하면 전달하지 않더라도 varTestD 메소드는 this라는 키워드를 이용하여 객체에 접근할 수 있기 때문

	public static void main(String[] args) {
		int a = 3;
		int b = 4;

		A2_Method Method = new A2_Method(); // 클래스 이름 / 객체 이름 = new 클래스 이름();
		// 자기 자신의 객체 생성 / 클래스를 단독으로 실행시켜 테스트 할 때 자주 사용
		int c = Method.sum(a, b); // 3, 4는 인수

		System.out.println(c); // 7 출력

		// 매개변수 : 메소드에 입력으로 전달된 값을 받는 변수
		// 인수 : 메소드를 호출할 때 전달하는 입력값

		// 메소드는 들어온 입력값을 가지고 어떤 처리를 하여 적절한 리턴값을 돌려주는 블랙박스와 같다
		// 입력값 ---> 메소드(블랙박스) ----> 리턴값

		// 메소드 구조
		// 리턴자료형 메소드명(입력자료형1 매개변수1, 입력자료형2 매개변수2, ...) {
		// ...
		// return 리턴값; // 리턴자료형이 void 인 경우에는 return 문이 필요없다.
		// }

		// 메소드 4가지 유형 (메소드 사용)
		// Method sample = new Method(); 공통 클래스 사용

		// 입력과 출력이 모두 있는 메소드
		A2_Method sample = new A2_Method();
		int result = sample.sumA(3, 4);
		System.out.println(result); // 7 출력

		// 입력과 출력이 모두 없는 메소드
		String sayA = sample.say();
		System.out.println(sayA); // "Hi" 출력

		// 입력은 없고 출력은 있는 메소드
		sample.sumB(3, 4);
		// 계산된 입력값은 연산 후 결과값으로 돌아오지 않는다.
		// 아래 출력은 print 함수로 표시된 것일 뿐

		// 입력은 있고 출력은 없는 메소드
		sample.sayC();

		// return 의 다른 쓰임 (메소드 사용)
		// 특별한 경우가 필요할 때 return 을 통해 메소드를 빠져나갈 수 있다.
		sample.sayNick("angel");
		sample.sayNick("fool"); // 출력 안됨

		// 이 방법은 리턴자료형이 void인 메소드에만 해당
		// 리턴자료형이 명시되어 있는 메소드에서 return 문만 단독으로 작성하면 컴파일 오류

		// 메소드 내에서 선언된 변수의 효력 범위
		int varA = 1;
		sample.varTestA(varA);
		System.out.println(varA); // 1 출력
		// 출력이 증가되지 않고 1이 되는 이유
		// 메소드 내에서 사용되는 변수는 메소드 안에서만 쓰여지는 변수이기 때문
		// 위의 메소드에서 입력 인수를 뜻하는 변수 a는 메소드 안에서만 쓰이는 변수이지 메소드 밖의 변수 a가 아님

		// 응용 (인수값을 증가시키기)
		int varB = 1;
		varB = sample.varTestB(varB);
		System.out.println(varB); // 2 출력

		// 응용 2 (객체를 넘기는 방법)
		sample.c = 1;
		sample.varTestC(sample);
		System.out.println(sample.c);

		// this 활용하기
		sample.d = 1;
		sample.varTestD();
		System.out.println(sample.d); // 2 출력

	}

}
