package networkTest;

import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		boolean connected = false;
		while (!connected) {
			try {
				socket = new Socket();
				System.out.println("[���� ��û]");
				socket.connect(new InetSocketAddress("localhost", 5001));
				System.out.println("[���� ����]");
				connected = true;
			} catch (Exception e) {
				System.out.println("[���� ����]");
				connected = false;
			}
		}
		OutputStream os;
		byte[] bytes_toSend;
		Scanner scn = new Scanner(System.in);
		while (connected) {
			try {
				System.out.print("�޽��� �Է� : ");
				os = socket.getOutputStream();
				bytes_toSend = scn.nextLine().getBytes();
				os.write(bytes_toSend);
				os.flush();
				System.out.println("�޽��� ������.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}