package privateData;


public class MainClass {
	public static void main(String[] args) {
		
		EmployeeBank parkBank = new EmployeeBank("박찬호");
		parkBank.saveMoney(200);
		
		EmployeeBank leeBank = new EmployeeBank("이승엽");
		leeBank.saveMoney(300);
		
		leeBank.getBankInfo();
//		leeBank.name = '이름변경을 시도하지만, private속성으로 인해서 외부에서 변경할 수 없음';
		
		parkBank.spendMoney(100);
		
		leeBank.getBankInfo();
		
		////////////////////////////////
		////////////////////////////////
		////////////////////////////////
		////////////////////////////////
		////////////////////////////////
		////////////////////////////////
		// GETTER SETTER
		
		Student st1 = new Student("김만복", 90);
		Student st2 = new Student("문익점", 80);
		
		st1.getiInfo();
		st1.setScore(99);
		
		st1.getiInfo();
		
		st1.setScore(110); // setter에서 조건문을 걸어줬기 때문에, 수정이 발생하지 않는다.
		st1.getiInfo();
		
		st1.setScore(51);
		st1.getiInfo();

	}
}
