package abstractClass;

public abstract class AbstractClass {
	int num;
	String str;
	String hello = "Hello!!!!!!!!!";
	

	public AbstractClass () {
		System.out.println("AbstractClass contructor");
	}
	
	public AbstractClass (int i, String s) {
		System.out.println("AbstractClass contructor");
		this.num = i;
		this.str = s;
	}
	
	public void func1 () {
		System.out.println(" -- func1() ");
	}

	
	// 추상 메서드는 상속받는 클래스에서 구현해줘야한다.
	public abstract void func2 ();
}
