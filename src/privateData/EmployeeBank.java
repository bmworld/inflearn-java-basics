package privateData;

public class EmployeeBank {

	// Private키워드를 통해서 외부에서 수정할 수 없도록 만든다.
	private String name;
	private static int amount = 0;
	
	
	public EmployeeBank ( String name) {
		this.name = name;
		
	}
	public void saveMoney (int money) {
		amount += money;
		System.out.println("Save money > amount: " + amount);
		
	}
	public void spendMoney (int money) {
		amount -= money;
		System.out.println("Spend Money > amount: " + amount);
		
	}
	public void getBankInfo () {
		System.out.println("Employee name: " + this.name);
		System.out.println("Employee money amount: " + amount);
		
	}
}
