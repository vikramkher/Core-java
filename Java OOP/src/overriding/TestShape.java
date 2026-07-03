package overriding;

public class TestShape {
	public static void main(String[] args) {
		
		
		Circle c = new Circle();
		
	c.setColor("red");
	c.setBorderWidth(2);
	c.setRadius(2);

	System.out.println("colour =" + c.getColor());
	System.out.println("border width" + c.getBorderWidth());
	System.out.println("circle radius"+c.getRadius());

	}

}
