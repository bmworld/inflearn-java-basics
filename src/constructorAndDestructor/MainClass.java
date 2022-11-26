package constructorAndDestructor;

public class MainClass {

	public static void main(String[] args) {

		// Deafult constructor
		ObjectClass obj1 = new ObjectClass();
		// 생성자가 없더라도, 컴파일 시점에 자동으로 컴파일러가 생성된다.

		ObjectClass obj2 = new ObjectClass(10);

		int[] iArr = { 10, 20, 30 };
		ObjectClass obj3 = new ObjectClass("JAVA", iArr);

		ObjectClass obj4 = new ObjectClass();

		obj4 = new ObjectClass(); // 새로 할당됨
		obj4 = new ObjectClass(); // 새로 할당됨

		// 기존변수에 2개의 객체 새로 할당되었으므로,
		// 사용되지 않는 2개의 변수는
		// GC에 의해서, 소멸된다

		System.gc(); // 사용되지 않는 객체 소멸시키기
		// finalize는 거의 사용되지 않는다
		// 왜냐면, System.gc()를 호출하더라도, 즉시 GC가 작동하는 것이 아님
		// JAVA는 기본적으로 메모리를 개발자가 직접관리하지 않으므로,
		// JAVA가 알아서, 여유가 있을 때(-_-;?) GC를 실행한다.

		// this Keyword !!
		int ints[] = { 1, 2, 3 };
		ObjectClass obj5 = new ObjectClass(10, "Hello world ! ", ints);

		// 객체가 Garbage collector에 의해서 메모리에서 제거될 때 finalize() 메서드가 호출된다.
		
		/////////////////////////////
		/////////////////////////////
		// Java의 this
		Java_this objExample = new Java_this(10,154);
		objExample.getInfo();
		
	}
}
