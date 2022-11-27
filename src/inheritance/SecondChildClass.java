package inheritance;

public class SecondChildClass extends ParentClass{
	public SecondChildClass() {
		System.out.println(" --SecondChildClass constructor() --");
	}
	
	public void childFunc() {
		System.out.println("-- childFunc() --");
	}
	
	@Override // 해당 어노테이션을 붙여주면, 상위 클래스에 있는 메서드를 재정의 한 것임을 명시적으로 알리는 것이다.
	public void makeFood() {
		System.out.println("-- makeFood() in SecondChildClass --");
	}

}
