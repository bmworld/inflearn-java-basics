package constructorAndDestructor;

public class ObjectClass {
	int num;
	String str;
	int nums[];

	public ObjectClass() {
		System.out.println(" -- Default constructor of ObjectClass() -- ");

	}
	
	public ObjectClass (int i) {
		System.out.println("Custom constructor");
		num = i;
		
	}
	
	public ObjectClass (String s, int i []) {
		System.out.println("UserDefined constructor");
		str = s;
		nums = i;
		
	}
	
	public ObjectClass (int n, String s, int i []) {
		System.out.println("UserDefined constructor 2");
		System.out.println("s: " + s);
		System.out.println("iArr 배열객체의 메모리 주소는 : " + i);
		num = n;
		str = s;
		nums = i;		
		
	}
	
	// ObjectClas 객체가 더 이상사용되지 않을 때, GC에 의해서 소멸된다.
	// GC가 소멸할 때, 그 finalize() 메서드가 호출된다.
	
	 
	@Override
	// @Override => JAVA method() 로서,상속의 관계에 있는 클래스 간에 하위 클래스가 상위 클래스와 '완전 동일한 메소드'를 덮어쓴다는 의미이다.
	protected void finalize () throws Throwable {
		System.out.println(" -- finalize() method --");
		super.finalize();
	}

}
