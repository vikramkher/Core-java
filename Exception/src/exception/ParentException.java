package exception;

public class ParentException {
	
	public static void main(String[] args) {
		
		String s = "Rays";
		
		try {
			System.out.println(s.length());
			System.out.println(s.charAt(4));
		
		} catch (Exception e) {
			System.out.println("exception " + e.getMessage());
		}finally {
			System.out.println("Always Executed");
		}
	}

}
