package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputClass {
	public static void main(String[] args) {
		System.out.println("-----------------");
		System.out.println("입출력 기본클래스\n");
		System.out.println("InputStream, OutputStream: 1 Byte 단위로 데이터를 전송한다.\n");
		System.out.println("InputStream 종류: FileInputStream, DataInputStream, BufferedInputStream\n");
		System.out.println("OutputStream 종류: FileOutputStream, DataOutputStream, BufferedOutputStream\n");
		//
		// read()
		InputStream inputStream = null;
		try {

			inputStream = new FileInputStream("/Users/bmworld/_proj/_java/inflearn-java-basics/helloJava.txt");
			int data = 0;
			byte[] bt = new byte[3];

			while (true) {

				try {
					data = inputStream.read(bt);
				} catch (IOException e) {
					e.printStackTrace();
				}
				if (data == -1)
					break; // 더 이상 읽을 파일이 없을 경우, -1을 받는다.

				for (int i = 0; i < bt.length; i++) {
					System.out.println("bs[" + i + "]: " + bt[i]);
				
				}
				System.out.println("---------");
//				System.out.println("ASCII data : " + data); // => 1 byte 단위로 일을 
				// American standard Code for information Interchange
				// 아스키 코드표를 검색해보면, txt파일속의 글자가 뭔지 알 수 있다.
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null)
					inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
