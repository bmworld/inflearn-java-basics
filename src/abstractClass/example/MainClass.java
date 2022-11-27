package abstractClass.example;;

public class MainClass {

	public static void main(String[] args) {
		
		Bank myBank = new MyBank("홍길동", "123-4567-89012", 10000);
		
		myBank.deposit();				// 예금 
		myBank.withdraw();				// 저축
		myBank.installmentSavings();	// 적금
		myBank.cancellation();			// 얘약
		
		System.out.println();
		
		myBank.getInfo();
		
	}
	
}
