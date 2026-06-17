package array;

public class TestArrayMax {
	
	
	public static void main(String[] args) {
		int[] arr = {10,13,5,128,39};
		
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max=arr[i];
				
			}
		}
		
		System.out.println("maximum: " + max);
	}
}
