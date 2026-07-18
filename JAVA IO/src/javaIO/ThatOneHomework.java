package javaIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ThatOneHomework {
	
	public static void main(String[] args) throws Exception{
		
		FileReader source = new FileReader("D:\\IO JAVA\\YOOO.txt");
		FileWriter target = new FileWriter("D:\\IO JAVA\\BufferedReader.txt");
		
		BufferedReader br = new BufferedReader(source);
		BufferedWriter bw = new BufferedWriter(target);
		
		String personalData = br.readLine();
		
		while (personalData != null) {
			if (personalData.endsWith("@gmail.com")) {
				System.out.println("Email " );
				
			}
			
		
		}
		
		
	}

	
	
}
