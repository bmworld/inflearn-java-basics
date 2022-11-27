package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocketClass {
	public static void main(String[] args) {
		
		Socket sk = null;
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		Scanner scanner = null;
		
		try {
			
			int port = 9000;
			sk = new Socket("localhost", port);
			System.out.println("--- Connection with server complete!");
			System.out.println("socket: " + sk);
			
			
			outputStream = sk.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			
			inputStream = sk.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			scanner = new Scanner(System.in);
			
			while (true) {
				System.out.println("메시지를 입력하세요.\n");
				String outputMessage = scanner.nextLine();
				
				dataOutputStream.writeUTF(outputMessage);
				dataOutputStream.flush(); // 완벽하게 스트림을 비우기 위해서 flush()를 사용
				
				String inputMessage = dataInputStream.readUTF();
				System.out.println("inputMessage: " + inputMessage);
				
				
				if(outputMessage.equals("EXIT")) {
					System.out.println("CLIENT: 접속 종료.");
					break;
				};
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(sk != null) sk.close();
				if(inputStream != null) inputStream.close();
				if(dataInputStream != null) dataInputStream.close();
				if(outputStream != null) outputStream.close();
				if(dataOutputStream != null) dataOutputStream.close();
				if(scanner != null) scanner.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
			
	}

}
