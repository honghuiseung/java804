package sec01.exam08;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("C:/Temp/text8.txt");
		
		char[] array= {'A', 'B', 'C'};
		
		writer.write(array);
		
		writer.flush();
		writer.close();
	}

}
