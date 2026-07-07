package javaIO;

import java.io.FileWriter;

public class WriteTextFile {

	public static void main(String[] args) throws Exception{
		
		FileWriter file = new FileWriter("D:\\IO JAVA\\YOOO.txt");
		
		file.write("Hello Rays");
		
		System.out.println("text data written successfully");
		
		file.close();
											
	}
}
