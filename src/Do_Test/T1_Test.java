package Do_Test;

// 문제 1
class Calculator {
	
	int value;
	
	Calculator() {
		this.value = 0;
	}
	
	void add(int val) {
		this.value += val;
	}
	
    int getValue() {
    	return this.value;
    }
    
    
// 문제 3
    void isOdd(int val) {
    	if(val % 2 == 0) {
    		System.out.println("false");
    	}else {
    		System.out.println("true");
    	}
    }
    
    
// 문제 4
    int avg(int[] arr) {
//    	System.out.print(arr[1]); // 3
    	
    	int total = 0;
    	
    	for(int i = 0; i < arr.length; i++) {
    		add(arr[i]);
    		
    		total = this.value;
    		System.out.println(total); // 25 출력
    	}
    	
    	this.value = total / arr.length;
//    	System.out.println(this.value); // 5 출력
    	
    	return this.value;
    }
    
    
}


class UpgradeCalculator extends Calculator { // Calculator를 새로운 UpgradeCalculator에 상속
	
	void minus(int val) { // minus메소드 생성
		this.value -= val;
	}
}


// 문제 2
class MaxLimitCalculator extends Calculator {
	@Override
	int getValue() {
//		System.out.println(this.value); // 110
		if(this.value > 100) {
			this.value = 100;
			return this.value;
		}else {
			return super.getValue();
		}
	}
	

//	void 를 이용한 결과값
//	void returnValue() {
//		if(super.getValue() > 100) {
//			this.value = 100;
//		}
//	}
	
}

public class T1_Test {

	public static void main(String[] args) {
		
		// 문제 1
		Calculator calA = new Calculator();
		calA.add(10);
		System.out.println(calA.getValue()); // 10 출력
		
		// Calculator 클래스를 상속하는 UpgradeCalculator를 만들고 값을 뺄 수 있는 minus 메서드를 추가해 보자.
		// 즉 다음과 같이 동작하는 클래스를 만들어야 한다.
		UpgradeCalculator calB = new UpgradeCalculator();
		calB.add(10);
		calB.minus(3);
		System.out.println(calB.getValue()); // 10에서 7을 뺀 3을 출력
		
		
		// 문제 2
		// 객체변수 value가 100 보다 큰 값은 가질 수 없도록 제한하는 MaxLimitCalculator 클래스를 만들어 보자.
		// 즉 다음과 같이 동작해야 한다.
		MaxLimitCalculator calC = new MaxLimitCalculator();
		calC.add(50);
		calC.add(70);
//		calC.returnValue(); // void 사용
		System.out.println(calC.getValue()); // 100 출력
		
		
		// 문제 3
		// 다음의 클래스에 주어진 정수가 홀수인지 짝수인지 판별해 주는 메서드(isOdd)를 추가해 보자.
		// (홀수이면 true, 짝수면 false를 리턴해야 한다.)
		Calculator CalD = new Calculator();
		CalD.isOdd(57); // 홀수이면 true, 짝수면 false 
	
		
		// 문제 4
		// 다음 클래스에 정수 배열 또는 정수의 리스트 입력시 그 평균값을 구해 정수로 리턴하는 avg 메서드를 추가해 보자.
		int[] data = {1, 3, 5, 7, 9};
		Calculator calE = new Calculator();
		int result = calE.avg(data);
		System.out.println(result);  // 5 출력
		
		
		// 문제 5
		// 다음 프로그램의 출력결과를 예측하고 그 이유에 대해서 설명하시오.
		// import java.util.ArrayList;
		// import java.util.Arrays;
		//
		// public class Sample {
		// 		public static void main(String[] args) {
		// 			ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
		//			ArrayList<Integer> b = a;
		//			a.add(4);
		//			System.out.println(b.size());
		//		}
		//	}
		
		// 예측 출력 : 

	}

}
