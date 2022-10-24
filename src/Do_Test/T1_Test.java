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



// 문제 6
class Calculator_06 {
    int value; // Integer > int
    void add(int val) {
        this.value += val;
    }

    public int getValue() { // Integer > int
        return this.value;
    }
}



// 문제 7
interface Mineral {
	int getpoint();
}

class Gold implements Mineral {
	public int getpoint() {
		return 100;
	}
}

class Silver implements Mineral {
	public int getpoint() {
		return 90;
	}
}

class Bronze implements Mineral {
	public int getpoint() {
		return 80;
	}
}

class MineralCalculator {
    int value = 0;

    public void add(Mineral mineral) {
        this.value += 100;
    }

    public void add(Silver silver) {
        this.value += 90;
    }

    public void add(Bronze bronze) {
        this.value += 80;
    }

    public int getValue() {
        return this.value;
    }
}



// 문제 8
interface Predator_08 {
}

class Animal_08 {
}

class Dog_08 extends Animal_08 {
}

class Lion_08 extends Animal_08 implements Predator_08 {
}



// 문제 9
interface Predator_09 {
    String bark();
}

abstract class Animal_09 {
    public String hello() {
        return "hello";
    }
}

class Dog_09 extends Animal_09 {
}

class Lion_09 extends Animal_09 implements Predator_09 {
    public String bark() {
        return "Bark bark!!";
    }
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
		// == 배열리스트 숫자형태 a 변수 정의 1, 2, 3
		//			ArrayList<Integer> b = a;
		// == b = a?
		//			a.add(4);
		// == a 변수에 4 추가
		//			System.out.println(b.size());
		// == b 변수의 배열리스트 크기(사이즈)?
		//		}
		//	}
		
		// 나의 예상 출력 : 1, 2, 3
		// 이유 : a 변수에 추가 시 프로그램 순서에 따른 b 변수에 영향을 미치지 않음으로 b 의 출력값은 a 의 초기값이 된다.
		
		
		// 문제 6
		// 다음은 Calculator 객체를 생성하고 값을 더한 후에 그 결과값을 출력하는 예제이다. 하지만 코드를 실행하면 오류가 발생한다.
		// Calculator 클래스를 수정하여 다음의 코드에서 오류가 발생하지 않도록 하시오.
        Calculator_06 cal = new Calculator_06();
        cal.add(3);  // 여기서 NullPointerException 이 발생한다.
        System.out.println(cal.getValue());
        
        // Integer 의 잘못된 표기로 int 로 변경후 실행하면 정상 작동
		
        
        // 문제 7 못풀었다 : 문제 이해 못함
        // 다음은 광물의 가치를 계산하는 MineralCalculator 클래스와 그 사용법이 담긴 코드이다.
        // 광물 계산기는 금인 경우 100, 은인 경우 90, 구리의 경우는 80의 가치를 더하는 기능(add 메스드)이 있다.
        // 하지만 이 광물 계산기는 광물이 추가될 때마다 add 메서드를 추가해야 한다는 단점이 있다.
        // 광물이 추가되더라도 MineralCalculator 클래스를 변경할 필요가 없도록 코드를 수정하시오.
        MineralCalculator cal_07 = new MineralCalculator();
        cal_07.add(new Gold());
        cal_07.add(new Silver());
        cal_07.add(new Bronze());
        System.out.println(cal_07.getValue());  // 270 출력
        
        
        // 문제 8
        // 다음의 코드를 보고 1번, 2번, 3번, 4번, 5번 문장 중에서 오류가 발생하는 문장을 모두 찾고 오류의 원인에 대해서 설명하시오.
        Animal_08 a_08 = new Animal_08();  // 1번 pass
        Animal_08 b_08 = new Dog_08();  // 2번 pass
        Animal_08 c_08 = new Lion_08();  // 3번 pass
        Dog_08 d_08 = new Animal_08();  // 4번 error
        // 원인 : 자식 클래스가 부모 클래스를 간섭하지 못한다.
        Predator_08 e_08 = new Lion_08();  // 5번 pass?
        
        
        // 문제 9
        // 다음의 코드를 보고 1번, 2번, 3번, 4번, 5번, 6번 문장 중에서
        // 오류가 발생하는 문장을 모두 찾고 오류의 원인에 대해서 설명하시오.
        Animal_09 a_09 = new Lion_09();
        Lion_09 b_09 = new Lion_09();
        Predator_09 c_09 = new Lion_09();

        System.out.println(a_09.hello());  // 1번 pass
        System.out.println(a_09.bark());   // 2번 error
        // 원인 : 인터페이스 클래스는 클래스 지정 후 사용 가능?
        System.out.println(b_09.hello());  // 3번 pass
        System.out.println(b_09.bark());   // 4번 pass
        System.out.println(c_09.hello());  // 5번 error
        // 원인 : 추상클래스인 Animal은 인터페이스 클래스로 불러온 객체의 값을 가져올 수 없다?
        System.out.println(c_09.bark());   // 6번 pass
        
        
	}

}
