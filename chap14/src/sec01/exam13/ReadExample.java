package sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/text9.txt");
		
		char[] buffer = new char[5];
		
		while(true) {
			int readCharNum = reader.read(buffer, 0, 2);
			if(readCharNum == -1) break;
			for (int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
