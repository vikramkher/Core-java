package core.java.practicals;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first interger");
		int a = sc.nextInt();
		
		System.out.println("enter second interger");
		int b = sc.nextInt();
		
		System.out.println("your first interger is " + a);
		System.out.println("your second interger is " + b);
		
		System.out.println("please select your opr...(-,+,*,/,%)");
			String opr	= sc.next();
			
				
		switch (opr) {
		case "+":
			System.out.println("result " + (a+b));
			break;

		case "-":
		    System.out.println("result " + (a-b));
		    break;
		    
		case "*":
			System.out.println("result " + (a*b));
	        break;
	        
		case "/":
			System.out.println("result " + (a/b));
		    break;
		    
		case "%":
			System.out.println("result " + (a%b));
		    break;
		    
		
		}
		
		sc.close();
		
		
	}

}
