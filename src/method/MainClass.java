package method;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("MainClass Constructor");

		ChildClass child1 = new ChildClass("bmworld", "MALE");
		child1.getInfo();
		child1.setInfo("SBKIM", "M", 30);
		child1.getInfo();
//		child1.mySecret(); //  private method는 외부에서 호출할 수 없다.
	}
	
	

}
