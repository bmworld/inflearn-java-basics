package abstractClass;

public class Class extends AbstractClass{
	public Class() {
		System.out.println(" Class constructor ");
	
	}
	
	public Class (int i , String s) {
		super(i, s);
	}

	@Override
	public void func2 () {
		System.out.println(" -- func2 () -- "); 
	}
	
}
