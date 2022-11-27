package javaInterface.example;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("---- interface example");
			Toy robot = new ToyRobotClass();
			Toy airplane = new ToyAirplaneClass();
			
			Toy toys[] = { robot, airplane};
			for (int i= 0; i < toys.length; i++) {
				toys[i].walk();
				toys[i].run();
				toys[i].light();
				toys[i].alarm();
				System.out.println("----");
			}
	}
}
