package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketClass {
	public static void main(String[] args) {
		
		ServerSocket serverSk = null;
		Socket sk = null;
		
		
		
		InputStream inputStream = null;
		DataInputStream dataInputStream = null;
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;
		
		try {
			
			int port = 9000;
			serverSk = new ServerSocket(port);
			System.out.println("--- Ready to invite Client! \nlocalhost port: " + port);
			
			
			sk = serverSk.accept();
			System.out.println("--- Connected Client ! ---");
			System.out.println("socket: " + sk);
//			System.out.println("브라우저에서 localhost:9000 접속하면, 이클립스 콘솔에 socket이 찍힌다. \n단, 브라우저에서는 아무것도 안뜬다. 제공해주는게 없기 때문에.");
			
			inputStream = sk.getInputStream();
			dataInputStream = new DataInputStream(inputStream);
			
			outputStream = sk.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);
			
			while (true) {
				String clientMessage = dataInputStream.readUTF();
				System.out.println("Client Message: " + clientMessage);
				
				dataOutputStream.writeUTF("Server: 수신완료.");
				dataOutputStream.flush();
				
				if(clientMessage.equals("EXIT")) {
					dataOutputStream.writeUTF("SERVER: 서버와의 연결 종료합니다. 짜이찌앤.");
					System.out.println("클라이언트와의 연결이 종료되었씁니다.");
					break;
				};
				
			}
					
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(serverSk != null) serverSk.close();
				if(sk != null) sk.close();
				if(inputStream != null) inputStream.close();
				if(dataInputStream != null) dataInputStream.close();
				if(outputStream != null) outputStream.close();
				if(dataOutputStream != null) dataOutputStream.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
			
	}

}
