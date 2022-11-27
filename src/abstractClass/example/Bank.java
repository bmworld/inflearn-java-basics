package abstractClass.example;;

public abstract class Bank {

	String name;
	String account;
	int totalAmount;
	
	public Bank() {
		System.out.println("Bank constructor");
	}
	
	public Bank(String name, String account, int totalAmount) {
		System.out.println("Bank constructor");
		
		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}
	
	// ����
	public void deposit() {
		System.out.println(" -- deposit() START -- ");
	}
	
	// ���
	public void withdraw() {
		System.out.println(" -- withdraw() START -- ");
	}
	
	// ����
	public abstract void installmentSavings();
	
	// �ؾ�
	public abstract void cancellation();
	
	// �������
	public void getInfo() {
		System.out.printf("name : %s\n", name);
		System.out.printf("account : %s\n", account);
		System.out.printf("totalAmount : %d\n", totalAmount);
	}
}
