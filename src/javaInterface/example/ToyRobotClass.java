package javaInterface.example;

public class ToyRobotClass implements Toy{

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("The Airplane can not walk");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The Airplane can not run");
	}

	@Override
	public void alarm() {
		// TODO Auto-generated method stub
		System.out.println("The Airplane has alarm function");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("The Airplane has no light fuction");
	}

}
