package in.com.rays.encapsulation;

public class Automobile {
	
	private String color;
	private int speed;
	private String make;
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void applyBrake() {
		System.out.println("Brake applied. Vehicle slowing down...");
		speed = 0;
	}

	public void accelerate(int accelerateBy) {

		if (accelerateBy > 0) {
			speed += accelerateBy;
			System.out.println("Accelerating... Current speed: " + speed + " km/h");
		} else {
			System.out.println("Invalid acceleration value!");
		}

	}

	
}
