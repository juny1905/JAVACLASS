package Chatter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientBackground {

	Socket socket;

	DataInputStream in;
	DataOutputStream out;

	ClientGui gui;
	String msg;

	public final void setGui(ClientGui gui) {
		this.gui = gui;
	}

	public void connect() {
		try {
			socket = new Socket("192.168.1.85", 7777);
			System.out.println("���� �����");

			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());

			while (in != null) {
				msg = in.readUTF();
				gui.appendMsg(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendMessage(String msg2) {
		try {
			out.writeUTF(msg2);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}