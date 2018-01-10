package sec04.exam02_fileinputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		int data;
		try {
			FileInputStream fis = new FileInputStream("D:\\JAVACLASS\\docs.txt");
			FileOutputStream fos = new FileOutputStream("D:\\JAVACLASS\\docs-cp.txt");
			while ((data = fis.read()) != -1) { // For streaming
				System.out.write(data);
			}
			while ((data = fis.read()) != -1) { // For copying
				fos.write(data);
			}
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
