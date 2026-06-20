package in.com.rays.encapsulation;

public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile car = new Automobile();
		
		car.setColor("neonGreen");
		car.setMake("sedan");
		car.setSpeed(200);
		System.out.println("the car is a: " + car.getMake());
		System.out.println("the colour of the car is: " + car.getColor());
		System.out.println("speed of the car: " + car.getSpeed());
		
		if(car.getSpeed()<250) {
			car.accelerator();
		}else {
			car.brake();
	}
		System.out.println("speed of car after acceleration: " + car.getSpeed());
		

	}
}
