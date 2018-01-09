package sec02.exam01_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream(
				"D:\\JAVACLASS\\thisisjava-sourcefile\\chap18\\src\\sec02\\exam01_inputstream_read\\ReadExample1.java");
		int readByteNo; // 읽어온 바이트의 인덱스.
		byte[] readBytes = new byte[3]; // 3바이트씩 읽음.
		String data = "";
		while (true) {
			readByteNo = is.read(readBytes);
			if (readByteNo == -1)
				break;
			data += new String(readBytes, 0, readByteNo); // 3 Byte 씩 append.
			for(int clear = 0; clear < 30; clear++) {
			    System.out.println(" ") ;
			}
			System.out.println("[" + readByteNo + "]" + data);
			Thread.sleep(50);
		}
		is.close();
	}

}
