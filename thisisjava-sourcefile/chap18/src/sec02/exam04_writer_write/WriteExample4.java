package sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/test.txt");
		
		String data = "�ȳ� C++ ���α׷�";
		//writer.write(data);
		writer.write(data, 3, 3);
		
		writer.flush();
		writer.close();
	}

}
