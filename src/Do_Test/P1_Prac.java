package Do_Test;

interface Bank {

	//상수 (최대 고객에게 인출해 줄 수 있는 금액 명시)
	public int MAX_INTEGER = 10000000;
	
	//추상메소드(인출하는 메소드)
	void withDraw(int price);
	
	//추상메소드(입금하는 메소드)
	void deposit(int price);
	
	//JAVA8에서 가능한 defualt 메소드(고객의 휴면계좌 찾아주는 메소드 : 필수구현은 선택사항)
	default String findDormancyAccount(String custId){
		System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
		System.out.println("**금융결제원에서 제공하는 로직**");
		return "00은행 000-000-0000-00";
	}
	
	//JAVA8에서 가능한 정적 메소드(블록체인 인증을 요청하는 메소드)
	static void BCAuth(String bankName){
		System.out.println(bankName+" 에서 블록체인 인증을 요청합니다.");
		System.out.println("전 금융사 공통 블록체인 로직 수행");
	}
	
}

class KBBank implements Bank{

	@Override
	public void withDraw(int price) {
		System.out.print("KB은행만의 인출 로직...");
		if(price < Bank.MAX_INTEGER){
			System.out.println(price+" 원을 인출한다.");	
		}else{
			System.out.println(price+" 원을 인출실패.");	
		}
	}

	@Override
	public void deposit(int price) {
		System.out.println("KB은행만의 입금 로직..."+price+" 원을 입금한다.");
	
	}

}

class SHBank implements Bank{

	@Override
	public void withDraw(int price) {
		System.out.println("SH은행만의 인출 로직...");
		if(price < Bank.MAX_INTEGER){
			System.out.println(price+" 원을 인출한다.");	
		}else{
			System.out.println(price+" 원을 인출실패.");
		}
	}

	@Override
	public void deposit(int price) {
		System.out.println("SH은행만의 입금 로직..."+price+" 원을 입금한다.");
		System.out.println("SH은행은 별도의 후행처리 작업을 따로 한다.");
	
	}
	
	//JAVA8에서 가능한 defualt 메소드(고객의 휴면계좌 찾아주는 메소드)
	@Override
	public String findDormancyAccount(String custId){
		System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
		System.out.println("*SH은행만의 로직 적용*");
		return "00은행 000-000-0000-00";
	}

}

class KakaoBank{

	public void kakaoWithDraw(int price) {
		System.out.print("Kakao은행만의 인출 로직...");
		System.out.println(price+" 원을 인출한다.");	
	}

	public void kakaoDeposit(int price) {
		System.out.println("Kakao은행만의 입금 로직..."+price+" 원을 입금한다.");
	}
	
	public void kakaoFindDormancyAccount(){
		System.out.println("kakao은행만의 휴면계좌 찾아주기 로직");
	}

}

public class P1_Prac {

	public static void main(String[] args) {

		Bank bank = new KBBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("763231");
		Bank.BCAuth("KBBank");
		
		System.out.println("\n*************인스턴스 교체!!***************\n");
		
		bank = new SHBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		Bank.BCAuth("SHBank");
		
		System.out.println("\n*************카카오은행 연동 실패!!***************\n");
		//호환성 불가
		/*
		bank = new KakaoBank();
		bank.withDraw(100);
		bank.deposit(100);
		bank.findDormancyAccount("4311");
		*/
		
		System.out.println("\n*************대학교 주은행  교체!!***************\n");
		
		bank = new KBBank(); //new KBBank();
		bank.withDraw(20000);
		bank.deposit(1000);
		bank.findDormancyAccount("855512");
		Bank.BCAuth("SHBank");
		
	}

}


