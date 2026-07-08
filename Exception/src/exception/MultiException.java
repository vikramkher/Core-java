package exception;

public class MultiException {
	
	public static void main(String[] args) {
		
		String s = "Rays";
		
		try {
			System.out.println(s.length());
			System.out.println(s.charAt(4));
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
