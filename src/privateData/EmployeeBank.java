package privateData;

public class EmployeeBank {

	public String name;
	static int amount = 0;
	
	
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
		System.out.println("Emploee name: " + this.name);
		System.out.println("Emploee money amount: " + amount);
		
	}
}
