package inheritance;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		
		// 
		System.out.println("------Lecture Theme: 상속 --------");
		ParentClass prt = new ParentClass();
		
		FirstChildClass chd = new FirstChildClass();
		prt.parentFunc();
		chd.childFunc();
		///
		chd.parentFunc(); // extends를 통하 ParentClass에서 상속받을 경우에, 부모클래스의 메서드를 사용할 수 있다.
		//
//		prt.parentPrivateFunc();
		
		System.out.println("---------------");
		prt.makeFood();
		chd.makeFood();
		
		System.out.println("------Lecture Theme: 자료형 ---------");
		// ! 자료형: 클래스의 이름은 곧 데이터 타입이며,따서 클래스도 자료형에 속한다.
		// ParenClass의 데이터타입을 가진 배열을 만들기
		ParentClass[] pArr = new ParentClass[2]; // 길이가 2인 배열을 만든다. 자료형은 ParentClas로 할당.

		
		
		ParentClass c1 = new FirstChildClass();
		ParentClass c2= new SecondChildClass();
		
		pArr[0] = c1;
		pArr[1] = c2;
		
		
		System.out.println("------Lecture Theme: Object Class ---------");
		// Object Class:  모든 클래스의 최상위 클래스는
		
		
		System.out.println("------Lecture Theme: super keyword  상위클래스를 this처럼 가리킨다.---------");
	
	}

}
