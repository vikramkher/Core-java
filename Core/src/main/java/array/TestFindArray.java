package array;

public class TestFindArray {
		
	public static void main(String[] args) {
		
		int[] arr = {10, 12, 16, 19, 17};
	
		int number = 17;
		 int count = 0;
		 
		 for (int i = 0; i < arr.length; i++) {
			
			 if (arr[i] == number) {
				count++;
				
			}
			 
		}
		 if (count == 0) {
			System.out.println("number does not exist");
		}
		 else {
			System.out.println("number does exist");
		}
	}
}
