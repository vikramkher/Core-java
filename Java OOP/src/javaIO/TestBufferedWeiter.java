package javaIO;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TestBufferedWeiter {
	
	public static void main(String[] args) throws Exception {

		BufferedWriter file = new BufferedWriter(new FileWriter("D:\\IO JAVA\\BufferedReader.txt"));

		file.write("public class Hello {");
		file.newLine();
		file.write("  public static void main(String[] args) {");
		file.newLine();
		file.write("   System.out.println(\"hello world\");");
		file.newLine();
		file.write(" }" + "\n" + "}");

		System.out.println("java file write successfully");

		file.close();

	}


}
