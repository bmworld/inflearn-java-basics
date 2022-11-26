package constructorAndDestructor;

public class Java_this {
	public int x;
	public int y;

	public Java_this(String s, int[] iArr) {
		System.out.println(" -- JAVA_this() --");
		System.out.println("s => " + s);
		System.out.println("iArr => " + iArr);
	}
	
	
	public Java_this (int x, int y) {
		// 매개변수를 호출될 때, 잠깐 생성되었다가 메모리에서 사라진다.
		this.x = x;
		this.y = y;
		
	}
	
	public void getInfo () {
		System.out.println(" -- JAVA_this() --");
		System.out.println("x : " + this.x);
		System.out.println("y : " + this.y);
	}

}
