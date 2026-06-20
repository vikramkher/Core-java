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

	public void brake() {

		if (speed == 0) {
			System.out.println("car already stoped");
		} else {
			speed = speed - 10;
		}

	}

	public void accelerator() {

		if (speed == 250 || speed > 250) {
			System.out.println("speed limit is high please applay brake");
		} else {
			speed = speed + 10;
		}

	}

	
}
