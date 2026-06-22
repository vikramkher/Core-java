package in.com.rays.encapsulation;

public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile car = new Automobile();
		
		car.setColor("Neon Green");
		car.setMake("BMW M3 Competition");
		car.setSpeed(200);
		System.out.println("the car is a: " + car.getMake());
		System.out.println("the colour of the car is: " + car.getColor());
		System.out.println("speed of the car: " + car.getSpeed() + "km/hr");
		
		System.out.println("\nTesting Aceeleration.....");
		car.accelerate(50);
		car.accelerate(40);
		
		System.out.println("\nApplying Brake.....");
		car.applyBrake();
		System.out.println("Current speed after brake: " + car.getSpeed() + "km/hr");

	
}
	}