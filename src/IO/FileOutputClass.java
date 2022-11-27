package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputClass {
	public static void main(String[] args) {
		System.out.println("-----------------");
		System.out.println("입출력 기본클래스\n");
		System.out.println("InputStream, OutputStream: 1 Byte 단위로 데이터를 전송한다.\n");
		System.out.println("InputStream 종류: FileInputStream, DataInputStream, BufferedInputStream\n");
		System.out.println("OutputStream 종류: FileOutputStream, DataOutputStream, BufferedOutputStream\n");
		//

		System.out.println("------- 이 클래스를 실행하면, 텍스트 파일 생성됨! ---------");
		// write()
		OutputStream outputStream = null;
		try {
			
			String fileOutputPath = "/Users/bmworld/_proj/_java/inflearn-java-basics/OutputStream.txt";

			outputStream = new FileOutputStream(fileOutputPath);
			String data = "txt file by Java Output Stream";
			byte[] arr = data.getBytes();

			try {
				outputStream.write(arr, 0, 5); //  위 스트링 중에서 length 5까지만 들어간다.
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (outputStream != null)
					outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
