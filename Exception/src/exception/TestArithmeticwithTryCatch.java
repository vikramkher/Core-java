package exception;

public class TestArithmeticwithTryCatch {
	
	public static void main(String[] args) {
		
		int k =0;
		int i = 10;
		
		try {
			double div = i/k;
			System.out.println("Div is " + div);
		} catch (ArithmeticException e) {
			System.out.println("Divided by Zero");
		}
	}

}
