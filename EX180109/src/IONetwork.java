import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class IONetwork {
	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("D:\\JAVACLASS\\EX180109\\src\\test.properties");
		int readByte;
		while ((readByte = in.read()) != -1) { // �� ����Ʈ ����.
			if (readByte == '\n')
				System.out.println();
			// if (readByte == '\0')
			// System.out.println("�ι��� ����.");
			System.out.print((char)readByte); // �а� ���ڷ� �ٲپ� ���.
		}
		in.close();
	}
}