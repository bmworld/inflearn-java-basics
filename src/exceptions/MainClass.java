package exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		System.out.println("------------EXCEPTION : 개발자가 에러를 다룰 수 있는 에러를 지칭함. ------------------");

		Scanner scanner = new Scanner(System.in);
		int i, j;

		System.out.println("Exception BEFORE");

		try {
			System.out.println("input i : ");
			i = scanner.nextInt();
			// ---------------- 콘솔창에, 숫자 입력하셈 1.
			System.out.println("input j : ");
			j = scanner.nextInt();
			// ---------------- 콘솔창에, 숫자 입력하셈 2.
			System.out.println(" i / j = " + (i / j));

			int[] iArr = { 0, 1, 2, 3, 4 };
			int maxLength = iArr.length + 1;
			System.out.println("iArr Length: " + maxLength);
			for (int k = 0; k < maxLength; k++) {
				System.out.println("iArr[" + k + "]: " + +iArr[k]);
			}
			scanner.close();

		} catch (InputMismatchException e) {
			// ! catchs는 여러 개를 작성할 수록 , 더 예외처리가 견고해진다. 
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println("EXCEPTION MESSAGE: " + msg);
		} finally {
			System.out.println("try catch ***finally = 예외발생 여부와 관계없이 언제나 실행됨.");

		}

		// 에러가 발생한 경우, 시스템은 그대로 멈춘다 => 에러 발생지점 이후의 코드는 작동되지 않음.

		System.out.println("Exception AFTER");

	}
}
