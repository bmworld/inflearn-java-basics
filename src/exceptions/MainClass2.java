package exceptions;

public class MainClass2 {
	public static void main(String[] args) {
		System.out.println("-----------");
		System.out.println("예외처리방법: throws\n - 예외발생 시 예외 처리를 클래스를 호출한 곳으로 넘겨버");
		MainClass2 mc2 = new MainClass2();

		try {
			mc2.firstMethod();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("EXCEPTION과 관게없이 항상 실행");
		}

	}

	public void firstMethod() throws Exception {
		secondMethod();

	}

	public void secondMethod() throws Exception {
		thirdMethod();
	}

	public void thirdMethod() throws Exception {
		System.out.println("10 / 0 ==> " + (10 / 0));
	}

}
