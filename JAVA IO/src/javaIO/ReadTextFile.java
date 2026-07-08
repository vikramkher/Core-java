package javaIO;

import java.io.FileReader;

public class ReadTextFile {
	
	public static void main(String[] args) throws Exception{
		
		FileReader file = new FileReader("D:\\IO JAVA\\YOOO.txt");
		
		int i = file.read();
		

		while (i != -1) {
			System.out.println((char) i + " = " + i);
			i = file.read();
		}

		file.close();

	}
	}


