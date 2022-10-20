package Study_DataType;

public class Number_01 {

	public static void main(String[] args) {
		// 문자열 String
		// 예시1
		String String1 = "a";
		System.out.println(String1);
		
		
		// 원시 자료형의 기본 구성
		// 예시1
		boolean result = true;
		char capital = 'c';
		int i = 1000000;
		
		
		
		// equals
		// 두개의 문자열이 동일한지를 비교하여 결과값을 리턴
		// 예시1
		String equals1 = "hello";
		String equals2 = "java";
		String equals3 = "hello";
		System.out.println(equals1.equals(equals2)); // false 출력
		System.out.println(equals1.equals(equals3)); // true 출력
		
		// equals1 과 equals2 가 같지 않기 때문에 false
		// equals1 과 equals3 이 같기 때문에 true
		
		// 예시2
		String equals4 = "hello";
		String equals5 = new String("hello");
		System.out.println(equals4.equals(equals5)); // true
		System.out.println(equals4 == equals5); // false
		
		// 문자열의 값을 비교할 때는 꼭 equals 를 사용해야 한다. (== 사용시 발생하는 경우)
		// 자료형 값은 같기 때문에 equals 로 객체를 불러 비교한 값은 true 리턴한다.
		// 값은 같더라도 서로 다른 객체이고, == 는 동일한 자료형의 판별에 사용하는 연산자이기 때문에 false 로 리턴한다.
		
		
		
		// indexOf
		// 문자열에서 특정 문자가 시작되는 위치(인덱스)를 리턴
		// 예시1
		String indexOf1 = "Hello Java";
		System.out.println(indexOf1.indexOf("Java")); // 6 출력
		
	}

}
