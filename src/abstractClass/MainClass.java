package abstractClass;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("추상클래의 정:클래스의 공통된 부분을 뽑아서 별도의 클래스를 만들어 놓고, 이것을 '상속'해서 사용한다.");
		System.out.println("--------------------------------------------------------------------------------");
		AbstractClass ex = new Class (10, "BMWORLD");
		ex.func1();
		ex.func2();
	
		System.out.println(ex.hello);
	}
}
