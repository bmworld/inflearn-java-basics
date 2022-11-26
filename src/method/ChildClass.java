package method;

public class ChildClass {
	
	public String name;
	public String gender;
	
	public int age;
	
	public ChildClass(String name, String gender) {
		System.out.println(" -- ChildClass constructor -- ");
		this.name = name;
		this.gender = gender;
	}
	
	public void getInfo () {
		System.out.println(" -- getInfo() START --");
		
		System.out.println("name: " + this.name);
		System.out.println("gender: " + this.gender);
		System.out.println("age: " + this.age);
	}
	
	public void setInfo (String n, String g, int a) {
		System.out.println(" -- setInfo() --");
		name = n;
		gender = g;
		age = a;
		mySecret();// 내부에서는 사용할 수 있다.
	}
	
	// # private 접근자 붙은 메서드는
	// 해당 => 클래스의 내부에서만 사용할 수 있다.
	
	private void mySecret() {
		System.out.println(" -- mySecret() --");
	}
	
}
