package String;

public class TestHeapAndLiteral {
	
	public static void main(String[] args) {
		
		String s1 = "sunrays";
		String s2 = "sunrays";
		String s3 = new String("Welcome");
		String s4 = new String ("Welcome");
		
		System.out.println(s1==s2);
		System.out.println(s3==s4);
	}

}
