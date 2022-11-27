package lambdaExpression;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("람다식이란? 객체 지향이 아닌, 함수지향 프로그래밍 기법");
		System.out.println("****** Javascript 함수와 비슷.");
		System.out.println("람다식의 장점? 클래스를 생성할 필요없이, 인터페이스 선언 후,, 빨리빨리 구현할 수 있게 해준다.");

		// 매개변수와 실행만으로 작성한다 (접근자, 반환형, return 키워드 생.략)
		LambdaInterface1 li1 = (String s1, String s2, String s3) -> {
			System.out.println(s1 + " & " + s2 + " & " + s3);
		};
		
		li1.method("Hello!", "BM", "WORLD!");
		
		
		////////////////////////////////
		// 매개변수가 1개이거나, 타입이 동일할 경우, 타입을 생략할 수 있다.
		LambdaInterface2 li2 = (s1) -> {
			System.out.println("LambdaInterface2 =>" + s1);
			
		};
		li2.method("WOW!!");
		
		// 실행문이 1개 일 때, {} 중괄호를 생략할 수 있다.
		// 매개변수가 1개 일때는 () 와 {} 를 생략할 수 있다.
		LambdaInterface2 li3 = s1 -> System.out.println("중괄호와괄호를 생략" + s1);
		li3.method("이건 중괄호, 일반괄호, 매개변수의 타입을 생략한 경우!");
		
		LambdaInterface3 li4 = () -> System.out.println("매개변수가 없는 경우");
		li4.method();
		
		
		LambdaInterface4 li5 = (x, y) -> {
			int result = x + y;
			return result;
		
		};
		
		System.out.println("lib5.method(10, 7) : " +  li5.method(10,7));
		
	}

}
