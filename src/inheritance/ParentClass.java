package inheritance;


public class ParentClass {
	public ParentClass() {
		System.out.println(" --ParentClass --");
	}
	
	public void parentFunc() {
		System.out.println("-- parentFuc() --");
		this.parentPrivateFunc();
		// private 키워드가 붙은 메서드는 "해당 클래스의 내.부."에서만 접근하여서 사용할 수 있다.
	}
	
	// ! private키워드가 붙은 메서드는 상속에서 제외된다.
	
	private void parentPrivateFunc() {
		System.out.println("-- parentPrivateFuc() --");
	}
	
	public void makeFood() {
		System.out.println("-- makeFood() in ParentClass");
		
	}

}
