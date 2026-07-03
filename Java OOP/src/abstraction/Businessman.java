package abstraction;

public class Businessman extends Person implements Richman,SocialWorker{

	@Override
	public void helpToOthers() {
		System.out.println("Help others");
		
	}

	@Override
	public void donation() {
		System.out.println("Donation");
		
	}

	@Override
	public void earnMoney() {
		System.out.println("Earn Money");
		
	}

	@Override
	public void party() {
		System.out.println("Party");
		
	}
	
	
	
	
	
	
}
