package overriding;

public class ICICIBank extends Bank{

	@Override
	public String getName() {
		return "ICICIBank";
	}
	@Override
	public double interestRate() {
		return 12.10;
	

}
}
