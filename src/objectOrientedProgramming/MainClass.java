package objectOrientedProgramming;

public class MainClass {
	// JVM은 Main Class를 가장 먼저 실행한다.

	public static void main(String[] args) {
		Grandeur myCar1 = new Grandeur();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;

		myCar1.run();
		myCar1.stop();
		myCar1.info();

		Grandeur myCar2 = new Grandeur();
		myCar2.gear = "manuall";
		myCar2.color = "blue";
		myCar2.price = 300;

		myCar2.run();
		myCar2.stop();
		myCar2.info();
		
		
		Bicycle myBicycle = new Bicycle();
		myBicycle.color = "yellow";
		myBicycle.price = 400;
		myBicycle.info();
		
		Bicycle myBicycle2 = new Bicycle("green", 800);
//		myBicycle2.price = 279;
		myBicycle2.info();

	}

}