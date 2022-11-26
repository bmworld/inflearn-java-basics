package objectOrientedProgramming;

public class Bicycle {
	
	public String color;
	public int price;
	
	
	public Bicycle() {
		System.out.println("Bicycle constructor - I");
	}
	

	// 생성자 이름을 동일하게해서, 2개 이상 중복으로 선언할 수 있다. 신기..
	public Bicycle(String c, int p) {
		System.out.println("Bicycle constructor - II");
		this.color = c;
		this.price = p;
		System.out.println("this price: " + this.price);
	}
	
	public void info () {
		System.out.println(" -- info () ");
		System.out.println(" -- color:" + color);
		System.out.println(" -- price:" + price);
	
	}

}
