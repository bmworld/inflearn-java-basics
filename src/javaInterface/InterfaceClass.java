package javaInterface;

// interface는 다형성이다 => 2개 이상의 인터페이스를 클래스에서 implements할 수 있는 것이다.
public class InterfaceClass implements InterfaceA, InterfaceB {

	public InterfaceClass () {
		System.out.println(" -- InterfaceClass constructor() -- ");
	}

	@Override
	public void funcA() {
		// TODO Auto-generated method stub
		System.out.println(" -- funcA() from interfaceA의 명세에의해 implement됨.");
	}

	
	@Override
	public void funcB() {
		// TODO Auto-generated method stub
		System.out.println(" -- funB() from interfaceB의 명세에의해 implement됨.");
	}

	

}
