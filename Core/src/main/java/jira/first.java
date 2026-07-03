package jira;

public class first {
	
	 public static int numberOfSteps(int num) {
	        int steps = 0;
	        
	        while (num > 0) {
	            if (num % 2 == 0) {
	                num = num / 2;
	            } else {
	                num = num - 1;
	            }
	            steps++;
	        }
	        
	        return steps;
	    }

	 public static void main(String[] args) {
		 int testNumber = 28;
		 int result = numberOfSteps(testNumber);
		 
		 System.out.println("Number of steps for " + testNumber + " is " + result);
	}
}
