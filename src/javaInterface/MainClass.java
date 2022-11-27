package javaInterface;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("-- 학습목적: 객체가 다양한 데이터타입을 가질 수 있는 방에 대해서 학습하자.");
		System.out.println("-- Interface 클래스에서구현해야하는 작.업.ㅡ명.세.서임 / interface로 객체를 생성할 수는 없음");
		System.out.println("-- Interface 실제 구현은, interface를 implements한 Class에서 이루어짐. ");
		System.out.println("--------------------------------------------");
		
		
		InterfaceA ia = new InterfaceClass();
		InterfaceB ib = new InterfaceClass();
		// 클래스의 타입을 interface로 정의할 경우, 해당 interface에 명세된 값, 메서드만 사용가능.
		ia.funcA();
		ib.funcB();
	}

}
